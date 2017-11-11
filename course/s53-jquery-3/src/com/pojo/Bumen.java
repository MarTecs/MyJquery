package com.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Bumen entity. @author MyEclipse Persistence Tools
 */

public class Bumen implements java.io.Serializable {

	// Fields

	private Integer BId;
	private String BName;
	private Set yuangongs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bumen() {
	}

	/** full constructor */
	public Bumen(String BName, Set yuangongs) {
		this.BName = BName;
		this.yuangongs = yuangongs;
	}

	// Property accessors

	public Integer getBId() {
		return this.BId;
	}

	public void setBId(Integer BId) {
		this.BId = BId;
	}

	public String getBName() {
		return this.BName;
	}

	public void setBName(String BName) {
		this.BName = BName;
	}

	public Set getYuangongs() {
		return this.yuangongs;
	}

	public void setYuangongs(Set yuangongs) {
		this.yuangongs = yuangongs;
	}

}