package com.cg.service;

import java.util.List;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.exceptions.InValidDomainException;
import com.cg.exceptions.InvalidEngineerIdException;

public interface IAdminService {
	public Engineer addEngineer(Engineer e);
	public Engineer changeDomain(int engineerId,String newDomain)throws InValidDomainException,InvalidEngineerIdException;
	public String removeEngineer(int engineerId)throws InvalidEngineerIdException;
	
	public List<Complaint> getComplaintsByProducts(String productCategoryName);
	//public List<Complaint> getComplaints(String status,String productCategoryName);
	
	//public Complaint replaceEngineerFromComplaint(int complaintId)throws InValidDomainException; // replace engineer from the complaint and allocate new engineer
	List<Complaint> getComplaints(String status);
	
}
