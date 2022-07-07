package by.chuyashkou.social.connection;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPool {

    private static final AtomicBoolean isPoolCreated = new AtomicBoolean();
    private static final Lock lock = new ReentrantLock();
    private static final Integer POOL_SIZE = 5;
    private static ConnectionPool instance;
    private final BlockingQueue<Connection> connections;

    private ConnectionPool() {
        this.connections = new LinkedBlockingDeque<>(POOL_SIZE);
        for (int i = 0; i < POOL_SIZE; i++) {
            connections.offer(new JDBCConnector().getConnection());
        }
    }

    public static ConnectionPool getInstance() {
        if (!isPoolCreated.get()) {
            try {
                lock.lock();
                if (instance == null) {
                    instance = new ConnectionPool();
                    isPoolCreated.set(true);
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    @SneakyThrows
    public Connection getConnection() {
        return connections.take();
    }

    public void releaseConnection(Connection connection) {
        connections.offer(connection);
    }

    @SneakyThrows
    public void closePool() {
        while (!connections.isEmpty()) {
            Connection connection = connections.poll();
            connection.close();
        }
    }
}
