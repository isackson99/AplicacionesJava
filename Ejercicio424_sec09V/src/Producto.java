
/**
 *
 * @author Hernan
 */
public  class Producto implements Comentario{
    
    protected int codigo;
    protected String descripcion;
    protected int precio;
    protected int cantidad;

    public Producto() {
    }

    public Producto(int codigo, String descripcion, int precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

     @Override
    public void agregarComentario(String comentario) {
        System.out.println("Comentario: " + comentario);
    }

  
    public void prueba(){
        System.out.println("Prueba");
    }
    
    
}
