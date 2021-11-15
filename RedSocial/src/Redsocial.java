/**
 *
 * @author isaac
 */
public class Redsocial {
    
    protected String usuario, password;

    public Redsocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Redsocial() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Redsocial{" + "usuario=" + usuario + ", password=" + password + '}';
    }
    
    public void visualizarUsuario(){
        System.out.println("Usuario: " + this.getUsuario());
    }
    
}
