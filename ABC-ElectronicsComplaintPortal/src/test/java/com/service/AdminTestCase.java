package com.service;

import static org.assertj.core.api.Assertions.assertThat;

import javax.annotation.PostConstruct;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.entities.Engineer;
import com.cg.repository.IComplaintRepository;
import com.cg.repository.IEngineerRepository;
import com.cg.repository.IProductRepository;
import com.cg.service.IAdminServiceimpl;

class AdminTestCase {
	@Autowired
	IAdminServiceimpl iadmin;
	
	@MockBean
	IComplaintRepository icr;
	@MockBean
	IEngineerRepository repo;
	@MockBean
	IProductRepository repoe;

	@Test
	@PostConstruct
	void testAddEngineer() {
		
		Engineer c=new Engineer();
		c.setDomain("engineer");
		c.setEmployeeId(1);
		//c.setComplaints(c1);
		c.setEngineerName("eng");
		c.setPassword("bbb");
		
		
       Mockito.when(repo.save(c)).thenReturn(c);
		
		assertThat(iadmin.addEngineer(c)).isEqualTo(c);
		
		
	}

}
