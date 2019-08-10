package com.pk.ratingdataservice.Model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface RatingJpaDao extends JpaRepository<Rating, Integer>{

	@Query("select rt from Rating rt where rt.userId=:userId")
	List<Rating> getRatingList(@Param("userId") int userId);
}
