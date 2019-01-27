package com.army.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "army")

public class ArmyDTO implements Serializable {
	@Id
	@GenericGenerator(name = "army", strategy = "increment")
	@GeneratedValue(generator = "army")
	@Column(name = "a_id")
	private int aid;
	@Column(name = "a_country")
	private String country;
	@Column(name = "a_type")
	private String type;
	@Column(name = "a_totalsize")
	private int totalarmysize;

	public ArmyDTO() {
		System.out.println("all are army people here");
	}

	@Override
	public String toString() {
		return "ArmyDTO [aid=" + aid + ", country=" + country + ", type=" + type + ", totalarmysize=" + totalarmysize
				+ "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotalarmysize() {
		return totalarmysize;
	}

	public void setTotalarmysize(int totalarmysize) {
		this.totalarmysize = totalarmysize;
	}

	

}
