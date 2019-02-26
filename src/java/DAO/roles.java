
package DAO;

import MODEL.Roles;
import interfacesDAO.Iroles;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public class roles implements Iroles{

    @Override
    public boolean registrar(Roles roles) {
       return false;
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
