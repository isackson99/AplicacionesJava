
/**
 *
 * @author isaac
 */
public class Instagram extends Redsocial{
    
    private int id;
    private String historia;
    private boolean estado;

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public Instagram() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Instagram{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}';
    }

    @Override
    public void visualizarUsuario() {
        super.visualizarUsuario(); 
        System.out.println("Historia: " + this.getHistoria());
    }
   
    
}
