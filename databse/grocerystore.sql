create database GROCERYSTORE;
use GROCERYSTORE;
CREATE TABLE PRODUCT(
	id VARCHAR(10) PRIMARY KEY,
    product_name varchar(50),
    expiry date,
    import_price int,
    sell_price int,
    origin nvarchar(50),
    quantity int,
    product_type varchar(10)    
);

CREATE TABLE PRODUCT_TYPE (
	id varchar(10) primary key,
    type_name varchar(50)
);	

alter table PRODUCT add constraint fk_product_type
foreign key (product_type ) references PRODUCT_TYPE(id);

create table INCOME_DETAILS(
	product_id varchar(10),
    sold_quantity int,
    report_month int primary key
);

create table INCOME_REPORT(
	report_month int primary key,
    income int
);

alter table income_details add constraint fk_product_id 
foreign key (product_id) references PRODUCT(id);
CREATE INDEX idx_report_month ON INCOME_REPORT(report_month);
alter table income_report add constraint fk_report_month
foreign key (report_month) references INCOME_REPORT(report_month);

create table IMPORT_STATISTIC_SHEET (
	id varchar(10) primary key,
    product_id varchar(10),
    price int,
    statistical_day date,
    statistician varchar(10)
);

CREATE table ACCOUNT (
	username varchar(10) primary key,
    password varchar(50)
);

create table STAFF(
	id varchar(10),
    name varchar(50),
    sex ENUM('male', 'female'),
    dob date,
    address varchar(50)
);

alter table IMPORT_STATISTIC_SHEET add constraint fk_product_id_1 
foreign key (product_id) references PRODUCT(id);
CREATE INDEX idx_statiscian ON STAFF(id);
alter table IMPORT_STATISTIC_SHEET add constraint fk_statistician_1
foreign key (statistician) references STAFF(id);
alter table ACCOUNT add constraint fk_username
foreign key (username) references STAFF(id);

INSERT INTO PRODUCT_TYPE (id, type_name) VALUES
('Fo', 'foods'),
('Dr', 'drinks'),
('Sp', 'spices'),
('HPI', 'personal hygiene items'),
('HA', 'household appliances');

INSERT INTO STAFF (id, name, sex, dob, address)
VALUES
('S001', 'John Doe', 'male', '1990-05-15', '123 Main St, New York'),
('S002', 'Jane Smith', 'female', '1992-08-20', '456 Oak Ave, Los Angeles'),
('S003', 'Michael Johnson', 'male', '1985-03-10', '789 Elm Rd, Chicago'),
('S004', 'Emily Brown', 'female', '1991-11-25', '567 Pine Blvd, Houston'),
('S005', 'David Wilson', 'male', '1988-07-05', '890 Cedar Dr, San Francisco'),
('S006', 'Jessica Martinez', 'female', '1993-02-18', '234 Maple Ln, Miami'),
('S007', 'Christopher Garcia', 'male', '1987-09-30', '678 Birch Ave, Boston'),
('S008', 'Sarah Lopez', 'female', '1990-04-12', '345 Oakwood St, Seattle'),
('S009', 'Daniel Miller', 'male', '1986-01-08', '456 Pinecrest Rd, Denver'),
('S010', 'Melissa Thompson', 'female', '1994-06-22', '789 Elmwood Dr, Atlanta'),
('S011', 'Robert White', 'male', '1989-12-17', '567 Maplewood Ave, Dallas'),
('S012', 'Amanda Scott', 'female', '1992-03-28', '123 Cedar Ln, Philadelphia'),
('S013', 'William Lee', 'male', '1984-08-14', '890 Pine Rd, Phoenix'),
('S014', 'Laura King', 'female', '1991-05-03', '234 Birch Ave, Detroit'),
('S015', 'Richard Perez', 'male', '1987-10-19', '456 Elm St, Minneapolis'),
('S016', 'Jennifer Harris', 'female', '1993-07-08', '678 Oak Ave, Baltimore'),
('S017', 'Matthew Clark', 'male', '1985-02-11', '789 Maple Rd, Portland'),
('S018', 'Michelle Lewis', 'female', '1990-09-26', '345 Pine Blvd, Las Vegas'),
('S019', 'Joshua Robinson', 'male', '1986-04-30', '456 Cedar Dr, San Diego'),
('S020', 'Kimberly Walker', 'female', '1994-01-15', '567 Oakwood Ln, Charlotte'),
('S021', 'Jason Hall', 'male', '1989-06-18', '678 Maple Ave, Washington'),
('S022', 'Stephanie Young', 'female', '1992-11-23', '123 Birch Rd, San Antonio'),
('S023', 'Joseph Allen', 'male', '1984-07-04', '890 Elmwood St, Tampa'),
('S024', 'Christina Green', 'female', '1991-04-09', '234 Pinecrest Rd, Nashville'),
('S025', 'Daniel Baker', 'male', '1987-09-12', '456 Maplewood Ave, Honolulu'),
('S026', 'Emily Hill', 'female', '1993-05-27', '789 Cedar Ln, Austin'),
('S027', 'Kevin Adams', 'male', '1985-12-03', '890 Birch Ave, Orlando'),
('S028', 'Rachel Ross', 'female', '1990-03-16', '345 Oak Rd, Denver'),
('S029', 'Brandon Campbell', 'male', '1986-08-28', '456 Pine Ave, Chicago'),
('admin', 'Alexis Price', 'female', '1994-02-01', '567 Elm Blvd, Miami');

