# QWERTY

[Readme Tiếng Việt](doc\Readme_Vietnamese.md)

## Table of Contents
<!-- TOC -->
* [1. Requirement](#requirement)
* [2. SQL Server Configuration](#sql-server-configuration)
* [3. Run Program](#run-program)
* [4. Contributors](#contributors)
<!-- TOC -->
# Requirement
[SQL Server](https://www.microsoft.com/en-us/sql-server/sql-server-downloads) version 2022 or later, 
choose the version that suits your operating system and computer configuration.

[SQL Server Management Studio (SSMS)](https://learn.microsoft.com/en-us/sql/ssms/download-sql-server-management-studio-ssms?view=sql-server-ver16) version 19 or later.

### Preffered IDE for running/testing: [Intellij IDEA](https://www.jetbrains.com/idea/download/#section=windows) version 2022.3.1 or later.

*If the current version is lower than required version, please update to the latest version.*

# SQL Server Configuration

## Enable SQL Server Authentication Account

Make sure to restart the SQL Server service after configuration.

### Change the Authentication Mode:

Follow the steps mentioned below to use SQL Server Authentication.

1. Login to the SQL Server instance using SQL Server Management Studio (SSMS). Right-click on the database instance, go to Properties.
2. On the Server Properties page, click on Security. Enable SQL Server and Windows Authentication mode.
3. Under "Server Proxy Account", click "Enable Proxy ACCount", enter "Proxy Account" as `sa` and create a password, then click OK.

### Enable the SQL Server Authentication Login:

1. Connect to the SQL Server instance using SQL Server Management Studio (SSMS) and expand Security > Logins Directory.
2. Right-click on the `sa` account, select Properties.
3. Head to the Status page. Enable Login settings for the account. Click OK.
4. Restart and login to SQL Server Instance in SSMS using SQL Server Authentication mode with created account. If failed, try restarting the computer.

### Enable TCP/IP Protocol
1. Open SQL Server Configuration Management: Windows > *search* configuration > select `SQL Server Configuration Management`, 
if you can't find it, go to Windows > Run > add link `C:\Windows\SysWOW64\SQLServerManager16.msc`, references from [SQL Server Configuration Management](https://learn.microsoft.com/en-us/sql/relational-databases/sql-server-configuration-manager?view=sql-server-ver16).
2. Select SQL Server Network Configuration tab, select the protocol of the SQL Server instance currently using (normally the service with Running State).
3. Right-click TCP/IP protocol, open Properties, change the Enabled settings to Yes.
4. Go to ID Addresses tab, in the IPAll settings (it's at the bottom), type 1433 in TCP Port. Click OK.

# Run Program

### 1. Create Database

Open SQL Server Management Studio (SSMS) > Login > New Query > create a database

Example:
```
create database Project_SE
go
```
after that, Execute code.

Or you can create database by Tool Support.

### 2. Create Your Account

1. The First way: Use the registration function
2. The Second way: Refresh Database > Right-click dbo.account_table > Edit Top 200 Rows > Add a record to use > Login with your account.

# Contributors

1. [Nguyễn Kim Hùng](https://github.com/NguyenKimHung2002)
2. [Phạm Duy Hưng](https://github.com/lightningdhna)
3. [Lê Thành Nguyên](https://github.com/gachu)
4. [Trần Anh Quốc]()
