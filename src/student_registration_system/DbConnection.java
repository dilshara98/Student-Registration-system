/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student_registration_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DbConnection {
     private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("Connection Fail "+cnfe);
            
        }
            
            String url="jdbc:mysql://localhost:3306/student registration";
            try{
                DBConnection=(Connection)DriverManager.getConnection(url, "root", "");
                System.out.println("Database Connected");
            }
        catch(SQLException e){
            System.out.println("No Database" +e);
        }
        return DBConnection;
    }
    
    
    
    
}
