

/**
 *
 * @author Hernan
 */
public class Congelado extends Producto{
    
    private double temperatura;

    public Congelado() {
    }

    public Congelado(double temperatura, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString()+"Congelado{" + "temperatura=" + temperatura + '}';
    }
    
    
    
}
