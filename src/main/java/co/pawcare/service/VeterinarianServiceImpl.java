package co.pawcare.service;

import co.pawcare.repository.IVeterinarianRepository;
import org.springframework.stereotype.Service;

@Service
public class VeterinarianServiceImpl implements IVeterinarian{

    private IVeterinarianRepository veterinarianRepository;

    public VeterinarianServiceImpl(IVeterinarianRepository veterinarianRepository){
        this.veterinarianRepository = veterinarianRepository;
    }
}