package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.qos.logback.core.net.server.Client;

public interface IClientRepository extends JpaRepository<Client,String> {

}
