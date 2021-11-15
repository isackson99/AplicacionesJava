
/**
 *
 * @author isaac serrano
 */
public class Deportes extends Libros{
    
    private String tipoDeporte;

    public Deportes() {
    }

    public Deportes(String tipoDeporte, String nombre, String autor, String descripcion, int tipo, int precio, int cantidad) {
        super(nombre, autor, descripcion, tipo, precio, cantidad);
        this.tipoDeporte = tipoDeporte;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    @Override
    public String toString() {
        return "Deportes{" + "tipo1=" + tipoDeporte + '}';
    }

        public void mostrarLibro(){
        System.out.println("Nombre libro:" + super.getNombre());
        System.out.println("Tipo de deporte: " + tipoDeporte);
    }

    
    
}
