package com.sitemanagment.customerservice.model;
import lombok.Data;


@Data
public class CustomerDTO {

    public int accountNumber; 
	
	public String description;
	
	public double amount;
	
	public int customerId;
	
	public String userType;
	
	public String transactionType;
	
	public String accountType;
	
	public String formDate;
	
	public String toDate;
	
	public String payersAccountNumber;
	
	public String payeesAccountNumber;
	
	public String oldPassword;
	
	public String newPassword;

	
}
