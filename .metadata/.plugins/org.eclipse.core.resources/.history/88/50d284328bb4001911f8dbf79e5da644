package com.pk.ratingdataservice.Resource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.ratingdataservice.Model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	
	@GetMapping("/{userId}")
	public List<Rating> getRating(@PathVariable int userId) {
		
		List<Rating> ratings = new ArrayList<>();
		ratings.add(new Rating(6, 1, 1));
		ratings.add(new Rating(7, 1, 1));
		ratings.add(new Rating(8, 1, 3));
		ratings.add(new Rating(9, 1, 4));
		/*ratings.add(new Rating(5, 2, 5));
		ratings.add(new Rating(6, 2, 1));
		ratings.add(new Rating(7, 2, 2));*/
		
		return ratings;
	}

}
