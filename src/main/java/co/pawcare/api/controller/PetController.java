package co.pawcare.api.controller;

import co.pawcare.api.dto.PetDto;
import co.pawcare.app.entity.Pet;
import co.pawcare.app.service.IPetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pet")
public class PetController {

    private IPetService petService;

    @GetMapping("/list")
    public ResponseEntity<List<PetDto>> listPet(){

        List<PetDto> ListPetDto = new ArrayList<>();
        for (Pet dto : petService.findAll()){

        }


        return new ResponseEntity<>()
    }


}
