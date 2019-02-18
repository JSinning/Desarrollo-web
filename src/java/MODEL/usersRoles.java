package MODEL;

/**
 *
 * @author castañosinning
 */
public class usersRoles {
    private String userName;
    private int rolId;
//constructor vacio

    public usersRoles() {
    }
//constructor lleno

    public usersRoles(String userName) {
        this.rolId=rolId;
        this.userName = userName;
    }
//metodos Set

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
//metodos Get

    public String getUserName() {
        return userName;
    }

    public int getRolId() {
        return rolId;
    }

//metodo toString
    @Override
    public String toString(){
    return this.rolId + " "+ this.userName;
}    
    
}
