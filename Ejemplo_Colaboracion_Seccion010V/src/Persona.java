

/**
 *
 * @author Hernan
 */
public class Persona {
    
    private int Rut; //solo parte numerica;
    private String nombre;
    private Celular celular;

    public Persona() {
    }

    public Persona(int Rut, String nombre, Celular celular) {
        //this.Rut = Rut;
        this.setRut(Rut);
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        if (Rut >4999999 && Rut <99999999) {
           this.Rut = Rut;  
        }
        else{
            System.out.println("Numero no válido!");
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Persona{" + "Rut=" + Rut + ", nombre=" + nombre + ", celular=" + celular + '}';
    }
    
    public void imprimirPersona(){
        System.out.println("Rut: " + this.getRut());
        System.out.println("Nombre: " + this.getNombre());
        celular.imprimirCelular();
        
    }
    
    
    
}
