package DAO;

import MODEL.Users;
import interfacesDAO.Iusers;
import java.sql.Connection;
import java.sql.Statement;
import Conexion.conex;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public class users implements Iusers{

    @Override
    public boolean registrar(Users usuarios) {
        boolean registrarUse = false;
        Statement sta = null;
        Connection con = null;
        String sql = "INSERT INTO public.users(username, password) VALUES ('"+usuarios.getUsername()+"', '"+usuarios.getPassword()+"');";
        try {
           con = conex.getConexion();
           sta = con.createStatement();
           sta.execute(sql);
           registrarUse = true;
           sta.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return registrarUse;
    }

    @Override
    public List<Users> obtener() {
        return null;
    }

    @Override
    public boolean actualizar(Users usuario) {
        return false;
    }

    @Override
    public boolean eliminar(Users usuario) {
        return false;
    }

    @Override
    public boolean validarInicioSeccion(Users usuarios) {
         boolean VeriaficarUsuario = false;
        Statement sta = null;
        Connection con = null;
        String sql = "SELECT * FROM public.users WHERE username='"+usuarios.getUsername()+"' AND password='"+usuarios.getPassword()+"';";
        try {
            con = conex.getConexion();
            sta = con.createStatement();
            sta.execute(sql);
            VeriaficarUsuario = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return VeriaficarUsuario;
    }
    
    
}
