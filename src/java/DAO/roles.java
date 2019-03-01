
package DAO;

import Conexion.conex;
import MODEL.Roles;
import interfacesDAO.Iroles;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public class roles implements Iroles{

    @Override
    public boolean registrar(Roles roles) {
        
      boolean registrarRoles = false;
        Statement sta = null;
        Connection con = null;
        String sql = "INSERT INTO public.roles(rol) VALUES ('"+roles.getRol()+"');";
        try {
           con = conex.getConexion();
           sta = con.createStatement();
           sta.execute(sql);
           registrarRoles = true;
           sta.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return registrarRoles;
    }

    @Override
    public List<Roles> obtener() {
        return null;
    }

    @Override
    public boolean actualizar(Roles rol) {
       return false;
    }

    @Override
    public boolean eliminar(Roles rol) {
       return false;
    }
    
}
