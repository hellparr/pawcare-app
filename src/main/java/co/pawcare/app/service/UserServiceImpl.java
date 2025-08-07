package co.pawcare.app.service;

import co.pawcare.api.dto.UserDto;
import co.pawcare.api.exception.BadRequestException;
import co.pawcare.api.mappers.UserMapper;
import co.pawcare.app.entity.User;
import co.pawcare.app.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    private IUserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(IUserRepository userRepository,
                           PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void save(User user){
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    /*
    /* @params userdto
    /* Se encarga de recibir un userDto y registrarlo en la BD.
     */
    @Override
    public void register(UserDto userDto) {
        // Lanza error, debido a que ya hay usuario con el email.
        if (userExistsByEmail(userDto.getEmail())){
            throw new BadRequestException("User already exists with this email");
        }

        User userSave = UserMapper.userDtoToUser(userDto);
        // Obtenemos las password en texto plano de  la peticion.
        // la encodeanos y almacenamos en la entidad User.
        userSave.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userRepository.save(userSave);
    }

    /* @params email
    /* return boolean
    /* retorna true si existe un usuario, (Optional vacio).
     */
    private boolean userExistsByEmail(String email){
        return !findByEmail(email).isEmpty();
    }


}