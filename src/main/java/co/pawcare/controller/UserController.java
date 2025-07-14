package co.pawcare.controller;

import co.pawcare.entity.User;
import co.pawcare.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    public UserController() {
    }

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/nuevo")
    public String showRegisterForm(Model model) {
        model.addAttribute("usuario", new User());
        return "registerUser";
    }

    @PostMapping
    public String saveUser(@ModelAttribute("usuario") User user) {
        userService.save(user);
        return "redirect:/usuarios";
    }
}
