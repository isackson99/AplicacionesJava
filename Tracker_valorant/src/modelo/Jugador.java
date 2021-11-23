package Modelo;

/**
 *
 * @author Isaac Serrano
 * @version 23/11/2021
 */
public class Jugador {
    
    private int idjugador, kills, muerte;
    private String nombre, rango;
    private boolean baneado;

    public Jugador() {
    }

    public Jugador(int idjugador, int kills, int muerte, String nombre, String rango, boolean baneado) {
        this.idjugador = idjugador;
        this.kills = kills;
        this.muerte = muerte;
        this.nombre = nombre;
        this.rango = rango;
        this.baneado = baneado;
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getMuerte() {
        return muerte;
    }

    public void setMuerte(int muerte) {
        this.muerte = muerte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public boolean isBaneado() {
        return baneado;
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }
    
    
    
}
