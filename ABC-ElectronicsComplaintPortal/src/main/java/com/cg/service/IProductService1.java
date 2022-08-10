
  package com.cg.service;
  
  import java.util.List;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import com.cg.exceptions.InValidModelNumberException;
  
  public interface IProductService1 {
  
  public Product addProduct(Product product);
  public String deleteProduct(Product product ); 
  public List<Product> getProduct();
  
  public Product updateModelNumber(Product p)throws InValidModelNumberException;
  
  public List<Complaint> getProductComplaints(String productCategoryName);
  public List<Engineer> getEngineersByProduct(String productCategoryName);

  
  
  
  }
 
