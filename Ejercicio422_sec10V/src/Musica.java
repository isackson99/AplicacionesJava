

/**
 *
 * @author USRVI-LC3
 */
public class Musica extends Intereses{
    
    private String tipoMusica;

    public Musica() {
    }

    public Musica(String tipoMusica, String usuario, String password, int tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
        
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}' + super.toString();
    }

//    @Override
//    public void visualizarUsuario() {
//        super.visualizarUsuario(); 
//        System.out.println("Tipo Musica: " + this.getTipoMusica());
//    }

    @Override
    public void visualizarUsuario() {
        System.out.println("Usuario     : " + super.getUsuario());
        System.out.println("Tipo Música : " + this.getTipoMusica());
    }

    @Override
    public void almacenarLikes(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado Música:" + super.getTiempoConectado());
    }
    
    
    
    
    
    
    
}
