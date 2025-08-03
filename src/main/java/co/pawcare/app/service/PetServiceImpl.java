package co.pawcare.app.service;

import co.pawcare.app.entity.Pet;
import co.pawcare.app.repository.IPetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void save(Pet pet) {
        petRepository.save(pet);

    }
}