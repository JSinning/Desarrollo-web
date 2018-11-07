/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author castañosinning
 */
public class ReguistrosUsersDAO {

    Statement stm = null;
    ResultSet res = null;

    public boolean validarUsers(String Users, String Password) {
        String Sql = "Select * From users where nombre= '" + Users + "' AND password= '" + Password + "'";
        if (verificar(Sql) == 1) {
            return true;
        } else {
            return false;
        }
    }

    //verifica si exite alguien en la lista;
    public int verificar(String sql) {
        try {
            stm = Conexion.conex.getConexion().createStatement();
            res = stm.executeQuery(sql);
            if (res.next()) {
                return 1;
            }
            stm.close();
        } catch (SQLException e) {
            throw new RuntimeException("no encontro el usurio" + e);
        }
        return -1;
    }
}
