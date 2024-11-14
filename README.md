# DB_Connection

### Key words:
- Abstract class
- Protected attributes

### SQL Syntax

When creating a table with SQL, we can specify that the table is only
to be created if doesnt already exist. Doing this prevents
any errors from occurring in the event that the table already exist.

- The "CREATE TABLE IF NOT EXISTS" Statement.

```sql
CREATE TABLE IF NOT EXISTS t1 (
  c1 INT,
  c2 VARCHAR(10)
);
```
 Here, t1 is the table name, and everything between the parentheses is the table definition (i.e. columns, etc).
 In this case, the table will only be created if there isn’t already one called t1.
 This clause prevents sql from creatin a double of a existing table with the same name.

## Instaling the drivers



## Creating the database connection class

We have to use the extended property from the DB_Connection to use 
his information adn create some logic to process the database creation
```java
public class DatabaseSetup extends DB_Connection
```

Create a method to setup the connection, using a booleand metod.
```java
public static boolean setupDB()
```
Throw some exceptions
```java
public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{}
```
and add some import
```java
import java.sql.connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
```
Create an instance of the driver class
```java
Class.forName("com.mysql.cj.jdbc.Driver").newIsntance();
```
Now we can try to connect to the database
```java
try(
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    // Create a statement now (query).
    Statement stmt = conn.createStatement();

){}
```
Now we have to create the statement (query)
```java
try(
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    // Create a statement now (query).
    Statement stmt = conn.createStatement();
    ){
        // We have to create the query here (Statement)
        stmt.execute("CREATE IF NOT EXISTS" + DB_NAME + ";");
        // Query the db using the USE
        stmt.execute("USE " + DB_NAME +";"); // Database (Schema) pointer
        // Create a query to inert into the db
}
```
Creating the table that will contain all the information#
such as the columns
```java
    String sql = // here we create de table with columns and their names
            
            "CREATE TABE IF NOT EXIST " + TABLE + " ( " 
            + "name VARCAR(255), "
            + "birthdate DATE, "
            + "bloodType VARCHAR(2), "
            + "id INT(10)"
            + ");";
```




















