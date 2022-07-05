package com.chuyashkou.jdbc.class_work.persons_db;

import com.chuyashkou.jdbc.class_work.persons_db.connection.JDBCConnector;
import com.chuyashkou.jdbc.class_work.persons_db.model.Person;
import com.chuyashkou.jdbc.class_work.persons_db.repository.impl.PersonDAOImpl;

public class Runner {

    public static void main(String[] args) {

        JDBCConnector connector1 = new JDBCConnector();
        PersonDAOImpl personDAO = new PersonDAOImpl(connector1);
        Person person = new Person("Dima", "Minsk", 39);
//        personDAO.create(person);
//
//        try (Connection con1 = connector1.getConnection()) {
//            System.out.println(con1.isClosed());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        personDAO.findAll().forEach(System.out::println);
    }
}
