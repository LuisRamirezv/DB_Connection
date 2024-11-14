/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

/**
 *
 * @author felip
 */
public class Patient {
    
    // This patient information will utilised by thwe system to add information
    // patient data from the hospital database
    
    // Attributes
    private String name;
    private String birthDate;
    private String bloodType;
    private int patientID;
    
    // Static attribure
    // Static attributes are a class variable
    // it will be shared by all the objects within the class
    // currentID this will be used to generate new ID values to patient
    // and check the currentIDs
    
    private static int currentID = 1;
    
    //Create 2 constructor
    // One constructor will be the patient data
    
    public Patient(String name, String birthDate, String bloodType){}
    public Patient(String name, String birthDate, String bloodType, int patitneID){}
    
    
    
    // constructor 2 is when addgin a patiend to the database
    
    
    
    
    
}
