package interfacesDAO;
//import de las clase del modelo

import MODEL.Users;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface users {

    public boolean registrar(Users usurios);

    public List<Users> obtener();

    public boolean actualizar(Users usuario);

    public boolean eliminar(Users usuario);
}
