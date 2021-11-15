
import java.util.ArrayList;


/**
 *
 * @author USRVI-LC3
 */
public class TestIntereses {
    
    public static void main(String[] args) {
        
        Musica mus1 = new Musica("POP", "juan", "123", 60);
        SeriesTv tv1 = new SeriesTv("Comedia", "juan", "123", 10);
        RedesSociales rs1 = new RedesSociales("Instagram", "juan", "123", 550); 
        
        ArrayList<Intereses> listaIntereses = new ArrayList<>();
        
        listaIntereses.add(mus1);
        listaIntereses.add(tv1);
        listaIntereses.add(rs1);
        
        
        System.out.println(listaIntereses);
        
        
        int mayor = 0;
        String tema="";
        //mayor tiempo de conexion
        for (int i = 0; i < listaIntereses.size(); i++) {
            if (listaIntereses.get(i).getTiempoConectado() > mayor) {
                mayor = listaIntereses.get(i).getTiempoConectado();
                tema = listaIntereses.get(i).getClass().getName();
            }
        }
        
        System.out.println("El mayor tiempo de conexion es: " + mayor + 
                " y el tema es: " + tema);
       
        
        
        
        
    }
    
}
