/**
 *
 * @author isaac
 */
public class Cancion {
    
    private String titulo;
    private String artista;
    private String tiempo;
    private String favorito;
    private String descargado;

    public Cancion () {    
}
    public Cancion (String titulo,String artista,String tiempo, String favorito, String descargado) {
        
        this.titulo = titulo;
        this.artista = artista;
        this.tiempo = tiempo;
        this.favorito = favorito;
        this.descargado = descargado;                
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public void setTiempo(String tiempo){
        this.tiempo = tiempo;
    }
    public void setFavorito(String favorito){
        this.favorito = favorito;
    }
    public void setDescargado(String descargado){
        this.descargado = descargado;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getArtista(){
        return artista;
    }
    public String getTiempo(){
        return tiempo;
    }
    public String getFavorito(){
        return favorito;
    }
    public String getDescargado(){
        return descargado;
    }
    
    public void sonando(){
        System.out.println("Sonando:"+titulo+" del artista: "+artista+"..."+tiempo);
    }
    public void adelantar(){
        System.out.println("Adelantar +10 seg de la cancion "+titulo+", actualmente esta en "+tiempo);
    }
    
    public static void main(String[] args)
    {
        Cancion objCancion1 = new Cancion();
        Cancion objCancion2 = new Cancion();
        
        objCancion1.titulo = "Run";
        objCancion1.artista = "joji";
        objCancion1.tiempo = "1:16";
        objCancion1.descargado = "Si";
        objCancion1.favorito = "Si";
        objCancion1.setDescargado("No");
        
        objCancion2.titulo = "Youngblood";
        objCancion2.artista = "5SOS";
        objCancion2.tiempo = "2:56";
        objCancion2.descargado = "No";
        objCancion2.favorito = "Si";
        objCancion2.setFavorito("No");
        
        objCancion1.sonando();
        objCancion2.sonando();
        objCancion1.adelantar();
        objCancion2.adelantar();
    }
}
