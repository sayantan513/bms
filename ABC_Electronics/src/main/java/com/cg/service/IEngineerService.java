package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.entities.Complaint;
import com.cg.entities.Engineer;

public interface IEngineerService {
    
    List<Complaint> getAllOpenComplaints(Engineer e);
    List<Complaint> getResolvedComplaints(Engineer e);
    List<Complaint> getResolvedComplaintsByDate(Engineer e, LocalDate d);
    List<Complaint> getComplaints(Engineer e, String s);
    String changeComplaintStatus(int a);
 
}
