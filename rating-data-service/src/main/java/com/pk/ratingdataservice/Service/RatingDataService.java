package com.pk.ratingdataservice.Service;

import java.util.List;

import com.pk.ratingdataservice.Model.Rating;

public interface RatingDataService {

	List<Rating> getRatingServiceList(int userId);	
}
