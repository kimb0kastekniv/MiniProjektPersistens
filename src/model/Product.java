package model;

public class Product {
	
	private String name;
	private double purchasePrice;
	private double salesPrice;
	private int minStock;
	private int productId;
	private int supplierId;
	private int countryId; // Foreign key to Country table
	private int type;

	public Product(String name, double purchasePrice, double salesPrice, int minStock, int productId,
			int supplierId, int countryId, int type) {
		
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.salesPrice = salesPrice;
		this.minStock = minStock;
		this.productId = productId;
		this.supplierId = supplierId;
		this.countryId = countryId;
		this.type = type;
	}

	// Getters and Setters
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
