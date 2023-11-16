/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Connet {
    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/parcial","root","");
            System.out.println("Conetado");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return cn;
    }
}
