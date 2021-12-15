# TAXI SERVICE
It is an easy-to-use service for business.
The purpose of this application is to help in business management

It allows you to do things like:
- Create new Drivers, Manufacturers and Cars on DB
- Add Drivers to Cars
- Add Manufacturer to Car
- Track Cars tied to Driver
- Delete(Soft Delete) Drivers, Manufactures and Cars from DB
- ---
## Technologies used
- Servlet
- JDBC
- Apache Tomcat
- MySQL
- Maven
- JSP, JSTL
- HTML, CSS
---
## Setup
1. Download [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
2. Download [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)
3. Download [MySQL](https://dev.mysql.com/downloads/)
4. Clone this project in your IDEA
5. Change the value of the constants in the class `src/main/java/taxi/util/ConnectionUtil.java`
```java
private static final String URL = "YOUR URL TO DB";
private static final String USERNAME = "YOUR USERNAME FOR ACCES TO DB";
private static final String PASSWORD = "YOUR PASSWORD FOR ACCES TO DB";
private static final String JDBC_DRIVER = "YOUR JDBC DRIVER PATH";
```
6. Change the value `fileName` in file `src/main/resources/log4j2.xml`
```xml
<File name="FileLog" fileName="Enter the path for logs here">
```
7. Run script from `src/main/resources/init_db.sql` in MySQL DBMS
- - (OPTIONAL) You can create a new driver in table `drivers` in DB
8. Configure your Tomcat in IDEA(Add New Configuration -> TomCat -> Local -> Fix -> taxi-service:war exploded -> OK)
9. Run
---
PS: If you enter the driver's database into the database, you can enter the username and password and then you can use the application
