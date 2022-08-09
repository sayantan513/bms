package com.cg.service;

import java.util.List;

import com.cg.entities.Engineer;
import com.cg.entities.Product;





public interface IProductService {

	public void addProduct();
	public void removeProducts(String s);
	public List<Product> getProduct(String s);
	public void updateProductWarranty(String s);
	public List<Product> getProductComplaints(String s);
	public List<Engineer> getEngineersByProduct(String s);
	
}
