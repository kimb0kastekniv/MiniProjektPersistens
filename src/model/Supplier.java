package model;

public class Supplier {

	private int supplierId;
	private String name;
	private String streetName;
	private int streetNo;
	private ZipCodeCity zipcode;
	private Country countryId;
	private int phoneNo;
	private String email;

	public Supplier(int supplierId, String name, String streetName, int streetNo, ZipCodeCity zipcode,
			Country countryId, int phoneNo, String email) {
		this.supplierId = supplierId;
		this.name = name;
		this.streetName = streetName;
		this.streetNo = streetNo;
		this.zipcode = zipcode;
		this.countryId = countryId;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	// Getters and Setters
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ZipCodeCity getZipcode() {
		return zipcode;
	}

	public void setZipcode(ZipCodeCity zipcode) {
		this.zipcode = zipcode;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
