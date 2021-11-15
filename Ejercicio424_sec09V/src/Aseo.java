

/**
 *
 * @author Hernan
 */
public class Aseo extends Producto{
    
    private String tipo;

    public Aseo() {
    }

    public Aseo(String tipo, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Aseo{" + "tipo=" + tipo + '}';
    }
    
    
    
}
