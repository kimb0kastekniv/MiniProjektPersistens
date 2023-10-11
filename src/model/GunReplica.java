package model;

public class GunReplica extends Product {
	private double calibre;
	private String material;
	private int grId;

	public GunReplica(int productId, String name, double purchasePrice, double salesPrice, int minStock,
			Supplier supplierId, Country countryId, int type, double calibre, String material, int grId) {
		super(productId, name, purchasePrice, salesPrice, minStock, supplierId, countryId, type);

		this.calibre = calibre;
		this.material = material;
		this.grId = grId;
	}

	// Getters and Setters
	public double getCalibre() {
		return calibre;
	}

	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getGrId() {
		return grId;
	}

	public void setGrId(int grId) {
		this.grId = grId;
	}
}