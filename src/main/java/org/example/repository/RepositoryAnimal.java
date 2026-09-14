package org.example.repository;

import org.example.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryAnimal extends JpaRepository<Animal,Integer> {

}
