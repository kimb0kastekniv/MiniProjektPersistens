package model;

public class GunReplica {
	private double calibre;
	private String material;
	private int grId;

	public GunReplica(double calibre, String material, int grId) {

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