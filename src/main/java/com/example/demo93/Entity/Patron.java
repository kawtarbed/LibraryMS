package com.example.demo93.Entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Patron {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "patrons")
    private Set<Book> booksBorrowed;

    // Getters and setters
}