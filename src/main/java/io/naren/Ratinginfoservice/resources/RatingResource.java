package io.naren.Ratinginfoservice.resources;

import io.naren.Ratinginfoservice.model.Rating;
import io.naren.Ratinginfoservice.model.RatingDetails;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getReating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 5);
    }

    @RequestMapping("users/{userId}")
    public ResponseEntity<RatingDetails> getUserRating(){
        List<Rating> ratings = Arrays.asList(
                new Rating("1000", 9),
                new Rating("1001", 8)
        );
        RatingDetails ratingDetails = new RatingDetails();
        ratingDetails.setRatings(ratings);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Ratingheader1","HeaderValue1");
        httpHeaders.set("Ratingheader2","HeaderValue2");

        return ResponseEntity.ok().headers(httpHeaders).body(ratingDetails);
    }

}
