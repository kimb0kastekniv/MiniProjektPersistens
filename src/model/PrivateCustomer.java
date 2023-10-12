package model;

public class PrivateCustomer  {
	private String firstName;
	private String middleName;
	private String lastName;
	private int pcId;

	public PrivateCustomer(String firstName, String middleName, String lastName, int pcId) {
	    this.firstName = firstName;
	    this.middleName = middleName;
	    this.lastName = lastName;
	    this.pcId = pcId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPcId() {
		return pcId;
	}

	public void setPcId(int pcId) {
		this.pcId = pcId;
	}
}
