

/**
 *
 * @author Hernan
 */
public class TestPersona {
    
    public static void main(String[] args) {
        
        Celular celu = new Celular(123, "XANXO", "OIGN", 123456789);
        Celular celu2 = new Celular(456, "IPHONE", "12", 987654321);
        Persona per1 = new Persona(5114695, "Juan", celu);
        Persona per2 = new Persona(5144695, "Pedro", celu2);
        
        
        //System.out.println(per1.toString());
        per1.imprimirPersona();
        per2.imprimirPersona();
        
        
    }
    
}
