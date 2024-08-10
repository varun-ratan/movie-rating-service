package com.javabrains.resources;

import com.javabrains.models.Rating;
import com.javabrains.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingResources {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
        return new Rating(movieId,4);
    }

    @GetMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId)
    {
        List<Rating> ratings= Arrays.asList(
                new Rating("1223",4),
                new Rating("777",8)
        );

        UserRating userRating=new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
