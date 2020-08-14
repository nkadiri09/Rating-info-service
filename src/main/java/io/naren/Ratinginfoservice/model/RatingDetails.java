package io.naren.Ratinginfoservice.model;

import java.util.List;

public class RatingDetails {

    private List<Rating> ratings;

    public RatingDetails(){}

    public RatingDetails(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}
