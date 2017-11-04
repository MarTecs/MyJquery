package com.pojo;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Float price;
	private String image;
	private String detail;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(String name, Float price, String image, String detail) {
		this.name = name;
		this.price = price;
		this.image = image;
		this.detail = detail;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}