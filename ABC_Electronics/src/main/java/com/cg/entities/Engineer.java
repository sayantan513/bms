package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engineer {
	@Column(name="employee_id")
	private @Id int employeeId;
	private String password;
	private String engineerName;
	private String domain;
	
	public Engineer() {
		
	}
	
	public Engineer(int employeeId, String password, String engineerName, String domain) {
		this.employeeId = employeeId;
		this.password = password;
		this.engineerName = engineerName;
		this.domain = domain;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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
