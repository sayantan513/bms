package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="engineer")
public class Engineer {
	
	@Id
	private Integer employeeId;
	private String password;
	private String engineerName;
	private String domain;
	
	public Engineer() {
		
	}
	
	public Engineer(Integer employeeId, String password, String engineerName, String domain) {
		this.employeeId = employeeId;
		this.password = password;
		this.engineerName = engineerName;
		this.domain = domain;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEngineerName() {
		return engineerName;
	}

	public void setEngineerName(String engineerName) {
		this.engineerName = engineerName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Engineer [employeeId=" + employeeId + ", password=" + password + ", engineerName=" + engineerName
				+ ", domain=" + domain + "]";
	}
	

}

