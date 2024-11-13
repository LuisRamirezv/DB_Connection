# DB_Connection

### Key words:
- Abstract class
- Protected attributes


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
    stmt.execute("CREATE IF NOT EXISTS");


}
```


















