

/**
 *
 * @author Hernan
 */
public class Supermercado {
    
    public static void main(String[] args) {
        
        Abarrote harina = new Abarrote(3, 1, "Con polvos",2000, 3);
        Liquido vodka = new Liquido(40, 2, "sin sabor", 5000, 1);
        Aseo poett = new Aseo("Exterior", 3, "para pisos", 2500, 2);
        Congelado helado = new Congelado(-8, 4, "sabor frutilla", 1700, 3);
        Oferta papasFritas = new Oferta(10, 5, "Lays", 1200, 2);
        
        Coleccion lista = new Coleccion();
        Producto prod = new Producto();
        
        lista.agregar(harina);
        lista.agregar(vodka);
        lista.agregar(poett);
        lista.agregar(helado);
        lista.agregar(papasFritas);
        
        lista.mostrarLista();
        lista.calcularTotal();
        
        prod.agregarComentario("Gracias por preferirnos");
        vodka.prueba();
    }
    
}
