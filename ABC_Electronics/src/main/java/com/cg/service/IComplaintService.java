package com.cg.service;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Client;
import com.cg.entities.Engineer;
import com.cg.entities.Product;
import com.cg.entities.Complaint;

@RestController
public interface IComplaintService {

    
    boolean bookComplaint(Client c,Complaint com,Product p);
    String changeComplaintStatus(Complaint com);
    List<Complaint> getClientAllComplaints(Client c);
    List<Complaint> getClientAllOpenComplaints(Client c);
    Engineer getEngineer(int i);
    Product getProductByComplaint(int i);
    
}

