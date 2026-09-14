package org.example.controller;

import org.example.model.Animal;
import org.example.model.User;
import org.example.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class ControllerUser {
    @Autowired
    private RepositoryUser repositoryUser;

    @GetMapping
    public List<User> findAll() {
        return repositoryUser.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return repositoryUser.findById(id);
    }
    @PostMapping
    public User save(@RequestBody User user) {
        return repositoryUser.save(user);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        repositoryUser.deleteById(id);
    }
}
