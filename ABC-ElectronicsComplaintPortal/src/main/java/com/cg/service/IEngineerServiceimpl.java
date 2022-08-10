package com.cg.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.exceptions.InvalidEngineerIdException;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;

@Service
public class IEngineerServiceimpl implements IEngineerService {
	@Autowired
	IEngineerRepository repo;
	@Autowired
	IComplaintRepository icr;

	public Engineer addEngineer(Engineer e)
	{
		 repo.save(e);	
		 return e;
	}
	
	
	@Override
	public List<Complaint> getAllOpenComplaints1(int engineerId) {
		Supplier s1=()->new InvalidEngineerIdException("Invalid Engineer ID");
		List<Complaint> l1 = icr.getAllOpenComplaints1(engineerId);
		return l1;
	}

	@Override
	public List<Complaint> getResolvedComplaints1(int engineerId){
		Supplier s1=()->new InvalidEngineerIdException("Invalid Engineer ID");
		List<Complaint> l1 = icr.getResolvedComplaints1(engineerId);
		return l1;
	}

	@Override
	public List<Complaint> getComplaints(int engineerId) {
		List<Complaint> l1 = icr.findAllComplaints(engineerId);
		return l1;
	}

	@Override
	public String changeComplaintStatus(int complaintId) throws Throwable {
		Supplier s1=()->new InvalidEngineerIdException("Id does not Exist");
		Complaint c1 = icr.findById(complaintId).orElseThrow(s1);
		if (c1.getStatus().equalsIgnoreCase("open") ){
			c1.setStatus("resolved");
			icr.save(c1);
		}
		return "status updated";
	}
}