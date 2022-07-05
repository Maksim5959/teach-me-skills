package com.chuyashkou.jdbc.class_work.persons_db.repository;

import com.chuyashkou.jdbc.class_work.persons_db.model.Person;

import java.util.List;

public interface PersonDAO extends BaseDAO<Person> {
    @Override
    List<Person> findAll();

    @Override
    Person findByID(int id);

    @Override
    boolean create(Person person);

    @Override
    boolean update(Person person);

    @Override
    boolean deleteByID(int id);
}
