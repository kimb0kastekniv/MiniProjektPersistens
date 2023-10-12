package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import db.DbConnection;
import db.OrderDBIF;
import dblayer.DBConnection;
import model.Customer;
import model.Order;
//import db.DBOrderController;
import model.Product;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleOrderCtr {
	private SaleOrder currentSaleOrder;
	//private DBSaleOrderIF dBSaleOrderIF;
private CustomerCtr customerCtr;
private ProductCtr productCtr;
	//private DBSaleOrderIF DBSaleOrderIF;
private ArrayList<SaleOrderLine> saleOrderLineList;

public SaleOrderCtr() throws SQLException {
	saleOrderLineList = new ArrayList<>();
customerCtr = new CustomerCtr();
productCtr = new ProductCtr();
	//DBSaleOrderCtrDBIF = new DBSaleOrderCtr();
}
public void createSaleOrder() {
	currentSaleOrder = new SaleOrder();
}

//public boolean addOrderToDB(int customerId) throws SQLException {
	//DBConnection dbCon = DBConnection.getInstance();
	//try {
	//dbCon.startTransaction();
	//int i = SaleOrderCtrDBIF.addOrderToDB(currentSaleOrder);
	//dBSaleOrderCtrIF.addSaleOrderLinesToDB(currentSaleOrder.getSaleOrderLines(),i);
	
	//double amount = orderCtrDBIF.getOrderAmount(i);
	//double o = currentOrder.getAmountWithDiscount(amount);
	
	//orderCtrDBIF.updatePriceWithDiscount(i,o);
	//customerCtr.findByCustomerId(customerId);

	//dbCon.commitTransaction();
	//}catch(SQLException e) {
		//dbCon.rollbackTransaction();
	//}
	
	//return false;
//}


public void addSaleOrderLineToSaleOrder(int quantity, Product product, double salePrice) throws SQLException {
	currentSaleOrder.createSaleOrderLine(currentSaleOrder, product, quantity, salePrice);
	}
	
public Product findProductByBarcode(int barcode) throws SQLException {
	Product product = productCtr.findProductByBarcode(barcode);
	currentSaleOrder.setProductToCurrentSaleOrder(product);
	return product;
}
public Customer getCustomerFromDb(int customerId) throws SQLException {
	Customer customer = customerCtr.findCustomerById(customerId);
	currentSaleOrder.setCustomerToCurrentSaleOrder(customer);
	return customer;
}

public SaleOrder getCurrentSaleOrder() {
	return currentSaleOrder;
}

}
