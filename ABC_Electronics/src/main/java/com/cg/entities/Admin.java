package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Column(name="admin_id") 
	private @Id int adminId;
	private String password;
	private long contactNumber;
	private String emailId;
	
	public Admin() {
		
	}
	

	public Admin(int adminId, String password, long contactNumber, String emailId) {
		this.adminId = adminId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}


	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", emailId=" + emailId + "]";
	}
	
	

}

