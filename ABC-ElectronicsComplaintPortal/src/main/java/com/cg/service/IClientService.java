package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.Client;
import com.cg.entities.Engineer;
import com.cg.exceptions.InvalidEngineerIdException;
@Service
public interface IClientService {

	Client saveClient(Client c);

	Client getClientByCLientId(int clientId) throws Throwable;
	
	List<Client> getAllClients();
	
	Engineer getEngineerById(int id) throws InvalidEngineerIdException, Throwable;
   
	Client removeClient(Client c);
    
	List<Engineer> getEngineersByDomain(String category);
	
	String changeStatusOfComplaint(int complaintId);

}
