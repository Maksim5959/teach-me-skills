package by.chuyashkou.social.service.impl;

import by.chuyashkou.social.model.User;
import by.chuyashkou.social.repository.UserRepository;
import by.chuyashkou.social.repository.impl.UserRepositoryImpl;
import by.chuyashkou.social.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl() {
        this.repository = new UserRepositoryImpl();
    }

    @Override
    public Map<Long, User> findAll() {
        return this.repository.findAll();
    }

    @Override
    public User findByID(long id) {
        return repository.findByID(id);
    }

    @Override
    public boolean create(User user) {
        return this.repository.create(user);
    }

    @Override
    public boolean update(User user) {
        return repository.update(user);
    }

    @Override
    public boolean deleteById(long id) {
        return this.repository.deleteById(id);
    }

    @Override
    public boolean subscribe(long userId, long followerId) {
        return repository.subscribe(userId,followerId);
    }

    @Override
    public List<User> findAllSubscribesById(Long id) {
        return repository.findAllSubscribesById(id);
    }

    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        return this.repository.findUserByLoginAndPassword(login, password);
    }

    @Override
    public boolean deleteFollowerById(long followerId, long userId) {
        return repository.deleteFollowerById(followerId, userId);
    }
}
