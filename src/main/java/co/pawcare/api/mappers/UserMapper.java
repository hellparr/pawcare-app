package co.pawcare.api.mappers;

import co.pawcare.api.dto.UserDto;
import co.pawcare.app.entity.User;

public class UserMapper {



    public static UserDto userToUserDto (User user) {
        UserDto userDto = new UserDto();
        userDto.setName(user.getName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setSite(user.getSite());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());

        return userDto;
    }

    public static User userDtoToUser(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setSite(userDto.getSite());
        user.setPassword(userDto.getPassword());
        // SI no tiene nada en el atributo role, el asignamos uno por defecto.
        user.setRole(userDto.getRole() != null ? userDto.getRole() : "USER");

        return user;
    }
}
