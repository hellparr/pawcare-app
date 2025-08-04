package co.pawcare.api.controller;

import co.pawcare.api.dto.PetDto;
import co.pawcare.app.service.IPetService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/pet")
public class PetApiController {


    private IPetService petService;

    @GetMapping("/list")
    public ResponseEntity<List<PetDto>> listPet(){
        List<PetDto> listPetDto = petService.findAllPetDto();
        return new ResponseEntity<>(listPetDto, HttpStatus.OK);
    }

}
