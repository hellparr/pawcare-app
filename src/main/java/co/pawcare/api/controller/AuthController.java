package co.pawcare.api.controller;

import co.pawcare.api.dto.UserDto;
import co.pawcare.app.service.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody UserDto userDto) {
        userService.register(userDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
