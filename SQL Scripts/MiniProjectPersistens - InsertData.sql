use [DMA-CSD-V23_10511081]

-- Inserting mock data

-- ZipCodeCity
INSERT ZipCodeCity (zipcode, city) VALUES (10001, 'NewYork');
INSERT ZipCodeCity (zipcode, city) VALUES (90210, 'BeverlyHills');
INSERT ZipCodeCity (zipcode, city) VALUES (60601, 'Chicago');
INSERT ZipCodeCity (zipcode, city) VALUES (30301, 'Atlanta');
INSERT ZipCodeCity (zipcode, city) VALUES (94102, 'SanFrancisco');

-- Country
INSERT Country (name) VALUES ('United States');
INSERT Country (name) VALUES ('Canada');
INSERT Country (name) VALUES ('United Kingdom');
INSERT Country (name) VALUES ('Australia');
INSERT Country (name) VALUES ('France');

-- Customer
INSERT Customer (streetName, streetNo, zipcode, country_Id, phone, email, customerType)
VALUES ('Main Street', 123, 10001, 1, 51234567, 'customer1@example.com', 1);

INSERT Customer (streetName, streetNo, zipcode, country_Id, phone, email, customerType)
VALUES ('Elm Avenue', 456, 90210, 1, 59876543, 'customer2@example.com', 2);

INSERT Customer (streetName, streetNo, zipcode, country_Id, phone, email, customerType)
VALUES ('Oak Lane', 789, 60601, 2, 55555555, 'customer3@example.com', 1);

INSERT Customer (streetName, streetNo, zipcode, country_Id, phone, email, customerType)
VALUES ('Pine Road', 101, 30301, 2, 58889999, 'customer4@example.com', 2);

INSERT Customer (streetName, streetNo, zipcode, country_Id, phone, email, customerType)
VALUES ('Cedar Street', 222, 94102, 3, 51112222, 'customer5@example.com', 1);

-- Business Customer
INSERT Business_Customer (BusinessName, bc_Id, cvr, discount)
VALUES ('ABC Corporation', 2, 123456789, 10);

INSERT Business_Customer (BusinessName, bc_Id, cvr, discount)
VALUES ('XYZ Enterprises', 4, 987654321, 15);

-- Private Customer
INSERT INTO Private_Customer (f_name, m_name, l_name, pc_Id)
VALUES ('John', 'A.', 'Doe', 1);

INSERT INTO Private_Customer (f_name, m_name, l_name, pc_Id)
VALUES ('Jane', 'B.', 'Smith', 3);

INSERT INTO Private_Customer (f_name, m_name, l_name, pc_Id)
VALUES ('Robert', 'C.', 'Johnson', 5);

-- Invoice
INSERT Invoice (paymentDate, amount) VALUES ('2023-10-11 14:30:00', 500);
INSERT Invoice (paymentDate, amount) VALUES ('2023-10-12 12:15:00', 750);
INSERT Invoice (paymentDate, amount) VALUES ('2023-10-13 16:45:00', 600);
INSERT Invoice (paymentDate, amount) VALUES ('2023-10-14 10:00:00', 900);
INSERT Invoice (paymentDate, amount) VALUES ('2023-10-15 09:30:00', 800);

-- Sale Order
INSERT SaleOrder (date, amount, deliveryStatus, deliveryDate, invoice_Id, customer_Id)
VALUES ('2023-10-11 14:30:00', 500, 1, '2023-10-20 14:30:00', 1, 1);

INSERT SaleOrder (date, amount, deliveryStatus, deliveryDate, invoice_Id, customer_Id)
VALUES ('2023-10-12 12:15:00', 750, 0, '2023-10-25 12:15:00', 2, 2);

INSERT SaleOrder (date, amount, deliveryStatus, deliveryDate, invoice_Id, customer_Id)
VALUES ('2023-10-13 16:45:00', 600, 1, '2023-10-30 16:45:00', 3, 3);

INSERT SaleOrder (date, amount, deliveryStatus, deliveryDate, invoice_Id, customer_Id)
VALUES ('2023-10-14 10:00:00', 900, 0, '2023-11-01 10:00:00', 4, 4);

INSERT SaleOrder (date, amount, deliveryStatus, deliveryDate, invoice_Id, customer_Id)
VALUES ('2023-10-15 09:30:00', 800, 1, '2023-11-05 09:30:00', 5, 5);

-- Product
INSERT Product (name, purchasePrice, salesPrice, minStock, supplier_Id, country_Id, type)
VALUES ('Denims', 40.00, 80.00, 20, 1, 1, 1);

