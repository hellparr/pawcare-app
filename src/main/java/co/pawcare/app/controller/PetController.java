package co.pawcare.app.controller;

import co.pawcare.app.entity.Pet;
import co.pawcare.app.service.IPetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/pet")
public class PetController {

    private IPetService petService;


    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("pet", new Pet());
        return "registerPet";
    }

    @PostMapping
    public String savePet (@ModelAttribute("pet") Pet pet) {
        petService.save(pet);
        return "redirect:/home";
    }

    @GetMapping("/list")
    public String listPets(Model model) {
        model.addAttribute("pets", petService.findAll());
        return "listPets";
    }
}
