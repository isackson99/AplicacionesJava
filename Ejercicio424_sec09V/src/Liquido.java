

/**
 *
 * @author Hernan
 */
public class Liquido extends Producto{
    
    private int gradoAlcohol;

    public Liquido() {
    }

    public Liquido(int gradoAlcohol, int codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.gradoAlcohol = gradoAlcohol;
    }

    public int getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(int gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    @Override
    public String toString() {
        return super.toString()+" Liquido{" + "gradoAlcohol=" + gradoAlcohol + '}';
    }

  public void listar(){
      System.out.println("grado alcohol: " + this.getGradoAlcohol());
      System.out.println("Codigo: " + super.getCodigo());
      
  }

    @Override
    public void prueba() {
        super.prueba(); 
        System.out.println("Liquido");
    }
    
  
    
    
    
}
