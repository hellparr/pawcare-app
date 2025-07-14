package co.pawcare.service;

import co.pawcare.entity.User;

import java.util.List;

public interface IUserService {

    void save(User user);
    List<User> findAll();
}
