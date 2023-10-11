use [DMA-CSD-V23_10511081]

-- Setting up tables
CREATE TABLE ZipCodeCity (
	zipcode int NOT NULL PRIMARY KEY,
	city varchar(50)
	)

CREATE TABLE Country (
	country_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	name varchar(50) NOT NULL
	)

CREATE TABLE Customer (	
	customer_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	streetName varchar(50) NOT NULL,
	streetNo int NOT NULL,
	zipcode int NOT NULL,
	country_Id int NOT NULL,
	phone int NOT NULL,
	email varchar(50) NOT NULL,
	customerType int NOT NULL,
	FOREIGN KEY (zipcode) REFERENCES ZipCodeCity(zipcode),
	FOREIGN KEY (country_Id) REFERENCES Country(country_Id)
	)

CREATE TABLE Business_Customer (
	BusinessName varchar(50) NOT NULL,
	bc_Id int NOT NULL PRIMARY KEY,
	cvr int NOT NULL,
	discount int NOT NULL,
	FOREIGN KEY (bc_Id) REFERENCES Customer(customer_Id)
	)

-- FreeFreight is not included, as it's handled purely in the code
CREATE TABLE Private_Customer (	
	f_name varchar(50) NOT NULL,
	m_name varchar(50) NOT NULL,
	l_name varchar(50) NOT NULL,
	pc_Id int NOT NULL PRIMARY KEY,
	FOREIGN KEY (pc_Id) REFERENCES Customer(customer_Id)
	)

CREATE TABLE Invoice (
	invoice_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	paymentDate datetime NOT NULL,
	amount int NOT NULL
	)
	
CREATE TABLE SaleOrder (
	saleOrder_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	date datetime NOT NULL,
	amount int NOT NULL,
	deliveryStatus bit NOT NULL,
	deliveryDate datetime NOT NULL,
	invoice_Id int NOT NULL,
	customer_Id int NOT NULL
	FOREIGN KEY (invoice_Id) REFERENCES Invoice(invoice_Id),
	FOREIGN KEY (customer_Id) REFERENCES Customer(customer_Id)
	)

CREATE TABLE Product (
	name varchar(50) NOT NULL,
	purchasePrice decimal NOT NULL,
	salesPrice decimal NOT NULL,
	-- rentPrice is left out for now
	-- rentPrice decimal NOT NULL,
	minStock int NOT NULL,
	product_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	supplier_Id int NOT NULL,
	country_Id int NOT NULL,
	type int NOT NULL,
	FOREIGN KEY (country_Id) REFERENCES Country(country_Id)
	)

CREATE TABLE SaleOrderLine (
	quantity int NOT NULL,
	salePrice decimal NOT NULL,
	saleOrder_Id int NOT NULL,
	product_Id int NOT NULL,
	CONSTRAINT PK_SaleOrderLine PRIMARY KEY (saleOrder_Id, product_Id),
	FOREIGN KEY (saleOrder_Id) REFERENCES SaleOrder(saleOrder_Id),
	FOREIGN KEY (product_Id) REFERENCES Product(product_Id)
	)

CREATE TABLE Clothing (
	size varchar(50) NOT NULL,
	colour varchar(50) NOT NULL,
	cl_Id int NOT NULL PRIMARY KEY,
	FOREIGN KEY (cl_Id) REFERENCES Product(product_Id)
	)

CREATE TABLE Equipment (
	type varchar(50) NOT NULL,
	description varchar(150) NOT NULL,
	eq_Id int NOT NULL PRIMARY KEY,
	FOREIGN KEY (eq_Id) REFERENCES Product(product_Id)
	)

CREATE TABLE GunReplica (
	calibre decimal(18,2) NOT NULL,
	material varchar(50) NOT NULL,
	gr_Id int NOT NULL PRIMARY KEY,
	FOREIGN KEY (gr_Id) REFERENCES Product(product_Id)
	)

CREATE TABLE Supplier (
	supplier_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	name varchar(50) NOT NULL,
	streetName varchar(50) NOT NULL,
	streetNo int NOT NULL,
	zipcode int NOT NULL,
	country_Id int NOT NULL,
	phoneNo int NOT NULL,
	email varchar(50) NOT NULL,
	FOREIGN KEY (zipcode) REFERENCES ZipCodeCity(zipcode),
	FOREIGN KEY (country_Id) REFERENCES Country(country_Id)
	)

CREATE TABLE StockLocation (
	stockLocation_Id int NOT NULL PRIMARY KEY IDENTITY(1,1),
	streetName varchar(50) NOT NULL,
	streetNo int NOT NULL,
	zipcode int NOT NULL,
	country_Id int NOT NULL,
	FOREIGN KEY (zipcode) REFERENCES ZipCodeCity(zipcode),
	FOREIGN KEY (country_Id) REFERENCES Country(country_Id)
	)

CREATE TABLE StockLine (
	numberInStock int NOT NULL,
	stockLocation_Id int NOT NULL,
	product_Id int NOT NULL,
	FOREIGN KEY (product_Id) REFERENCES Product(product_Id),
	CONSTRAINT PK_StockLine PRIMARY KEY (stockLocation_Id, product_Id),
	FOREIGN KEY (stockLocation_Id) REFERENCES StockLocation(stockLocation_Id)
	)
