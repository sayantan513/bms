package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Column(name="model_number")
	private @Id String modelNumber;
	private String productName;
	private String productCategoryName;
	private LocalDate dateOfPurchase;
	private int warrantyYears;
	private LocalDate warrantyDate;
	
	public Product() {
		
	}
	

	public Product(String modelNumber, String productName, String productCategoryName, LocalDate dateOfPurchase,
			int warrantyYears, LocalDate warrantyDate) {
		super();
		this.modelNumber = modelNumber;
		this.productName = productName;
		this.productCategoryName = productCategoryName;
		this.dateOfPurchase = dateOfPurchase;
		this.warrantyYears = warrantyYears;
		this.warrantyDate = warrantyDate;
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

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getWarrantyYears() {
		return warrantyYears;
	}

	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}

	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}

	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}

	@Override
	public String toString() {
		return "Product [modelNumber=" + modelNumber + ", productName=" + productName + ", productCategoryName="
				+ productCategoryName + ", dateOfPurchase=" + dateOfPurchase + ", warrantyYears=" + warrantyYears
				+ ", warrantyDate=" + warrantyDate + "]";
	}
	

}