INSERT INTO ACCOUNT (username, password)
VALUES
('S001', 'password001'),
('S002', 'password002'),
('S003', 'password003'),
('S004', 'password004'),
('S005', 'password005'),
('S006', 'password006'),
('S007', 'password007'),
('S008', 'password008'),
('S009', 'password009'),
('S010', 'password010'),
('S011', 'password011'),
('S012', 'password012'),
('S013', 'password013'),
('S014', 'password014'),
('S015', 'password015'),
('S016', 'password016'),
('S017', 'password017'),
('S018', 'password018'),
('S019', 'password019'),
('S020', 'password020'),
('S021', 'password021'),
('S022', 'password022'),
('S023', 'password023'),
('S024', 'password024'),
('S025', 'password025'),
('S026', 'password026'),
('S027', 'password027'),
('S028', 'password028'),
('S029', 'password029'),
('admin', 'admin');

INSERT INTO PRODUCT (id, product_name, expiry, import_price, sell_price, origin, quantity, product_type)
VALUES
('P001', 'Rice', '2024-12-31', 5000, 7000, 'Vietnam', 100, 'Fo'),
('P002', 'Coca Cola', '2024-08-31', 3000, 5000, 'USA', 200, 'Dr'),
('P003', 'Black Pepper', '2023-06-30', 15000, 20000, 'India', 50, 'Sp'),
('P004', 'Toothpaste', '2025-02-28', 8000, 12000, 'Germany', 80, 'HPI'),
('P005', 'Washing Machine', NULL, 3000000, 3500000, 'China', 30, 'HA'),
('P006', 'Chicken', '2024-06-30', 20000, 25000, 'Brazil', 150, 'Fo'),
('P007', 'Orange Juice', '2024-09-30', 10000, 15000, 'Spain', 100, 'Dr'),
('P008', 'Cinnamon', '2023-12-31', 12000, 18000, 'Sri Lanka', 40, 'Sp'),
('P009', 'Shampoo', '2024-04-30', 9000, 13000, 'France', 70, 'HPI'),
('P010', 'Refrigerator', NULL, 5000000, 6000000, 'South Korea', 20, 'HA'),
('P011', 'Beef', '2024-05-31', 25000, 30000, 'Australia', 120, 'Fo'),
('P012', 'Apple Juice', '2024-08-31', 12000, 18000, 'Italy', 80, 'Dr'),
('P013', 'Turmeric', '2023-11-30', 18000, 25000, 'India', 60, 'Sp'),
('P014', 'Soap', '2024-03-31', 7000, 10000, 'Germany', 90, 'HPI'),
('P015', 'Microwave', NULL, 2000000, 2500000, 'Japan', 25, 'HA'),
('P016', 'Pork', '2024-07-31', 22000, 28000, 'Vietnam', 110, 'Fo'),
('P017', 'Grape Juice', '2024-10-31', 11000, 16000, 'USA', 70, 'Dr'),
('P018', 'Garlic', '2023-10-31', 10000, 15000, 'China', 45, 'Sp'),
('P019', 'Deodorant', '2024-06-30', 8500, 12000, 'France', 60, 'HPI'),
('P020', 'Dishwasher', NULL, 4000000, 4800000, 'Germany', 15, 'HA'),
('P021', 'Lamb', '2024-04-30', 28000, 35000, 'New Zealand', 80, 'Fo'),
('P022', 'Lemonade', '2024-09-30', 9000, 14000, 'Brazil', 85, 'Dr'),
('P023', 'Coriander', '2023-12-31', 13000, 20000, 'India', 55, 'Sp'),
('P024', 'Conditioner', '2024-03-31', 9500, 14000, 'Italy', 75, 'HPI'),
('P025', 'Oven', NULL, 3000000, 3800000, 'South Korea', 20, 'HA'),
('P026', 'Fish', '2024-08-31', 18000, 23000, 'Norway', 95, 'Fo'),
('P027', 'Mango Juice', '2024-11-30', 13000, 18000, 'India', 65, 'Dr'),
('P028', 'Cardamom', '2023-09-30', 16000, 22000, 'Guatemala', 50, 'Sp'),
('P029', 'Toilet Paper', '2024-05-31', 6000, 9000, 'Canada', 110, 'HPI'),
('P030', 'TV', NULL, 6000000, 7000000, 'USA', 10, 'HA');


