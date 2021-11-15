

/**
 *
 * @author Hernan
 */
public class Abarrote extends Producto{
    
    private double peso;

    public Abarrote() {
    }

    public Abarrote(double peso, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Abarrote{" + "peso=" + peso + '}';
    }
    
    
    
}
