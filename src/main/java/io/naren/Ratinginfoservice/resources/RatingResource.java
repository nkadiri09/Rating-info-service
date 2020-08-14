package io.naren.Ratinginfoservice.resources;

import io.naren.Ratinginfoservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getReating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 5);
    }


}
