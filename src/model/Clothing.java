package model;

public class Clothing extends Product {
	private int clId;
	private String size;
	private String colour;

	public Clothing(int productId, String name, double purchasePrice, double salesPrice, int minStock,
			Supplier supplierId, Country countryId, int type, int clId, String size, String colour) {
		// Call the constructor of the superclass (Product) to initialize inherited
		// fields
		super(productId, name, purchasePrice, salesPrice, minStock, supplierId, countryId, type);
		// Initialize the fields specific to Clothing
		this.clId = clId;
		this.size = size;
		this.colour = colour;
	}

	// Getters and Setters
	public int getClId() {
		return clId;
	}

	public void setClId(int clId) {
		this.clId = clId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
