package co.pawcare.service;

import co.pawcare.entity.User;
import co.pawcare.repository.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    private IUserRepository userRepository;

    public UserServiceImpl() {
    }

    public UserServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user){
        userRepository.save(user);
    }
}