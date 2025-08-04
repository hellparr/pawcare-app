package co.pawcare.app.service;

import co.pawcare.api.dto.PetDto;
import static co.pawcare.api.mappers.PetMapper.petToPetDto;

import co.pawcare.app.entity.Pet;
import co.pawcare.app.repository.IPetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetServiceImpl implements IPetService{

    private IPetRepository petRepository;

    public PetServiceImpl(IPetRepository petRepository){
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> findAll() {
        return petRepository.findAll();
    }

    @Override
    public List<PetDto> findAllPetDto() {
        return findAll()
                .stream()
                .map(pet -> petToPetDto(pet))
                .collect(Collectors.toList());
    }

    @Override
    public void save(Pet pet) {
        petRepository.save(pet);

    }
}