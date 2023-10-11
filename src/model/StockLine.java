package model;

public class StockLine {
	private int numberInStock;
	private StockLocation stockLocationId;
	private Product productId;

	public StockLine(int numberInStock, StockLocation stockLocationId, Product productId) {
		this.numberInStock = numberInStock;
		this.stockLocationId = stockLocationId;
		this.productId = productId;
	}

	// Getters and Setters
	public int getNumberInStock() {
		return numberInStock;
	}

	public void setNumberInStock(int numberInStock) {
		this.numberInStock = numberInStock;
	}

	public StockLocation getStockLocationId() {
		return stockLocationId;
	}

	public void setStockLocationId(StockLocation stockLocationId) {
		this.stockLocationId = stockLocationId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}
}
