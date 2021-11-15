

/**
 *
 * @author isaac serrano
 */
public abstract class Libros{
    
    protected String nombre, autor, descripcion;
    protected int precio, tipo;
    protected int cantidad;

            
    public Libros() {
    }

    public Libros(String nombre, String autor, String descripcion, int tipo, int precio, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
//tipo 1 = infantil, tipo 2 = deportes
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", autor=" + autor + ", descripcion=" + descripcion + ", tipo=" + tipo + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    public abstract void mostrarLibro();
    
}
