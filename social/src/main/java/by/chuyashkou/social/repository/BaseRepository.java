package by.chuyashkou.social.repository;

import by.chuyashkou.social.model.User;

import java.util.Map;

public interface BaseRepository<T> {

    Map<Long, User> findAll();

    T findByID(long id);

    boolean create(T t);

    boolean update(T t);

    boolean deleteById(long id);
}
