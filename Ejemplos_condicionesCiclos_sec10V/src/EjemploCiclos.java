

/**
 *
 * @author Hernan
 */
public class EjemploCiclos {
    
    private int run;//sin digito verificador
    private char sexo;// 'm' o 'f'

    public EjemploCiclos() {
    }

    public EjemploCiclos(int run, char sexo) {
        this.run = run;
        this.sexo = sexo;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "EjemploCiclos{" + "Run=" + run + ", Sexo=" + sexo + '}';
    }
    
    //customer
    public int verificarCandidatos(int edadHijo){
        int cantidad = 0;
        if(this.getSexo()=='f' && edadHijo < 18){
            //cantidad = cantidad +1;
            cantidad++;
        }
        return cantidad;
    }
    
    
    
    
}
