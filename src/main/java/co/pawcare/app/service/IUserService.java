package co.pawcare.app.service;

import co.pawcare.api.dto.UserDto;
import co.pawcare.app.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    void save(User user);
    List<User> findAll();
    Optional<User> findByEmail(String email);

    void register(UserDto userDto);
}
