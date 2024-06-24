package com.starter.agesex.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starter.agesex.model.PopulationStrata;
import com.starter.agesex.model.Regions;
import com.starter.agesex.repository.RegionAgeRepository;
import com.starter.agesex.repository.PopulationStrataRepository;
import com.starter.agesex.service.RegionPopulationService;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@Service
public class RegionPopulationServiceImpl implements RegionPopulationService{

	@Autowired
	private RegionAgeRepository	regionAgeRepository;
	
	@Autowired
	private PopulationStrataRepository populationStrata;
	
	public List<Regions> regionPopulation() {
//		save_csv();
		return regionAgeRepository.regionPopulation();
	}
	
	public PopulationStrata getPopulationStrataForRegion(int regionID)  {
//		save_strata(regionID);
		return populationStrata.regionPopulationStrata(regionID);
	}

	
	public void save_csv() {
		
		// Read all the data from our table and store it in the response object
		List<Regions> res = regionAgeRepository.regionPopulation();
		
		if (res.isEmpty() == true) {
			System.out.println("No Data");
			
			String[] HEADERS = {"Region","Latitude","Longitude","Male","Female"};
			String fileLocation = "c:\\Developm\\Algorithms\\Java\\agesex\\src\\main\\resources\\regions.csv";
			
			try {
				Reader in = new FileReader(fileLocation);
				Iterable<CSVRecord> records = CSVFormat.DEFAULT
						.withHeader(HEADERS)
						.withFirstRecordAsHeader()
						.parse(in);
				
				for (CSVRecord record : records) {
					String region = record.get("Region");
					String male = record.get("Male");
					String female = record.get("Female");
					String latitude = record.get("Latitude");
					String longitude = record.get("Longitude");
					
					// Convert to proper data types
					Integer n_male = Integer.valueOf(male);
					Integer n_female = Integer.valueOf(female);
					Double dLatitude = Double.parseDouble(latitude);
					Double dLongitude = Double.parseDouble(longitude);
					Point geom = new GeometryFactory().createPoint(new Coordinate(dLongitude, dLatitude));
					
					// Load data into our WaterConsumption Table
					Regions wc = new Regions();
					wc.setRegion(region);
					wc.setMaleNum(n_male);
					wc.setFemaleNum(n_female);
					wc.setPosition(geom);
					regionAgeRepository.save(wc);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Data Loaded");
		}
	}

	public void save_strata(int regionID) {
		
		// Read all the data from our table and store it in the response object
		PopulationStrata strata = populationStrata.regionPopulationStrata(regionID);
		
		if (strata == null) {
			System.out.println("No Strata Data");
			
			String[] HEADERS = {"RegionID","M0","M4","M9","M14","M19","M24","M29","M34","M39","M44","M49","M54","M59","M64","M69","M74","M79","M80plus","F0","F4","F9","F14","F19","F24","F29","F34","F39","F44","F49","F54","F59","F64","F69","F74","F79","F80plus"};
			String fileLocation = "c:\\Developm\\Algorithms\\Java\\agesex\\src\\main\\resources\\fullpopulationstrata.csv";
			
			try {
				Reader in = new FileReader(fileLocation);
				Iterable<CSVRecord> records = CSVFormat.DEFAULT
						.withHeader(HEADERS)
						.withFirstRecordAsHeader()
						.parse(in);
				
				for (CSVRecord record : records) {
					String s_region = record.get("RegionID");
					String s_m0 = record.get("M0");
					String s_m4 = record.get("M4");
					String s_m9 = record.get("M9");
					String s_m14 = record.get("M14");
					String s_m19 = record.get("M19");
					String s_m24 = record.get("M24");
					String s_m29 = record.get("M29");
					String s_m34 = record.get("M34");
					String s_m39 = record.get("M39");
					String s_m44 = record.get("M44");
					String s_m49 = record.get("M49");
					String s_m54 = record.get("M54");
					String s_m59 = record.get("M59");
					String s_m64 = record.get("M64");
					String s_m69 = record.get("M69");
					String s_m74 = record.get("M74");
					String s_m79 = record.get("M79");
					String s_m80 = record.get("M80plus");
					String s_f0 = record.get("F0");
					String s_f4 = record.get("F4");
					String s_f9 = record.get("F9");
					String s_f14 = record.get("F14");
					String s_f19 = record.get("F19");
					String s_f24 = record.get("F24");
					String s_f29 = record.get("F29");
					String s_f34 = record.get("F34");
					String s_f39 = record.get("F39");
					String s_f44 = record.get("F44");
					String s_f49 = record.get("F49");
					String s_f54 = record.get("F54");
					String s_f59 = record.get("F59");
					String s_f64 = record.get("F64");
					String s_f69 = record.get("F69");
					String s_f74 = record.get("F74");
					String s_f79 = record.get("F79");
					String s_f80 = record.get("F80plus");
					
					// Convert to proper data types
					Integer m0 = Integer.valueOf(s_m0);
					Integer m4 = Integer.valueOf(s_m4);
					Integer m9 = Integer.valueOf(s_m9);
					Integer m14 = Integer.valueOf(s_m14);
					Integer m19 = Integer.valueOf(s_m19);
					Integer m24 = Integer.valueOf(s_m24);
					Integer m29 = Integer.valueOf(s_m29);
					Integer m34 = Integer.valueOf(s_m34);
					Integer m39 = Integer.valueOf(s_m39);
					Integer m44 = Integer.valueOf(s_m44);
					Integer m49 = Integer.valueOf(s_m49);
					Integer m54 = Integer.valueOf(s_m54);
					Integer m59 = Integer.valueOf(s_m59);
					Integer m64 = Integer.valueOf(s_m64);
					Integer m69 = Integer.valueOf(s_m69);
					Integer m74 = Integer.valueOf(s_m74);
					Integer m79 = Integer.valueOf(s_m79);
					Integer m80 = Integer.valueOf(s_m80);
					Integer f0 = Integer.valueOf(s_f0);
					Integer f4 = Integer.valueOf(s_f4);
					Integer f9 = Integer.valueOf(s_f9);
					Integer f14 = Integer.valueOf(s_f14);
					Integer f19 = Integer.valueOf(s_f19);
					Integer f24 = Integer.valueOf(s_f24);
					Integer f29 = Integer.valueOf(s_f29);
					Integer f34 = Integer.valueOf(s_f34);
					Integer f39 = Integer.valueOf(s_f39);
					Integer f44 = Integer.valueOf(s_f44);
					Integer f49 = Integer.valueOf(s_f49);
					Integer f54 = Integer.valueOf(s_f54);
					Integer f59 = Integer.valueOf(s_f59);
					Integer f64 = Integer.valueOf(s_f64);
					Integer f69 = Integer.valueOf(s_f69);
					Integer f74 = Integer.valueOf(s_f74);
					Integer f79 = Integer.valueOf(s_f79);
					Integer f80 = Integer.valueOf(s_f80);
					
					// Load data into PopulationStrata Table
					PopulationStrata ps = new PopulationStrata();
					ps.setM0(m0);
					ps.setM4(m4);
					ps.setM9(m9);
					ps.setM14(m14);
					ps.setM19(m19);
					ps.setM24(m24);
					ps.setM29(m29);
					ps.setM34(m34);
					ps.setM39(m39);
					ps.setM44(m44);
					ps.setM49(m49);
					ps.setM54(m54);
					ps.setM59(m59);
					ps.setM64(m64);
					ps.setM69(m69);
					ps.setM74(m74);
					ps.setM79(m79);
					ps.setM80plus(m80);
					ps.setF0(f0);
					ps.setF4(f4);
					ps.setF9(f9);
					ps.setF14(f14);
					ps.setF19(f19);
					ps.setF24(f24);
					ps.setF29(f29);
					ps.setF34(f34);
					ps.setF39(f39);
					ps.setF44(f44);
					ps.setF49(f49);
					ps.setF54(f54);
					ps.setF59(f59);
					ps.setF64(f64);
					ps.setF69(f69);
					ps.setF74(f74);
					ps.setF79(f79);
					ps.setF80plus(f80);
					populationStrata.save(ps);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Strata Data Loaded");
		}
	}
}
