package com.starter.agesex.service;

import com.starter.agesex.model.Regions;
import com.starter.agesex.model.PopulationStrata;

import java.util.List;

public interface RegionPopulationService {
	
	List<Regions> regionPopulation();
	PopulationStrata getPopulationStrataForRegion(int regionID);
}
