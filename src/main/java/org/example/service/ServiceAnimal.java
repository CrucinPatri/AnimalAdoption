package org.example.service;

import org.example.model.Animal;
import org.example.repository.RepositoryAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAnimal {
    @Autowired
    private RepositoryAnimal repositoryAnimal;

    public List<Animal> getAnimals() {
        return repositoryAnimal.findAll();
    }

    public Animal saveAnimal(Animal animal) {
        return repositoryAnimal.save(animal);
    }

    public void deleteById(Long id) {
        repositoryAnimal.deleteById(id);
    }
}
