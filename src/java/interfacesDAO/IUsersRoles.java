package interfacesDAO;

//import de clases del modelo
import MODEL.Users;
import MODEL.usersRoles;
import java.util.List;

/**
 *
 * @author castañosinning
 */
public interface IUsersRoles {
 public boolean registrar(Users informacion);

    public List<usersRoles> obtener();

    public boolean actualizar(usersRoles informacion);

    public boolean eliminar(usersRoles informacion);
}
