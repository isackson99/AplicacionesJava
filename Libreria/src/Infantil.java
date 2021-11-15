
/**
 *
 * @author isaac serrano
 */
public class Infantil extends Libros{
    
    private String rangoEdad;

    public Infantil() {
    }

    public Infantil(String rangoEdad, String nombre, String autor, String descripcion, int tipo, int precio, int cantidad) {
        super(nombre, autor, descripcion, tipo, precio, cantidad);
        this.rangoEdad = rangoEdad;
    }


    public String getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(String rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    @Override
    public String toString() {
        return super.toString() + "Infantil{" + "rangoEdad=" + rangoEdad + '}';
    }
    
    public void mostrarLibro(){
        System.out.println("Nombre libro:" + super.getNombre());
        System.out.println("Rango de edad:" + rangoEdad );
    }
    
}