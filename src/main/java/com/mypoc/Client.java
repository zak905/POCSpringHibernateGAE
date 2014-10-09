package com.mypoc;

import java.io.Serializable;

public class Client implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String lastName;
	private String address;
	private String accountNumber;
	
/*public Client(String name, String lastName, String address, String accountNumber, String totalPurchases){
	this.name = name;
	this.lastName = lastName;
	this.address = address;
	this.accountNumber = accountNumber;
	this.totalPurchases = totalPurchases;
}*/

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



}
