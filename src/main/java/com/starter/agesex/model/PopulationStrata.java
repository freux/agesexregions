package com.starter.agesex.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "PopulationStrata")

public class PopulationStrata implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer regionID;
	
	@Column(name = "m0")
	private Integer m0;
	
	@Column(name = "m4")
	private Integer m4;
	
	@Column(name = "m9")
	private Integer m9;
	
	@Column(name = "m14")
	private Integer m14;
	
	@Column(name = "m19")
	private Integer m19;
	
	@Column(name = "m24")
	private Integer m24;
	
	@Column(name = "m29")
	private Integer m29;
	
	@Column(name = "m34")
	private Integer m34;
	
	@Column(name = "m39")
	private Integer m39;
	
	@Column(name = "m44")
	private Integer m44;
	
	@Column(name = "m49")
	private Integer m49;
	
	@Column(name = "m54")
	private Integer m54;
	
	@Column(name = "m59")
	private Integer m59;
	
	@Column(name = "m64")
	private Integer m64;
	
	@Column(name = "m69")
	private Integer m69;
	
	@Column(name = "m74")
	private Integer m74;
	
	@Column(name = "m79")
	private Integer m79;
	
	@Column(name = "m80plus")
	private Integer m80plus;
	
	@Column(name = "f0")
	private Integer f0;
	
	@Column(name = "f4")
	private Integer f4;
	
	@Column(name = "f9")
	private Integer f9;
	
	@Column(name = "f14")
	private Integer f14;
	
	@Column(name = "f19")
	private Integer f19;
	
	@Column(name = "f24")
	private Integer f24;
	
	@Column(name = "f29")
	private Integer f29;
	
	@Column(name = "f34")
	private Integer f34;
	
	@Column(name = "f39")
	private Integer f39;
	
	@Column(name = "f44")
	private Integer f44;
	
	@Column(name = "f49")
	private Integer f49;
	
	@Column(name = "f54")
	private Integer f54;
	
	@Column(name = "f59")
	private Integer f59;
	
	@Column(name = "f64")
	private Integer f64;
	
	@Column(name = "f69")
	private Integer f69;
	
	@Column(name = "f74")
	private Integer f74;
	
	@Column(name = "f79")
	private Integer f79;
	
	@Column(name = "f80plus")
	private Integer f80plus;
	

	public int getID() {
		return regionID;
	}

	public Integer getM0() {
		return m0;
	}

	public void setM0(Integer m0) {
		this.m0 = m0;
	}

	public Integer getM4() {
		return m4;
	}

	public void setM4(Integer m4) {
		this.m4 = m4;
	}

	public Integer getM9() {
		return m9;
	}

	public void setM9(Integer m9) {
		this.m9 = m9;
	}

	public Integer getM14() {
		return m14;
	}


	public void setM14(Integer m14) {
		this.m14 = m14;
	}


	public Integer getM19() {
		return m19;
	}


	public void setM19(Integer m19) {
		this.m19 = m19;
	}


	public Integer getM24() {
		return m24;
	}


	public void setM24(Integer m24) {
		this.m24 = m24;
	}


	public Integer getM29() {
		return m29;
	}


	public void setM29(Integer m29) {
		this.m29 = m29;
	}

	public Integer getM34() {
		return m34;
	}


	public void setM34(Integer m34) {
		this.m34 = m34;
	}


	public Integer getM39() {
		return m39;
	}


	public void setM39(Integer m39) {
		this.m39 = m39;
	}

	public Integer getM44() {
		return m44;
	}


	public void setM44(Integer m44) {
		this.m44 = m44;
	}


	public Integer getM49() {
		return m49;
	}


	public void setM49(Integer m49) {
		this.m49 = m49;
	}

	public Integer getM54() {
		return m54;
	}


	public void setM54(Integer m54) {
		this.m54 = m54;
	}


	public Integer getM59() {
		return m59;
	}


	public void setM59(Integer m59) {
		this.m59 = m59;
	}

	public Integer getM64() {
		return m64;
	}


	public void setM64(Integer m64) {
		this.m64 = m64;
	}

	public Integer getM69() {
		return m69;
	}


	public void setM69(Integer m69) {
		this.m69 = m69;
	}

	public Integer getM74() {
		return m74;
	}


	public void setM74(Integer m74) {
		this.m74 = m74;
	}

	public Integer getM79() {
		return m79;
	}


	public void setM79(Integer m79) {
		this.m79 = m79;
	}


	public Integer getM80plus() {
		return m80plus;
	}


	public void setM80plus(Integer m80plus) {
		this.m80plus = m80plus;
	}

	public Integer getF0() {
		return f0;
	}

	public void setF0(Integer f0) {
		this.f0 = f0;
	}

	public Integer getF4() {
		return f4;
	}

	public void setF4(Integer f4) {
		this.f4 = f4;
	}

	public Integer getF9() {
		return f9;
	}

	public void setF9(Integer f9) {
		this.f9 = f9;
	}


	public Integer getF14() {
		return f14;
	}


	public void setF14(Integer f14) {
		this.f14 = f14;
	}


	public Integer getF19() {
		return f19;
	}


	public void setF19(Integer f19) {
		this.f19 = f19;
	}


	public Integer getF24() {
		return f24;
	}


	public void setF24(Integer f24) {
		this.f24 = f24;
	}

	public Integer getF29() {
		return f29;
	}


	public void setF29(Integer f29) {
		this.f29 = f29;
	}


	public Integer getF34() {
		return f34;
	}


	public void setF34(Integer f34) {
		this.f34 = f34;
	}


	public Integer getF39() {
		return f39;
	}


	public void setF39(Integer f39) {
		this.f39 = f39;
	}

	public Integer getF44() {
		return f44;
	}


	public void setF44(Integer f44) {
		this.f44 = f44;
	}


	public Integer getF49() {
		return f49;
	}


	public void setF49(Integer f49) {
		this.f49 = f49;
	}

	public Integer getF54() {
		return f54;
	}


	public void setF54(Integer f54) {
		this.f54 = f54;
	}


	public Integer getF59() {
		return f59;
	}


	public void setF59(Integer f59) {
		this.f59 = f59;
	}

	public Integer getF64() {
		return f64;
	}


	public void setF64(Integer f64) {
		this.f64 = f64;
	}

	public Integer getF69() {
		return f69;
	}


	public void setF69(Integer f69) {
		this.f69 = f69;
	}

	public Integer getF74() {
		return f74;
	}


	public void setF74(Integer f74) {
		this.f74 = f74;
	}

	public Integer getF79() {
		return f79;
	}


	public void setF79(Integer f79) {
		this.f79 = f79;
	}


	public Integer getF80plus() {
		return f80plus;
	}


	public void setF80plus(Integer f80plus) {
		this.f80plus = f80plus;
	}

	
}