INSERT INTO IMPORT_STATISTIC_SHEET (id, product_id, price, statistical_day, statistician)
VALUES
('ISS001', 'P001', 200000, '2024-06-01', 'S001'),
('ISS002', 'P002', 150000, '2024-06-02', 'S002'),
('ISS003', 'P003', 300000, '2024-06-03', 'S003'),
('ISS004', 'P004', 120000, '2024-06-04', 'S004'),
('ISS005', 'P005', 5000000, '2024-06-05', 'S005'),
('ISS006', 'P006', 250000, '2024-06-06', 'S006'),
('ISS007', 'P007', 100000, '2024-06-07', 'S007'),
('ISS008', 'P008', 80000, '2024-06-08', 'S008'),
('ISS009', 'P009', 150000, '2024-06-09', 'S009'),
('ISS010', 'P010', 7000000, '2024-06-10', 'S010'),
('ISS011', 'P011', 280000, '2024-06-11', 'S011'),
('ISS012', 'P012', 110000, '2024-06-12', 'S012'),
('ISS013', 'P013', 180000, '2024-06-13', 'S013'),
('ISS014', 'P014', 75000, '2024-06-14', 'S014'),
('ISS015', 'P015', 3500000, '2024-06-15', 'S015'),
('ISS016', 'P016', 230000, '2024-06-16', 'S016'),
('ISS017', 'P017', 90000, '2024-06-17', 'S017'),
('ISS018', 'P018', 120000, '2024-06-18', 'S018'),
('ISS019', 'P019', 100000, '2024-06-19', 'S019'),
('ISS020', 'P020', 4800000, '2024-06-20', 'S020'),
('ISS021', 'P021', 300000, '2024-06-21', 'S021'),
('ISS022', 'P022', 140000, '2024-06-22', 'S022'),
('ISS023', 'P023', 95000, '2024-06-23', 'S023'),
('ISS024', 'P024', 110000, '2024-06-24', 'S024'),
('ISS025', 'P025', 3800000, '2024-06-25', 'S025'),
('ISS026', 'P026', 200000, '2024-06-26', 'S026'),
('ISS027', 'P027', 120000, '2024-06-27', 'S027'),
('ISS028', 'P028', 160000, '2024-06-28', 'S028'),
('ISS029', 'P029', 90000, '2024-06-29', 'S029'),
('ISS030', 'P030', 7000000, '2024-06-30', 'admin');







