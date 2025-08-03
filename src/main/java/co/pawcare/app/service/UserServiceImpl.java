package co.pawcare.app.service;

import co.pawcare.app.entity.User;
import co.pawcare.app.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    private IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user){
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


}