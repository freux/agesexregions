package com.starter.agesex.controller;

import com.starter.agesex.model.Regions;
import com.starter.agesex.service.RegionPopulationService;
import com.starter.agesex.model.PopulationStrata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegionPopulationController {
	@Autowired
	private RegionPopulationService regionPopulationService;
	
	@RequestMapping("/regionpopulation")
	@GetMapping
	public List<Regions> findAll() {
		return regionPopulationService.regionPopulation();
	}
	
/*	@RequestMapping("/regionstrata")
	public PopulationStrata findStrata(@RequestParam(value = "regionId")  */
	@RequestMapping("/regionstrata/{regionId}")
	public PopulationStrata findStrata(@PathVariable("regionId")
				int regionID) {
		return regionPopulationService.getPopulationStrataForRegion(regionID);
	}

}
