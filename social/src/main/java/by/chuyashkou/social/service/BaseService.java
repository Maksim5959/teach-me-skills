package by.chuyashkou.social.service;

import by.chuyashkou.social.model.User;

import java.util.Map;

public interface BaseService<T> {

    Map<Long, User> findAll();

    T findByID(long id);

    boolean create(T t);

    boolean update(T t);

    boolean deleteById(long id);
}
