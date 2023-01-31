# QWERTY

[Readme Tiếng Việt](doc\Readme_Vietnamese.md)

## Table of Contents
<!-- TOC -->
* [1. Requirement](#requirement)
* [2. SQL Server Configuration](#sql-server-configuration)
* [3. Run Program](#run-program)
* [4. Contributors](#contributors)
* [5. Support user and tester](#support-user-and-tester)
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

1. Login to the SQL Server instance using SQL Server Management Studio (SSMS). If not configured before, on the Connect to SQL Server page, 
please select `Windows Authentication` mode, click on `OK`.
2. Right-click your `SQL Server name`, click on `Properties`.
3. On the `Server Properties` page, click on `Security`. Enable `SQL Server and Windows Authentication` mode.
4. Under "Server Proxy Account", click on `Enable Proxy Account`, enter "Proxy Account" as `sa` and create a `password`, then click `OK`.

### Enable the SQL Server Authentication Login:

1. Connect to the SQL Server instance using SQL Server Management Studio (SSMS) and expand `Security` > `Logins` Directory.
2. Right-click on the `sa` account, select `Properties`.
3. Head to the Status page. Enable Login settings for the account. Click on `OK`.
4. `Restart` and `login` to SQL Server Instance in SSMS using `SQL Server Authentication` mode with created account. If failed, try restarting the computer.

### Enable TCP/IP Protocol
1. Open SQL Server Configuration Management: `Windows` > *search* configuration > select `SQL Server Configuration Management`, 
if you can't find it, go to `Windows` > `Run` > add link `C:\Windows\SysWOW64\SQLServerManager16.msc`, references from [SQL Server Configuration Management](https://learn.microsoft.com/en-us/sql/relational-databases/sql-server-configuration-manager?view=sql-server-ver16).
2. Select `SQL Server Network Configuration` tab, select `the protocol of the SQL Server` instance currently using (normally the service with Running State).
3. Right-click `TCP/IP protocol`, open `Properties`, change the Enabled settings to `Yes`.
4. Go to `ID Addresses` tab, in the "IPAll" settings (it's at the bottom), type `1433` in TCP Port. click on `OK`.

# Run Program

### 1. Create Database

`Open` SQL Server Management Studio (SSMS) > `Login` > `New Query` > _create a database_

Example:
```
create database Project_SE
go
```
after that, `Execute` code.

Or you can create database by _Tool Support_.

### 2. Edit Path to Database

Go to [Path to Database](src\main\java\components\database\DatabaseConnection.java).
At the createConnection() method edit information about the server name, password and database name to match the configuration information.

Example:
```shell
    public static void createConnection(){
        createConnection("LAPTOP-UAFG5AK0\\KIMHUNG","sa","kimhung29042002","Project_SE");
    }
```

### 3. Create Your Account

1. The First way: Use the registration function
2. The Second way: `Refresh` Database > Right-click `dbo.account_table` > `Edit Top 200 Rows` > _Add a record to use_ > _Login with your account_.

# Contributors

1. [Nguyễn Kim Hùng](https://github.com/NguyenKimHung2002)
2. [Phạm Duy Hưng](https://github.com/lightningdhna)
3. [Lê Thành Nguyên](https://github.com/love123bg)
4. [Trần Anh Quốc](https://github.com/quoctata2911)

# Support user and tester

You can view the software manual [here](doc\softwareManuals.md).

1. If you are a user, you will be supported when you go to [Feedback support](doc\feedback.md)
2. If you are a tester, you will be supported when you go to [Testcases](doc\testcase.md) and [Test Report](doc\testReport.md)