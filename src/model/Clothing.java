package model;

public class Clothing {
	private int clId;
	private String size;
	private String colour;

	public Clothing(int clId, String size, String colour) {
		
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
