package com.example.msrating.repositories;

import com.example.msrating.models.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Long> {
}
