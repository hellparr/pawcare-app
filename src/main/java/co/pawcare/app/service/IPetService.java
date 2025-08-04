package co.pawcare.app.service;

import co.pawcare.api.dto.PetDto;
import co.pawcare.app.entity.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> findAll();
    List<PetDto> findAllPetDto();

    void save(Pet pet);

}
