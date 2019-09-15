package com.example.msrating.services;

import com.example.msrating.models.Rating;
import com.example.msrating.repositories.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> findRatingsByBookId(Long bookId) {
        return null;
    }

    public List<Rating> findAllRatings() {
        return null;

    }

    public Rating createRating(Rating rating) {
        return null;

    }

    public void deleteRating(Long ratingId) {
    }

    public Rating updateRating(Rating rating, Long ratingId) {
        return null;

    }

    public Rating updateRating(Map<String, String> updates, Long ratingId){
        return null;
    }
}
