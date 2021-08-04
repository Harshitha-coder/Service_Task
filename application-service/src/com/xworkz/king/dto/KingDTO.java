package com.xworkz.king.dto;

import java.io.Serializable;

public class KingDTO implements Serializable{

	private String name;
	private String region;
	private String dynasty;
	private double totalYearsRuled;
	private String currentQueenName;
	private int totalQueens;
	
	public KingDTO() {
		
	}

	public KingDTO(String name, String region, String dynasty, double totalYearsRuled, String currentQueenName,
			int totalQueens) {
		super();
		this.name = name;
		this.region = region;
		this.dynasty = dynasty;
		this.totalYearsRuled = totalYearsRuled;
		this.currentQueenName = currentQueenName;
		this.totalQueens = totalQueens;
	}

	@Override
	public String toString() {
		return "KingDTO [name=" + name + ", region=" + region + ", dynasty=" + dynasty + ", totalYearsRuled="
				+ totalYearsRuled + ", currentQueenName=" + currentQueenName + ", totalQueens=" + totalQueens + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentQueenName == null) ? 0 : currentQueenName.hashCode());
		result = prime * result + ((dynasty == null) ? 0 : dynasty.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalYearsRuled);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KingDTO other = (KingDTO) obj;
		if (currentQueenName == null) {
			if (other.currentQueenName != null)
				return false;
		} else if (!currentQueenName.equals(other.currentQueenName))
			return false;
		if (dynasty == null) {
			if (other.dynasty != null)
				return false;
		} else if (!dynasty.equals(other.dynasty))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(totalYearsRuled) != Double.doubleToLongBits(other.totalYearsRuled))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public String getRegion() {
		return region;
	}

	public String getDynasty() {
		return dynasty;
	}

	public double getTotalYearsRuled() {
		return totalYearsRuled;
	}

	public String getCurrentQueenName() {
		return currentQueenName;
	}

	public int getTotalQueens() {
		return totalQueens;
	}
}
