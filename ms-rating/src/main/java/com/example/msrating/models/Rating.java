package com.example.msrating.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long bookid;
    private int stars;
}
