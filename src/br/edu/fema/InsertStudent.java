package br.edu.fema;

import java.util.Date;

public class InsertStudent {
	private String tableName;
	private String firstName;
	private String lastName;
	private Integer registerNumber;
	private String address;
	private Integer addressNumber;

	public String isGetTableName() {
		return tableName;
	}
	public void setGetTableName(String tableName) {
		this.tableName = tableName;
	}	
	public String isGetFirstName() {
		return firstName;
	}
	public void setGetFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(Integer registerNumber) {
		this.registerNumber = registerNumber;
	}
	public Integer isGetAddressNumber() {
		return addressNumber;
	}
	public void setGetAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}
	public String isGetAddress() {
		return address;
	}
	public void setGetAddress(String address) {
		this.address = address;
	}
}
