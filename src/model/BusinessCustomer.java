package model;

public class BusinessCustomer {
	private String businessName;
	private int bcId;
	private int cvr;
	private int discount;

	public BusinessCustomer(String businessName, int bcid, int discount) {
		this.businessName = businessName;
		this.bcId = bcId;
		this.cvr = cvr;
		this.discount = discount;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public int getBcId() {
		return bcId;
	}

	public void setBcId(int bcId) {
		this.bcId = bcId;
	}

	public int getCvr() {
		return cvr;
	}

	public void setCvr(int cvr) {
		this.cvr = cvr;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
