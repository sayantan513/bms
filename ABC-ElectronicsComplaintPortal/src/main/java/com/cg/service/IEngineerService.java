package com.cg.service;


import java.util.List;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;



public interface IEngineerService {

	public Engineer addEngineer(Engineer e);
	public List<Complaint> getAllOpenComplaints1(int engineerId);
	public List<Complaint> getResolvedComplaints1(int engineerId);
	public List<Complaint> getComplaints(int engineerId);
	public String changeComplaintStatus(int complaintId) throws Throwable; // returns updated Status;	
}
