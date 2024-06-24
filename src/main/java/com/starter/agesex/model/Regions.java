package com.starter.agesex.model;

import lombok.Getter;
import lombok.Setter;

import org.locationtech.jts.geom.Point;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "Regions")

public class Regions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "male")
	private Integer male;
	
	@Column(name = "female")
	private Integer female;
	
	@Column(name = "position")
	private Point position;

	public int getID() {
		return id;
	}
//	public void setID(int id) {
//		this.id = id;
//	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getMaleNum() {
		return male;
	}
	public void setMaleNum(int male) {
		this.male = male;
	}
	public int getFemaleNum() {
		return female;
	}
	public void setFemaleNum(int female) {
		this.female = female;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point geom) {
		this.position = geom;
	}

	
}
