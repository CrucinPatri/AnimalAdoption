package org.example.controller;

import org.example.model.Animal;
import org.example.service.ServiceAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/animals")
public class ControllerAnimal {

    @Autowired
    private ServiceAnimal serviceAnimal;

    @GetMapping
    public List<Animal> getAnimals() {
        return serviceAnimal.getAnimals();
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal) {
        return serviceAnimal.saveAnimal(animal);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        serviceAnimal.deleteById(id);
    }
}