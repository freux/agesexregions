package com.starter.agesex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starter.agesex.model.PopulationStrata;

public interface PopulationStrataRepository extends JpaRepository<PopulationStrata, Integer> {

	@Query(value = "select * from populationstrata"
			+ " where regionID=?1"
			, nativeQuery = true)
	PopulationStrata regionPopulationStrata(int regionID);
/*
 * Using Naming Parameters:
 @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
  User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);
	
*/
}

