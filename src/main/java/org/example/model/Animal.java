package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String species;
    private int age;
    private String status;

    //constructor gol pentru creearea bazei de date catre JPA
    public Animal(){

    }

    //constructor gol(fara id acesta este generat automat de baza de date)
    public Animal(String name, String species, int age, String status) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.status = status;
    }

    //Getters & Setters
    public Long getId(){return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSpecies() {return species;}
    public void setSpecies(String species ) {this.species = species;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
}
