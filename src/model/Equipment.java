package model;

public class Equipment extends Product {

	private int eqId;
	private String type;
	private String description;

	public Equipment(int productId, String name, double purchasePrice, double salesPrice, int minStock,
			Supplier supplierId, Country countryId, int type) {
		super(productId, name, purchasePrice, salesPrice, minStock, supplierId, countryId, type);
		}
	

	// Getters and Setters
	public int getEqId() {
		return eqId;
	}

	public void setEqId(int eqId) {
		this.eqId = eqId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
