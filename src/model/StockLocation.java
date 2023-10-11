package model;

public class StockLocation {
	private int stockLocationId;
	private String streetName;
	private int streetNo;
	private ZipCodeCity zipcode;
	private Country countryId;

	public StockLocation(int stockLocationId, String streetName, int streetNo, ZipCodeCity zipcode, Country countryId) {
		this.stockLocationId = stockLocationId;
		this.streetName = streetName;
		this.streetNo = streetNo;
		this.zipcode = zipcode;
		this.countryId = countryId;
	}

	// Getters and Setters
	public int getStockLocationId() {
		return stockLocationId;
	}

	public void setStockLocationId(int stockLocationId) {
		this.stockLocationId = stockLocationId;
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
}
