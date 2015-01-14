package com.ecommerce.spring.repository;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="big_image")
	private byte[] bigImage;

	private String brand;

	@Column(name="createdAt")
	private Timestamp createdAt;

	private String description;

	private String especification;

	@Lob
	@Column(name="little_image")
	private byte[] littleImage;

	private String name;

	private int stock;

	@Column(name="update_time")
	private Timestamp updateTime;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getBigImage() {
		return this.bigImage;
	}

	public void setBigImage(byte[] bigImage) {
		this.bigImage = bigImage;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Timestamp getCreateTime() {
		return this.createdAt;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createdAt = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEspecification() {
		return this.especification;
	}

	public void setEspecification(String especification) {
		this.especification = especification;
	}

	public byte[] getLittleImage() {
		return this.littleImage;
	}

	public void setLittleImage(byte[] littleImage) {
		this.littleImage = littleImage;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}