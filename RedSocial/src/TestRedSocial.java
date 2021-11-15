
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author isaac
 */
public class TestRedSocial {
    
    public static void main(String[] args) {
        
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat ("EEEE dd 'de' MMMM 'del' yyyy");
        Instagram insta = new Instagram(1, "Siuuu", true, "Carlos", "123");
        Twitter twit = new Twitter(2, "Mamamelwebo gabi", fecha, "Kevin", "Sisaxd");
        
        insta.visualizarUsuario();
        System.out.println("***********");
        twit.visualizarUsuario();
        System.out.println(formato.format(fecha));
        
    }    
        
}
    