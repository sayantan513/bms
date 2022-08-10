package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import com.cg.exceptions.InValidComplaintException;




@Service
public interface IComplaintService {
	
	public boolean bookComplaints(Complaint complaint);
	List<Complaint> bookComplaint(List<Complaint> e);
    public Engineer getEngineer(int complaintId)throws InValidComplaintException;
    List<Engineer> saveEngineer(List<Engineer> e1);
	List<Product> saveProduct(List<Product> e2);
    String changeComplaintStatus(int complaintId, String status) throws Throwable;
    List<Complaint> getClientAllComplaints(String clientId);
    List<Complaint> getClientAllOpenComplaints(String clientId);
    Product getProductByComplaint(int complaintId) throws InValidComplaintException;

	
}
