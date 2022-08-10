package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.exceptions.InValidDomainException;
import com.cg.exceptions.InvalidEngineerIdException;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.repository.IProductRepository;

@Service
public class IAdminServiceimpl implements IAdminService {

	@Autowired
	IEngineerRepository repo;
	@Autowired
	IComplaintRepository icr;
	@Autowired
	IProductRepository repoe;

	@Override
	public Engineer addEngineer(Engineer e) {
		repo.save(e);
		return e;

	}

	@Override
	public Engineer changeDomain(int engineerId, String newDomain)
			throws InValidDomainException, InvalidEngineerIdException {
		Engineer c = new Engineer();
		Engineer id = repo.findById(engineerId).orElseThrow();
		id.setDomain(newDomain);
		repo.save(id);

		return id;

	}

	@Override
	public String removeEngineer(int engineerId) throws InvalidEngineerIdException {
		Engineer c = new Engineer();
		Engineer id = repo.findById(engineerId).orElseThrow();
		repo.delete(id);
		return "deleted";

	}

	@Override
	public List<Complaint> getComplaintsByProducts(String productCategoryName) {
		List<Complaint> lc1 = icr.getComplaintsByProducts(productCategoryName);
		return lc1;
	}

	@Override
	public List<Complaint> getComplaints(String status) {
		List<Complaint> lc1 = icr.getComplaints(status);
		return lc1;
	}
	/*
	 * @Override public Complaint replaceEngineerFromComplaint(int complaintId)
	 * throws InValidDomainException { Complaint
	 * a1=icr.findById(complaintId).orElseThrow();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}