package com.rajarshisg.petclinic.services;

import com.rajarshisg.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
