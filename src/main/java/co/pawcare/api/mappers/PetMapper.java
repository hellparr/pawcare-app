package co.pawcare.api.mappers;

import co.pawcare.api.dto.PetDto;
import co.pawcare.app.entity.Pet;

public class PetMapper {
    public static PetDto petToPetDto(Pet pet){
        PetDto petDto = new PetDto();
        petDto.setId(pet.getId());
        petDto.setName(pet.getName());
        petDto.setDate(pet.getDate());
        petDto.setType(pet.getType());
        petDto.setRace(pet.getRace());
        petDto.setPrimaryColour(pet.getPrimaryColour());
        petDto.setSecondColour(pet.getSecondColour());

        return petDto;
    }

    public static Pet petDtoToPet(PetDto petDto){
        Pet pet = new Pet();
        pet.setId(petDto.getId());
        pet.setName(petDto.getName());
        pet.setDate(petDto.getDate());
        if (pet.getType() != null){
            pet.setType(petDto.getType());
        }
        pet.setRace(petDto.getRace());
        pet.setPrimaryColour(petDto.getPrimaryColour());
        pet.setSecondColour(petDto.getSecondColour());

        return pet;
    }
}
