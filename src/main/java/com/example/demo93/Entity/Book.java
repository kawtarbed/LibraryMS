package com.example.demo93.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private Date publicationDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // Getters and setters
}