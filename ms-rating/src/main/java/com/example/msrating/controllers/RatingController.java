package com.example.msrating.controllers;

import com.example.msrating.models.Rating;
import com.example.msrating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @GetMapping
    public List<Rating> findRatingsByBookId(@RequestParam(required = false, defaultValue = "0") Long bookId){
        if (bookId.equals(0L)){
            return ratingService.findAllRatings();
        }
        return ratingService.findRatingsByBookId(bookId);
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating){
        return ratingService.createRating(rating);
    }

    @DeleteMapping("/{ratingId}")
    public void deleteRating(@PathVariable Long ratingId){
        ratingService.deleteRating(ratingId);
    }

    @PutMapping("/{ratingId}")
    public Rating updateRating(@RequestBody Rating rating, @PathVariable Long ratingId){
        return ratingService.updateRating(rating, ratingId);
    }

    @PatchMapping("/{ratingId}")
    public Rating updateRating(@RequestBody Map<String, String> updates, @PathVariable Long ratingId){
        return ratingService.updateRating(updates, ratingId);
    }
}
