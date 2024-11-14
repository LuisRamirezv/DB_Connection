/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author felip
 */
public class DatabaseSetup extends DB_Connection {
    
    // Once extended we can make use of the db information
    // and create some logic to process the db creation
    
    
    // Create a method to setup the connection (Boolean)
    
    public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        // The driver we have will manage the connection and make sure there is server
        // feedback to the client
        
        // Create an instance of the driver class
        
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        // try to connect to the database
        
        try(
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                // Create a statement (query)
                Statement stmt = conn.createStatement();
            ){
                // We have to create the query here (Statement)
                stmt.execute("CREATE IF NOT EXISTS " + DB_NAME + ";"); // here we create de database
                // Query the db using the USE
                stmt.execute("USE " + DB_NAME +";"); // Database (Schema) pointer
                // Create a query to insert into the db
                String sql = // here we create de table with columns and their names

                        "CREATE TABE IF NOT EXIST " + TABLE + " ( " 
                        + "name VARCAR(255), "
                        + "birthdate DATE, "
                        + "bloodType VARCHAR(2), "
                        + "id INT(10)"
                        + ");";
                stmt.execute(sql);
                return true;
            }catch(Exception e){
                e.printStackTrace();
                return false;
                 
            }
    
        
    }
    
    // Create some logic to ensure we do not run into issues with the
    // db connection
    
    
    
}
