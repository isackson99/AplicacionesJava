

/**
 *
 * @author USRVI-LC3
 */
public class SeriesTv extends Intereses{
    
    private String generoSerieTv;

    public SeriesTv() {
    }

    public SeriesTv(String generoSerieTv, String usuario, String password, int tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.generoSerieTv = generoSerieTv;
    }

    public String getGeneroSerieTv() {
        return generoSerieTv;
    }

    public void setGeneroSerieTv(String generoSerieTv) {
        this.generoSerieTv = generoSerieTv;
    }

    @Override
    public String toString() {
        return "SeriesTv{" + "generoSerieTv=" + generoSerieTv + '}' + super.toString();
    }

    @Override
    public void visualizarUsuario() {
        System.out.println("Usuario              : " + super.getUsuario());
        System.out.println("Género Pelicula/Serie: " + this.getGeneroSerieTv());
    
    }    

    @Override
    public void almacenarLikes(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado TV :" + super.getTiempoConectado());
    }
}
