
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author isaac
 */
public class Empresa {
    
    private List<Empleado> listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }
    
    public boolean agregarEmpleado(Empleado emple){
        return listaEmpleados.add(emple);
    }
    
    public boolean buscarEmpleado (String rut){
        for (Empleado emple : listaEmpleados) {
            if (emple.getRut().equals(rut)){
                return true;
            }
        }
        return false;
    }
    
    public void listarEmpleados(){
        for (Empleado emple : listaEmpleados) {
            System.out.println(emple.toString());
        }
    }
    
    public boolean eliminarEmpleado(String rut){
        for (Empleado emple : listaEmpleados) {
            if (emple.getRut().equals(rut)){
                listaEmpleados.remove(emple);
                return true;
            }
        }
        return false;
    }
    
    
    
}
