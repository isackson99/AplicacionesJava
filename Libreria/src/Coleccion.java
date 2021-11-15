
import java.util.ArrayList;


/**
 *
 * @author isaac serrano
 */
public class Coleccion implements Porcentajes{
        private ArrayList<Libros> listaLibros;
    private double total =0; 
    private Libros libro1;
    
    public Coleccion() {
        
        listaLibros = new ArrayList<>();
    }
    
    public void agregar(Libros libros){
        listaLibros.add(libros);
    }
    
    public void mostrarLibros(){
        for (Libros libros : listaLibros) {
            System.out.println(libros);
        }
    }
    
    @Override
    public void sumarIva(double iva) {
        for (Libros libros : listaLibros) {
            total = libros.getCantidad()*libros.getPrecio()*1.19 + total;
            
        }
        System.out.println("El total de la compra es: " + total);
    }

    @Override
    public void valorDescuento(int descuento) {
        if(libro1.tipo == 1)
            libro1.precio = (int) (libro1.precio * 0.95);
        else if (libro1.tipo == 2)
            libro1.precio = (int) (libro1.precio * 0.90);
        else
            System.out.println("No hay descuento");
    }
}
