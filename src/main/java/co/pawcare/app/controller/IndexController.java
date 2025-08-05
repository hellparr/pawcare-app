package co.pawcare.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {

    @GetMapping
    public String showRegisterForm(Model model) {
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam String usuario,
                        @RequestParam String contrasena,
                        Model model) {

        // AUTENTICACIÓN SIMPLIFICADA
        if ("admin".equals(usuario) && "1234".equals(contrasena)) {
            model.addAttribute("mensaje", "Autenticación satisfactoria. ¡Bienvenido " + usuario + "!");
        } else {
            model.addAttribute("mensaje", "Error en la autenticación. Usuario o contraseña incorrectos.");
        }

        return "index";
}

}
