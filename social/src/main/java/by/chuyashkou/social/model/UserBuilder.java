package by.chuyashkou.social.model;

import java.util.Map;

public class UserBuilder {

    private final User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder id(long id) {
        this.user.setId(id);
        return this;
    }

    public UserBuilder fullName(String fullName) {
        this.user.setFullName(fullName);
        return this;
    }

    public UserBuilder age(int age) {
        this.user.setAge(age);
        return this;
    }

    public UserBuilder login(String login) {
        this.user.setLogin(login);
        return this;
    }

    public UserBuilder password(String password) {
        this.user.setPassword(password);
        return this;
    }

    public UserBuilder phone(String phone) {
        this.user.setPhone(phone);
        return this;
    }

    public UserBuilder email(String email) {
        this.user.setEmail(email);
        return this;
    }

    public UserBuilder address(String address) {
        this.user.setAddress(address);
        return this;
    }

    public UserBuilder gender(User.Gender gender) {
        this.user.setGender(gender);
        return this;
    }

    public UserBuilder followers(Map<Long, User> followers) {
        this.user.setFollowers(followers);
        return this;
    }

    public User build() {
        return this.user;
    }
}
