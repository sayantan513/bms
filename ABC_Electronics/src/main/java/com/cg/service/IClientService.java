package com.cg.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Client;
import com.cg.entities.Engineer;

public interface IClientService {

    void saveClient(Client c);
    Client getClientById(int i);
    Engineer getEngineerById(int i);
    List<Engineer> getEngineersByDomain(String s);
    String ChangeStatusOfComplaint(int i);
    Client signIn(Client c);
    Client signOut(Client c);
        
}
