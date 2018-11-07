/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author castañosinning
 */
public class conex {
    public static Connection conexion;
   
    public static Connection getConexion() {
        try {
            if (conexion == null) {
                Class.forName("org.postgresql.Driver");
                conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inshot", "postgres", "juandas");
                System.out.println("Conexion Exitosa");
            }
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("conexion fallida", e);
        }
    }
    
}
