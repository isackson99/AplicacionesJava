
import java.util.Date;

/**
 *
 * @author isaac
 */
public class Twitter extends Redsocial{
    
    private int id;
    private String noticia;
    private Date fecha;
    
    public Twitter() {
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Twitter{" + "id=" + id + ", noticia=" + noticia + ", fecha=" + fecha + '}';
    } 

    @Override
    public void visualizarUsuario() {
        super.visualizarUsuario();
        System.out.println("Noticia: " + this.getNoticia());
    }
    
}
