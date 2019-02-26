package DAO;

import Conexion.conex;
import MODEL.Users;
import MODEL.usersRoles;
import interfacesDAO.IUsersRoles;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public class userRoles implements IUsersRoles{

    @Override
    public boolean registrar(Users informacion) {
        return false;
    }

    @Override
    public List<usersRoles> obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(usersRoles informacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(usersRoles informacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
