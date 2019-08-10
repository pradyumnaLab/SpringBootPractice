package com.pk.ratingdataservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.ratingdataservice.Model.Rating;
import com.pk.ratingdataservice.Model.RatingJpaDao;

@Service
public class RatingDataServiceImpl implements RatingDataService {

	public RatingDataServiceImpl() {
		super();
	}

	@Autowired
	private RatingJpaDao ratingJpaDao;

	@Override
	public List<Rating> getRatingServiceList(int userId) {
		System.out.println("Enter into Rating Data Service *****************************************");
		System.out.println("User Id"+userId);
		return ratingJpaDao.getRatingList(userId);
	}

}
