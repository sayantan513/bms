package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, String> {

}
