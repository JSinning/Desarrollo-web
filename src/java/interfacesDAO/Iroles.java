package interfacesDAO;
//import de clases del modelo 

import MODEL.Roles;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface Iroles {

    public boolean registrar(Roles roles);

    public List<Roles> obtener();

    public boolean actualizar(Roles rol);

    public boolean eliminar(Roles rol);
}
