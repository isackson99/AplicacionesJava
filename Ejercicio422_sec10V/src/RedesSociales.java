

/**
 *
 * @author USRVI-LC3
 */
public class RedesSociales extends Intereses{
    
    private String nombreRedSocial;

    public RedesSociales() {
    }

    public RedesSociales(String nombreRedSocial, String usuario, String password, int tiempoConectado) {
        super(usuario, password, tiempoConectado);
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return "RedesSociales{" + "nombreRedSocial=" + nombreRedSocial + '}'+super.toString();
    }

    @Override
    public void visualizarUsuario() {
        System.out.println("Usuario          : " + super.getUsuario());
        System.out.println("Nombre Red Social: " + this.getNombreRedSocial());
    }

    @Override
    public void almacenarLikes(int likes) {
        System.out.println("Likes: " + likes);
        System.out.println("Tiempo Conectado RRSS:" + super.getTiempoConectado());
    }
    
    
    
}
