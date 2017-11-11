package com.pojo;

/**
 * Yuangong entity. @author MyEclipse Persistence Tools
 */

public class Yuangong implements java.io.Serializable {

	// Fields

	private Integer YId;
	private Bumen bumen;
	private String YName;

	// Constructors

	/** default constructor */
	public Yuangong() {
	}

	/** full constructor */
	public Yuangong(Bumen bumen, String YName) {
		this.bumen = bumen;
		this.YName = YName;
	}

	// Property accessors

	public Integer getYId() {
		return this.YId;
	}

	public void setYId(Integer YId) {
		this.YId = YId;
	}

	public Bumen getBumen() {
		return this.bumen;
	}

	public void setBumen(Bumen bumen) {
		this.bumen = bumen;
	}

	public String getYName() {
		return this.YName;
	}

	public void setYName(String YName) {
		this.YName = YName;
	}

}