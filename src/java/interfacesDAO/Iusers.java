package interfacesDAO;
//import de las clase del modelo

import MODEL.Users;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface Iusers {
    public boolean validarInicioSeccion(Users usuarios);

    public boolean registrar(Users usuarios);

    public List<Users> obtener();

    public boolean actualizar(Users usuario);

    public boolean eliminar(Users usuario);
}
