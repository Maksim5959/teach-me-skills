package by.chuyashkou.social.service;

import by.chuyashkou.social.model.User;

import java.util.List;

public interface UserService extends BaseService<User>{

    boolean subscribe (long userId, long followerId);

    List<User> findAllSubscribesById (Long id);

    User findUserByLoginAndPassword(String login, String password);

    boolean deleteFollowerById(long followerId, long userId);
}
