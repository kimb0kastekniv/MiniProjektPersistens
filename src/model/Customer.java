package model;

public class Customer {
	private int customerId;
	private String streetName;
	private int streetNo;
	private int zipcode;
	private int countryId;
	private int phone;
	private String email;
	private int customerType;

	public Customer(int customerId, String streetName, int streetNo, int zipcode, int countryId, int phone,
			String email, int customerType) {
		this.customerId = customerId;
		this.streetName = streetName;
		this.streetNo = streetNo;
		this.zipcode = zipcode;
		this.countryId = countryId;
		this.phone = phone;
		this.email = email;
		this.customerType = customerType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustomerType() {
		return customerType;
	}

	public void setCustomerType(int customerType) {
		this.customerType = customerType;
	}
}
