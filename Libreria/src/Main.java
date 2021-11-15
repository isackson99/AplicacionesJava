
/**
 *
 * @author isaac serrano
 */
public class Main {
    
    public static void main(String[] args) {
        
        Coleccion lista = new Coleccion();
        Libros libro = new Libros() {
            @Override
            public void mostrarLibro() {
                
            }
        };
        
        Infantil libro1 = new Infantil("7-8 anos", "Una Familia Anormal: El misterio de la hechicera", "Vallejos, Lyna", "La youtuber y gamer con mas seguidores de la Argentina...",1, 10000, 1);
        Deportes libro2 = new Deportes("Ciclismo","Manual de la Bicicleta", "Sidwells, Chris", "Este manual basico de la bicicleta...",2, 11900, 1);
        
        lista.agregar(libro1);
        lista.agregar(libro2);
        
        lista.mostrarLibros();
        lista.sumarIva(1);
        lista.valorDescuento(libro.precio);
    }
    
}
