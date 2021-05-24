package com.example.hibernateORM;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO Class
@Entity
public class Alien {

	@Id
	private int alienId;
	private String aName;
	private String color;

	public int getAlienId() {
		return alienId;
	}

	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
