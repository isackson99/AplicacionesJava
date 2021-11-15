import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class EjemploSi {
    
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        //int edad = 0;
        //uso de switch
        System.out.print("Ingrese año de estudio(1-4): ");
        int curso = leer.nextInt();
        
        switch(curso){
            case 1:
                System.out.println("Mechon");
                break;
            case 2:
                System.out.println("En la mitad de su carrera");
                break;
            case 3:
                System.out.println("Estas casi terminando");
                break;
            case 4:
                System.out.println("Falta nada para que seas profesional");
                break;
            default:
                System.out.println("No se encuntra el numero.");
                break;
        }
    }
    
}
