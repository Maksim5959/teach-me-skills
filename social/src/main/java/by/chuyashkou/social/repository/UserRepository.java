package by.chuyashkou.social.repository;

import by.chuyashkou.social.model.User;

import java.util.List;

public interface UserRepository extends BaseRepository<User> {

    User findUserByLoginAndPassword(String login, String password);

    boolean deleteFollowerById(long followerId, long userId);

    List<User> findAllSubscribesById(Long id);

    boolean subscribe(long userId, long followerId);
}
