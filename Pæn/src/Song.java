/**
 *
 * @author isaac
 */
public class Song {
    
    private String titulo, artista;
    private int tiempoDuracion;
    private boolean favorito;
    private char descargado;

    public Song() {
    }

    public Song(String titulo, String artista, int tiempoDuracion, boolean favorito, char descargado) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorito = favorito;
        this.descargado = descargado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public char getDescargado() {
        return descargado;
    }

    public void setDescargado(char descargado) {
        this.descargado = descargado;
    }

    @Override
    public String toString() {
        return "Song{" + "titulo=" + titulo + ", artista=" + artista + ", tiempoDuracion=" + tiempoDuracion + ", favorito=" + favorito + ", descargado=" + descargado + '}';
    }
    
    //metodos customers
    public int adelantarCancion(int segundosAdd, int segundosActuales){
        segundosActuales+= segundosAdd;
        
        return segundosActuales;
    }
    
    public void imprimirCanciones(){
        //variables locales
        int minutos = 0;
        int segundos = 0;
        
        minutos = this.tiempoDuracion  /60;
        segundos = this.tiempoDuracion - minutos *60;
        
        System.out.println("Cancion: "+this.getTitulo());
        System.out.println("Artista: "+this.artista);
        System.out.println("Duracion: " +minutos+ ":"+ segundos);
        
        
    }
    
    public String obtenerTipoCancion(){
        //5 minutos * 60 segundos
        if (this.tiempoDuracion >= 300){
            return "Larga";
        }
        else{
            return "normal";
        }  
    }
    

    
}
