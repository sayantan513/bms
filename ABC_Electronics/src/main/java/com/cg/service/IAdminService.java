package com.cg.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;
import com.cg.entities.Admin;

public interface IAdminService {

    void addEngineer(Engineer e);
    void changeDomain(int i,String s);
    void removeEngineer(int i);
    List<Complaint> getComplaintsByProducts(String s);
    List<Complaint> getComplaints(String a,String b);
    Complaint replaceEngineerFromComplaint(int i);
    
}
