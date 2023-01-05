--use db;

--create table cic_table(
--cic_number varchar(100) primary key,
--name nvarchar(100) not null,
--other_name nvarchar(100) ,
--date_of_birth date not null,
--gender varchar(10) not null,
--place_of_origin nvarchar(100) not null,
--place_of_residence nvarchar(100) not null,
--place_of_temporary_residence nvarchar(100) not null,
--nationality nvarchar(50) not null,
--ethnic nvarchar(50) not null,
--passport_number varchar(50) ,
--personal_identification nvarchar(200) ,
--date_of_expiry date not null,
--verify_state varchar(10) not null,
--date_verify date not null,
--id_verifier int not null unique,
--note nvarchar(200),
--front_cic_image_url varchar(200) not null,
--back_cic_image_url varchar(200) not null
--);
--INSERT INTO cic_table(name,other_name,date_of_birth,gender,place_of_origin,place_of_residence,place_of_temporary_residence,
--					  nationality,ethnic,passport_number,personal_identification,date_of_expiry,verify_state,date_verify,id_verifier,
--					  note,front_cic_image_url,back_cic_image_url)
--VALUES('019825','Huy','fdf', 2001-10-5,'Male','dsad','dsadsa','ddsa','dsajj','ghjs','fdsf','dsadsk',2001-10-5,'dsadd',2001-10-5, 1,'fsdf', 'dsadsadsa','dsadas'),
--	  ('012254','Hoan','fdf', 2001-10-5,'Male','dsad','dsadsa','ddsa','dsa','uuas','fdsf','dsadsj',2001-10-5,'dsadd',2001-10-5, 2,'fsdf', 'dsadsadsa','dsadas'),
--	  ('12231D','Ngoc','fdf', 2001-10-5,'Male','dsad','dsadsa','ddsa','dsa','jjas','fdsf','dsadsg',2001-10-5,'dsadd',2001-10-5, 3,'fsdf', 'dsadsadsa','dsadas'),
--	  ('019826','Dung','fdf', 2001-10-5,'Male','dsad','dsadsa','ddsa','dsauty','iias','fdsf','dsadsg',2001-10-5,'dsadd',2001-10-5, 4,'fsdf', 'dsadsadsa','dsadas');
--SELECT * FROM cic_table;


--create table identification_table(
--id int identity(1, 1) primary key,
--account_id int not null unique,
--cic_number varchar(20) not null unique)

--insert into identification_table(account_id,cic_number)
--Values (1,'019825'),(2,'012254'),(3,'12231D'),(4,'019826');

--SELECT * FROM identification_table;
