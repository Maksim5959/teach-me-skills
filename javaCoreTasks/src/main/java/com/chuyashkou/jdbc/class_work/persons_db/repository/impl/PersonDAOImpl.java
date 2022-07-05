package com.chuyashkou.jdbc.class_work.persons_db.repository.impl;

import com.chuyashkou.jdbc.class_work.persons_db.connection.JDBCConnector;
import com.chuyashkou.jdbc.class_work.persons_db.model.Person;
import com.chuyashkou.jdbc.class_work.persons_db.repository.PersonDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    private static final String CREATE_PERSON = "INSERT INTO person (name, address, age) VALUES (?,?,?)";
    private static final String FIND_ALL_PERSON = "SELECT * FROM person";
    private JDBCConnector connector;

    public PersonDAOImpl(JDBCConnector connector){
        this.connector = connector;
    }

    @Override
    public List<Person> findAll() {
        List<Person> personList = new ArrayList<>();
        try (Connection connection = connector.getConnection();
             Statement statement = connection.createStatement();){
            ResultSet resultSet = statement.executeQuery(FIND_ALL_PERSON);
            while (resultSet.next()){
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                personList.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personList;
    }

    @Override
    public Person findByID(int id) {
        return null;
    }

    @Override
    public boolean create(Person person) {
        try(Connection connection = connector.getConnection();
            PreparedStatement statement = connection.prepareStatement(CREATE_PERSON);){
            statement.setString(1, person.getName());
            statement.setString(2, person.getAddress());
            statement.setInt(3, person.getAge());
            return statement.executeUpdate()==1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean deleteByID(int id) {
        return false;
    }
}
