package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Complaint;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint, Integer>{

}
