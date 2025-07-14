package co.pawcare.service;

import co.pawcare.repository.IPetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements IPetService{

    private IPetRepository petRepository;

    public PetServiceImpl(IPetRepository petRepository){
        this.petRepository = petRepository;
    }

}