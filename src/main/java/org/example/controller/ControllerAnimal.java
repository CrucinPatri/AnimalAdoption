package org.example.controller;

import org.example.model.Animal;
import org.example.repository.RepositoryAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
public class ControllerAnimal {
    @RestController
    @RequestMapping("/api/animals")
    public class ControllerAnimals{
        @Autowired
        private RepositoryAnimal repositoryAnimal;

        //GET: Returneaza toate animalele
        @GetMapping
        public List<Animal> getAnimals(){
            return repositoryAnimal.findAll();
        }

        //POST: adauga un animal nou
        @PostMapping
        public Animal saveAnimal(@RequestBody Animal animal){
            return repositoryAnimal.save(animal);
        }

        @DeleteMapping("/{id}")
        public void deleteAnimal(@PathVariable Long id){
            repositoryAnimal.deleteById(id);
        }
    }


}
