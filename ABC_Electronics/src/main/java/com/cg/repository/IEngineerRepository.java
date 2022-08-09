package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Engineer;

@Repository
public interface IEngineerRepository extends JpaRepository<Engineer,Integer> {

}
