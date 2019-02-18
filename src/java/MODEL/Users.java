package MODEL;

/**
 *
 * @author castañosinning
 */
public class Users {

    private String username;
    private String password;
//constructor vacio
    public Users() {
    }
//contructor lleno
    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
    

    //metodos Set
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
//metodos GET

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
//meto toString
    @Override
    public String toString(){
        return this.username+ " "+ this.password;
    }
}
