package MODEL;

/**
 *
 * @author castañosinning
 */
public class Roles {

    private int idRol;
    private String Rol;

//constrictor vacio
    public Roles() {
    }
//constructor lleno

    public Roles(String Rol) {
        this.idRol = idRol;
        this.Rol = Rol;
    } 
//metodos Set

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
//metodos Get 

    public int getIdRol() {
        return idRol;
    }

    public String getRol() {
        return Rol;
    }
    
 //metodo toString
    @Override
    public String toString(){
        return this.idRol+ " "+this.Rol;
    }
}
