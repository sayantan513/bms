package com.cg.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entities.Client;
import com.cg.entities.Engineer;
import com.cg.exceptions.InValidClientIdException;
import com.cg.exceptions.InvalidEngineerIdException;
import com.cg.repository.IClientRepository;
import com.cg.repository.IEngineerRepository;
@Service
public class IClientServiceimpl implements IClientService {
	
	@Autowired
	private IClientRepository repo;
	@Autowired
	private IEngineerRepository erepo;
	
	@Override
	 public Client saveClient(Client c) {
			Client c1=repo.save(c);
			return c1;
		}
	
	
	@Override
	public Client getClientByCLientId(int clientId) throws Throwable {
		
		Supplier s1=()->new InValidClientIdException("userId doesnot exist in the database");
		Client c1=repo.findById(clientId).orElseThrow(s1);
		return c1;
		
	}
	
	@Override
	public List<Client> getAllClients() {
		
		return repo.findAll();
	}
	
	
	@Override
	public Client removeClient(Client c) {
	 
	  repo.delete(c);
	  return c;
	}
	@Override
	public Engineer getEngineerById(int id) throws Throwable {
		
		Supplier s2=()->new InvalidEngineerIdException("engineer id not found");
		Engineer e1=erepo.findById(id).orElseThrow(s2);
		return e1;
	}
	@Override
	public List<Engineer> getEngineersByDomain(String category) {
		List<Engineer> le=erepo.findAll();
		return le;
	}
	@Override
	public String changeStatusOfComplaint(int complaintId) {
		
		return null;
	}
	
}
