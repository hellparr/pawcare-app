package co.pawcare.app.service;

import co.pawcare.app.entity.User;

import java.util.List;

public interface IUserService {

    void save(User user);
    List<User> findAll();
}
