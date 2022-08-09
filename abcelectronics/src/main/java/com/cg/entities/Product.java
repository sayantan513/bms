package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Hello my name is siddharth
@Entity
@Table(name="product")
public class Product{

    @Id
	private String modelNumber;
	private String productName;
	private String productCategoryName;
	private LocalDate dateofPurchase;
	private Integer warrentyYears;
	private LocalDate warrentyDate;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String modelNumber, String productName, String productCategoryName, LocalDate dateofPurchase,
			Integer warrentyYears, LocalDate warrentyDate) {
		super();
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.dateofPurchase = dateofPurchase;
		this.warrentyYears = warrentyYears;
		this.warrentyDate = warrentyDate;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public LocalDate getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(LocalDate dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public Integer getWarrentyYears() {
		return warrentyYears;
	}
	public void setWarrentyYears(Integer warrentyYears) {
		this.warrentyYears = warrentyYears;
	}
	public LocalDate getWarrentyDate() {
		return warrentyDate;
	}
	public void setWarrentyDate(LocalDate warrentyDate) {
		this.warrentyDate = warrentyDate;
	}
	
	@Override
	public String toString() {
		return "Product [modelNumber=" + modelNumber + ", productName=" + productName + ", productCategoryName="
				+ productCategoryName + ", dateofPurchase=" + dateofPurchase + ", warrentyYears=" + warrentyYears
				+ ", warrentyDate=" + warrentyDate + "]";
	}
	
	
	
	
}
