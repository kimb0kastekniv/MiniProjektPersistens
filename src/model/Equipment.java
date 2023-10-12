package model;

public class Equipment {

	private int eqId;
	private int type;
	private String description;

	public Equipment(int eqId, int type, String description) {
		this.eqId = eqId; 
	    this.type = type; 
	    this.description = description; 
	}

	// Getters and Setters
	public int getEqId() {
		return eqId;
	}

	public void setEqId(int eqId) {
		this.eqId = eqId;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
