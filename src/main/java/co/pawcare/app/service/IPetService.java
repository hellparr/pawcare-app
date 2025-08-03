package co.pawcare.app.service;

import co.pawcare.app.entity.Pet;

import java.util.List;

public interface IPetService {
    List<Pet> findAll();


    void save(Pet pet);

}
