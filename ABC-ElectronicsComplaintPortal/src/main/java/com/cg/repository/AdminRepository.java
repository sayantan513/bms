package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
