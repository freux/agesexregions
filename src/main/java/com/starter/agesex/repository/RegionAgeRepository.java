package com.starter.agesex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starter.agesex.model.Regions;

public interface RegionAgeRepository extends JpaRepository<Regions, Integer> {

	@Query(value = "select * from regions"
			+ " order by male desc"
			, nativeQuery = true)
	List<Regions> regionPopulation();

}
