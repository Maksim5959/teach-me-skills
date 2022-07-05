package by.chuyashkou.social.repository.impl;

import by.chuyashkou.social.connection.JDBCConnector;
import by.chuyashkou.social.model.User;
import by.chuyashkou.social.model.UserBuilder;
import by.chuyashkou.social.repository.UserRepository;
import lombok.AllArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private static final String CREATE_USER = "INSERT INTO users (user_name, age, login, user_password, phone, email, address, gender) VALUES (?,?,?,?,?,?,?,?)";
    private static final String FIND_USER_BY_LOGIN_AND_PASSWORD = "SELECT * FROM users WHERE login=? AND user_password=?";
    private static final String UPDATE_USER = "UPDATE users SET user_name=?, age=?, login=?, user_password=?, phone=?, email=?, address=?, gender=?  WHERE id=?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id=?";
    private static final String FIND_FOLLOWERS_BY_ID = "SELECT * FROM users INNER JOIN followers ON users.id = followers.follower_id AND followers.user_id=?";
    private static final String DELETE_FOLLOWER_BY_ID = "DELETE FROM followers WHERE follower_id=? AND user_id=?";
    private static final String FIND_ALL_USERS = "SELECT * FROM users";
    private static final String FIND_ALL_SUBSCRIBES = "SELECT * FROM users INNER JOIN followers ON users.id = followers.user_id AND followers.follower_id=?";
    private static final String SUBSCRIBE = "INSERT INTO followers (user_id, follower_id) VALUES (?,?)";
    private static final String FIND_USER_BY_ID = "SELECT * FROM users WHERE id=?";
    private final JDBCConnector connector;

    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        User user = new User();
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_USER_BY_LOGIN_AND_PASSWORD)) {
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = getUser(resultSet);
            }
            user.setFollowers(findFollowers(user.getId()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean create(User user) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(CREATE_USER)) {
            this.setUserFields(user, statement);
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User user) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USER)) {
            this.setUserFields(user, statement);
            statement.setLong(9, user.getId());
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Map<Long, User> findAll() {
        Map<Long, User> users = new HashMap<>();
        try (Connection connection = connector.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL_USERS);
            while (resultSet.next()) {
                User user = getFollower(resultSet);
                users.put(user.getId(), user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User findByID(long id) {
        User user = new User();
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_USER_BY_ID)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                user = getFollower(resultSet);
            }
            user.setFollowers(findFollowers(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean deleteById(long id) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USER)) {
            statement.setLong(1, id);
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteFollowerById(long followerId, long userId) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_FOLLOWER_BY_ID)) {
            statement.setLong(1, followerId);
            statement.setLong(2, userId);
            return statement.executeUpdate() != 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> findAllSubscribesById(Long id) {
        List<User> users = new ArrayList<>();
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_ALL_SUBSCRIBES)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = getFollower(resultSet);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    private Map<Long, User> findFollowers(long id) {
        Map<Long, User> users = new HashMap<>();
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_FOLLOWERS_BY_ID)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                User user = getFollower(resultSet);
                users.put(user.getId(), user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean subscribe(long userId, long followerId) {
        try (Connection connection = connector.getConnection();
             PreparedStatement statement = connection.prepareStatement(SUBSCRIBE)) {
            statement.setLong(1, userId);
            statement.setLong(2, followerId);
            return statement.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void setUserFields(User user, PreparedStatement statement) throws SQLException {
        statement.setString(1, user.getFullName());
        statement.setLong(2, user.getAge());
        statement.setString(3, user.getLogin());
        statement.setString(4, user.getPassword());
        statement.setString(5, user.getPhone());
        statement.setString(6, user.getEmail());
        statement.setString(7, user.getAddress());
        statement.setString(8, user.getGender().name());
    }

    private User getUser(ResultSet resultSet) throws SQLException {
        return new UserBuilder().id(resultSet.getLong(1))
                .fullName(resultSet.getString(2))
                .age(resultSet.getInt(3))
                .login(resultSet.getString(4))
                .phone(resultSet.getString(6))
                .email(resultSet.getString(7))
                .address(resultSet.getString(8))
                .gender(User.Gender.valueOf(resultSet.getString(9)))
                .build();
    }

    private User getFollower(ResultSet resultSet) throws SQLException {
        return new UserBuilder().id(resultSet.getLong(1))
                .fullName(resultSet.getString(2))
                .age(resultSet.getInt(3))
                .login(resultSet.getString(4))
                .email(resultSet.getString(7))
                .gender(User.Gender.valueOf(resultSet.getString(9)))
                .build();
    }
}
