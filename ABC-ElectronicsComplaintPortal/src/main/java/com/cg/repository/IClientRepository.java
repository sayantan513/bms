package com.cg.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entities.Client;
import com.cg.entities.Engineer;
@Repository
public interface IClientRepository extends JpaRepository <Client,Integer>{
	@Query(value="SELECT e FROM Engineer e WHERE e.domain=Category",nativeQuery = true)
	List<Engineer> getEngineerByDomain (@Param("Category") String Category);
	
}
