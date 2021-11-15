/**
 *
 * @author isaac
 */
public class Streaming {
    
    public static void main(String[] args) {
        //crear canciones
        Song objSong1 = new Song();
        Song objSong2 = new Song("Home", "Michael Buble", 240, true, 'S');
        
        objSong1.setTitulo("Highway to hell");
        objSong1.setArtista("AC-DC");
        objSong1.setFavorito(false);
        objSong1.setTiempoDuracion(300);
        objSong1.setDescargado('N');
        
        System.out.println(objSong1.getTitulo()+" "+objSong1.adelantarCancion(10, 0)+" segundos");
        System.out.println("**********************************");
        System.out.println(objSong1.obtenerTipoCancion());
        System.out.println(objSong1.toString());
        System.out.println("**********************************");
        System.out.println(objSong2.toString());
        System.out.println(objSong2.getTitulo()+" "+objSong1.adelantarCancion(10, 0)+" segundos");
        System.out.println(objSong2.obtenerTipoCancion());
    }
    
    
    
    
    
    
}
