package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer> {

	
}
