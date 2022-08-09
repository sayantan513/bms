package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Complaint {
	@Column(name="complaint_id")
	private @Id Integer complaintId;
	private String productModelNumber;
	private String complaintName;
	private String status;
	private String clientId;
	private int engineerId;
	
	public Complaint() {
		
	}
	

	public Complaint(Integer complaintId, String productModelNumber, String complaintName, String status,String clientId, int engineerId) {
		this.complaintId = complaintId;
		this.productModelNumber = productModelNumber;
		this.complaintName = complaintName;
		this.status = status;
		this.clientId = clientId;
		this.engineerId = engineerId;
	}


	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	public String getProductModelNumber() {
		return productModelNumber;
	}

	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}

	public String getComplaintName() {
		return complaintName;
	}

	public void setComplaintName(String complaintName) {
		this.complaintName = complaintName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", productModelNumber=" + productModelNumber
				+ ", complaintName=" + complaintName + ", status=" + status + ", clientId=" + clientId + ", engineerId="
				+ engineerId + "]";
	}
	

}

