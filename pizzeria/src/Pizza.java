/**
 *
 * @author isaac
 */

/*
Estos pasos estarán siempre en la misma clase.
1. Definir métodos Constructores ---> crear objetos -- con parámetros y sin parámetros
2. Definir métodos getter y setter
3. Definir métodos customer
Los siguientes métodos o pasos pueden estar en otra clase.
4. definir el método main
5. crear objetos
6. llamamos a los métodos con los objetos
*/
public class Pizza {
    
    //1. declarar variables
    
    private String nombre; //declaro la variable nombre de tipo String (texto)
    private String masa;
    private String tamaño;
    
    //contructor sin parametros
    public Pizza (){
        
    }
    
    //constructor con parametros
    public Pizza(String nombre,String tamaño,String masa){
        
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
        
    }
    
    //mutadores y accesadores
    //mutador de nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setTamaño(String nombre){
        this.tamaño = tamaño;
    }
    
    public void setMasa(String nombre){
        this.masa = masa;
    }
    
    //accesador de nombre
    public String getNombre(){
        return nombre;
    }
    public String getTamaño(){
        return tamaño;
    }
    public String getMasa(){
        return masa;
    }
    
    public void preparar() {

        System.out.println("Preparando..." + this.getNombre()); //sout + tab

    }



    public void calentar() {

        System.out.println("Calentando..."+nombre+" con masa: "+masa);

    }
    
    
    public static void main(String[] args) // metodo principal de la clase
    {
        //System.out.println("hola mundo");
        
        
        Pizza objPizza1 = new Pizza();//Crear objetos objPizza1
        Pizza objPizza2 = new Pizza();
        
        Pizza pizza3 = new Pizza("Napolitana","Muy Grande", "Rellena con queso");

        
        objPizza1.nombre = "Peperoni";
        objPizza1.masa = "Gruesa";
        objPizza1.tamaño = "Grande";
        objPizza1.setNombre("Pepperoni");
        //System.out.println("Nombre:" + objPizza1.nombre);
        
        objPizza2.nombre = "Vegetariana";
        objPizza2.masa = "Delgada";
        objPizza2.tamaño = "Familiar";
        
        objPizza1.calentar(); //usando metodos de la clase con objetos
        objPizza2.calentar();
        pizza3.calentar();
        System.out.println ("Nombre Pizza 1 :" + objPizza1.nombre);
        System.out.println ("Nombre Pizza 1 :" + objPizza2.nombre);
    }

}
