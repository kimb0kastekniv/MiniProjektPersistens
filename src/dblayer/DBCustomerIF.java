package dblayer;

import java.sql.SQLException;
import model.Customer;

public interface DBCustomerIF {
    Customer findCustomerById(int customerId) throws SQLException;
}