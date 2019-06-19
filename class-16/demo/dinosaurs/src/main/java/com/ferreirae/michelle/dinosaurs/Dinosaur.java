package com.ferreirae.michelle.dinosaurs;

import javax.persistence.*;

@Entity
public class Dinosaur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public long getId() {
        return id;
    }

    public AppUser getCreator() {
        return creator;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean getIsCarnivore() {
        return isCarnivore;
    }

    @ManyToOne
    AppUser creator;
    String name;
    String species;
    boolean isCarnivore;

}
