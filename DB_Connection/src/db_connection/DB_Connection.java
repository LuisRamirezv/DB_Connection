/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db_connection;

/**
 *
 * @author felip
 */
public abstract class DB_Connection {
    
    protected final static String DB_URL = "jdbc:mysql//localhost:";
    protected final static String USER = "root";
    protected final static String PASSWORD = "password";
    // This schema name may or may not be created
    protected final static String DB_NAME = "hospital";
    protected final static String TABLE = "patient_data";
    
    // Now we create the final Database URL with the schema name
    protected final static String DB_BASE_URL = DB_URL + "/" + DB_NAME;
            
    


}
