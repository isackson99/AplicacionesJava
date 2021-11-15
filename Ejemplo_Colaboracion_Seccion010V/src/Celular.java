

/**
 *
 * @author Hernan
 */
public class Celular {
    
    private int codigoCelular;
    private String marcaCelular,modelo;
    private int numCelular;

    public Celular() {
    }

    public Celular(int codigoCelular, String marcaCelular, String modelo, int numCelular) {
        this.codigoCelular = codigoCelular;
        this.marcaCelular = marcaCelular;
        this.modelo = modelo;
        this.numCelular = numCelular;
    }

    public int getCodigoCelular() {
        return codigoCelular;
    }

    public void setCodigoCelular(int codigoCelular) {
        this.codigoCelular = codigoCelular;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public void setMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

                // volver a escribir un método que ya esta escrito en una clase superior, 
    @Override   //en este caso en la clase "Object"
    public String toString() {
        return "Celular{" + "codigoCelular=" + codigoCelular + ", marcaCelular=" + marcaCelular + ", modelo=" + modelo + ", numCelular=" + numCelular + '}';
    }
    //para poder mostrar el toString() debo llamarlo con un System.out.println()
    //System.out.println(toString());
    //System.out.println(objetoClase);
    
    public void imprimirCelular(){
        System.out.println("Código Celular : " + this.getCodigoCelular());
        System.out.println("Marca Celular: " + this.getMarcaCelular());
        System.out.println("Modelo Celular: " + this.getModelo());
        System.out.println("Número Celular: " + this.getNumCelular());
    }
    
    //customer
    public void llamarCelular(int num_a_llamar){
        System.out.println("Llamando al numero: "+ num_a_llamar + " desde el numero: " +this.getNumCelular());
    }
}
