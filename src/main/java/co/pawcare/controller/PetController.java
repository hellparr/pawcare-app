package co.pawcare.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/pet")
public class PetController {


    @GetMapping("/{username}")
    public ResponseEntity<String> helloWorld(@PathVariable String username){
        return new ResponseEntity<>("Hola Mi primera API: " + username, HttpStatus.OK);
    }

    @GetMapping("/listar")
    public ResponseEntity<String> listarMascotas(@RequestParam String username) {
        if (username.equals("hellen")){
            return new ResponseEntity<>("Haru, Maven, Lambda", HttpStatus.OK);
        }
        return new ResponseEntity<>("", HttpStatus.FORBIDDEN);
    }
}
