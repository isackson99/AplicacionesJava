

/**
 *
 * @author Hernan
 */
public class Oferta extends Producto{
    
    private int descuento;

    public Oferta() {
    }

    public Oferta(int descuento, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString()+"Oferta{" + "descuento=" + descuento + '}';
    }
    
//    public int totalPagar(int xCantidad){
//        super.setCantidad(xCantidad);
//        int total = super.getPrecio()*super.getCantidad();
//        return total;
//    }
    public int totalPagar(){
        
        int total = super.getPrecio()*super.getCantidad();
        return total;
    }
    
    public void listar(){
        System.out.println("Descuento: "+this.getDescuento());
        System.out.println("Codigo: " + super.getCodigo());
        
    }
    
    
}
