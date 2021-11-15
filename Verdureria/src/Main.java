import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Main {
    
        public static void main(String[] args) {
            
            //String resp = "s";
            //int cantidad = 0;
            //Scanner leer = new Scanner(System.in);
            
            Cliente cliente1 = new Cliente("isaac", "isaac@gmail.com", "valdivia", '7', 26526651, 931294847);
            Producto producto1 = new Producto(1000, 1000, 1, "Verdura", "Calabaza");
            Solicitud solicitud1 = new Solicitud(1, "09/09/2021", cliente1, producto1);
            
            solicitud1.imprimirSolicitud();
            
            
            
        }
    
    
    
    
    
    
    
}
