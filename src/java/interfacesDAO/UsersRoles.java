package interfacesDAO;

//import de clases del modelo
import MODEL.usersRoles;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface UsersRoles {
 public boolean registrar(usersRoles informacion);

    public List<usersRoles> obtener();

    public boolean actualizar(usersRoles informacion);

    public boolean eliminar(usersRoles informacion);
}
