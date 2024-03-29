package com.pk.moviecatalogservice.Resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pk.moviecatalogservice.Model.CatalogItem;
import com.pk.moviecatalogservice.Model.Movie;
import com.pk.moviecatalogservice.Model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogRespurce {

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable int userId) {
		RestTemplate restTemplate = new RestTemplate();

		// List<Rating> ratings = (List<Rating>)
		// restTemplate.getForObject("http://localhost:8083/rating/1", Rating[].class);
		ResponseEntity<List<Rating>> response = restTemplate.exchange("http://localhost:8083/rating/1", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Rating>>() {
				});
		List<Rating> ratings = response.getBody();
		List<CatalogItem> list = new ArrayList<>();
		for (Rating item : ratings) {
			Movie movie = (Movie) restTemplate.getForObject("http://localhost:8082/movies/" + item.getMovieId(), Movie.class);
			list.add(new CatalogItem(movie.getName(), movie.getReleaseYear(), item.getRating()));
		}

		
		return list;
	}
}
