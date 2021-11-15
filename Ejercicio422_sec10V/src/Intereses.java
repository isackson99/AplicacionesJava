

/**
 *
 * @author USRVI-LC3
 */
public abstract class Intereses implements LikesTiempo{
    
    protected String usuario;
    protected String password;
    protected int tiempoConectado;

    public Intereses() {
    }

    public Intereses(String usuario, String password, int tiempoConectado) {
        this.usuario = usuario;
        this.password = password;
        this.tiempoConectado = tiempoConectado;
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

    public int getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(int tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    @Override
    public String toString() {
        return "Intereses{" + "usuario=" + usuario + ", password=" + password + ", tiempoConectado=" + tiempoConectado + '}';
    }
    
//    public void visualizarUsuario()
//    {
//        System.out.println("Usuario: " + this.getUsuario());
//    }
    
    public abstract void visualizarUsuario();
    
    
}
