
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class TestEjemploCiclos {
    
    public static void main(String[] args) {
        String resp ="s";
        int edad = 0,cantidad = 0;
        Scanner leer = new Scanner(System.in);
//        EjemploCiclos obj1 = new EjemploCiclos(123456, 'f');
//        System.out.println(obj1.verificarCandidatos(18));
        EjemploCiclos obj2 = new EjemploCiclos();
        
        while(!resp.equals("n")){
            System.out.print("Ingrese su run: ");
            obj2.setRun(leer.nextInt());
            System.out.print("Ingrese su sexo: ");
            String sexo = leer.next(); //ingrese de texto - String
            char sexoI = sexo.charAt(0); //traspasar el String a char
            obj2.setSexo(sexoI);
            System.out.print("Ingrese edad de su hijo: ");
            edad = leer.nextInt();
            cantidad = cantidad + obj2.verificarCandidatos(edad); //acumulador
            
            System.out.print("Deseas ingresar otro valor? (S/N): ");
            resp = leer.next();
            
        }
        System.out.println("Cantidad de hijos: " + cantidad);
        System.out.println("FIN");
    }
    
}