INSERT Product (name, purchasePrice, salesPrice, minStock, supplier_Id, country_Id, type)
VALUES ('Shirts', 20.00, 45.00, 30, 2, 2, 2);

INSERT Product (name, purchasePrice, salesPrice, minStock, supplier_Id, country_Id, type)
VALUES ('Gun', 15.00, 35.00, 25, 3, 3, 3);

INSERT Product (name, purchasePrice, salesPrice, minStock, supplier_Id, country_Id, type)
VALUES ('Bags', 25.00, 55.00, 15, 4, 1, 4);

INSERT Product (name, purchasePrice, salesPrice, minStock, supplier_Id, country_Id, type)
VALUES ('Flags', 10.00, 20.00, 50, 5, 2, 5);

-- SaleOrderLine
INSERT SaleOrderLine (quantity, salePrice, saleOrder_Id, product_Id)
VALUES (2, 75.00, 1, 1);

INSERT SaleOrderLine (quantity, salePrice, saleOrder_Id, product_Id)
VALUES (3, 40.00, 2, 2);

INSERT SaleOrderLine (quantity, salePrice, saleOrder_Id, product_Id)
VALUES (4, 30.00, 3, 3);

INSERT SaleOrderLine (quantity, salePrice, saleOrder_Id, product_Id)
VALUES (2, 50.00, 4, 4);

INSERT SaleOrderLine (quantity, salePrice, saleOrder_Id, product_Id)
VALUES (1, 15.00, 5, 5);

-- Clothing
INSERT Clothing (size, colour, cl_Id)
VALUES ('Medium', 'Blue', 1);

INSERT Clothing (size, colour, cl_Id)
VALUES ('Small', ' Pink', 2);

-- Equipment
INSERT Equipment (type, description, eq_Id)
VALUES ('Backpack', 'Its a backpack, it does what a backpack does', 4);

INSERT Equipment (type, description, eq_Id)
VALUES ('Flags', 'Based on advanced physics, flags waves when it is windy', 5);

-- Gun Replica
INSERT GunReplica (calibre, material, gr_Id)
VALUES (1.5, 'Wood', 3);

-- Supplier
INSERT Supplier (name, streetName, streetNo, zipcode, country_Id, phoneNo, email)
VALUES ('ABCTextiles', 'FabricAvenue', 101, 10001, 1, 81690112, 'abc.textiles@example.com');

INSERT Supplier (name, streetName, streetNo, zipcode, country_Id, phoneNo, email)
VALUES ('FashionWorld', 'StyleStreet', 202, 90210, 1, 91648592, 'fashion.world@example.com');

INSERT Supplier (name, streetName, streetNo, zipcode, country_Id, phoneNo, email)
VALUES ('VogueFabrics', 'TrendyLane', 303, 60601, 2, 81974821, 'vogue.fabrics@example.com');

INSERT Supplier (name, streetName, streetNo, zipcode, country_Id, phoneNo, email)
VALUES ('BagEmporium', 'BagStreet', 404, 30301, 3, 81729471, 'bag.emporium@example.com');

INSERT Supplier (name, streetName, streetNo, zipcode, country_Id, phoneNo, email)
VALUES ('FlagMakers', 'BannerRoad', 505, 94102, 4, 16539281, 'flag.makers@example.com');

-- StockLocation
INSERT StockLocation (streetName, streetNo, zipcode, country_Id)
VALUES ('Warehouse A', 101, 10001, 1);

INSERT StockLocation (streetName, streetNo, zipcode, country_Id)
VALUES ('Storage B', 202, 90210, 1);

INSERT StockLocation (streetName, streetNo, zipcode, country_Id)
VALUES ('Stockroom C', 303, 60601, 2);

INSERT StockLocation (streetName, streetNo, zipcode, country_Id)
VALUES ('Depot X', 404, 30301, 3);

INSERT StockLocation (streetName, streetNo, zipcode, country_Id)
VALUES ('Shed Y', 505, 94102, 4);

-- StockLine
INSERT StockLine (numberInStock, stockLocation_Id, product_Id)
VALUES (100, 1, 1);

INSERT StockLine (numberInStock, stockLocation_Id, product_Id)
VALUES (75, 2, 2);

INSERT StockLine (numberInStock, stockLocation_Id, product_Id)
VALUES (50, 3, 3);

INSERT StockLine (numberInStock, stockLocation_Id, product_Id)
VALUES (125, 4, 4);

INSERT StockLine (numberInStock, stockLocation_Id, product_Id)
VALUES (80, 5, 5);