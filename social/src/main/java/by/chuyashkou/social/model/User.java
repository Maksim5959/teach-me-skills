package by.chuyashkou.social.model;

import lombok.Data;

import java.util.Map;

@Data
public class User {

    private long id;
    private String fullName;
    private int age;
    private String login;
    private String password;
    private String phone;
    private String email;
    private String address;
    private Gender gender;
    private Map<Long, User> followers;

    public enum Gender {
        MALE, FEMALE;
    }
}
