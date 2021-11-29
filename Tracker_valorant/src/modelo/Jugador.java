package Modelo;

/**
 *
 * @author Isaac Serrano
 * @version 23/11/2021
 */
public class Jugador {
    
    private double kills, muerte;
    private int idjugador;
    private String nombre, rango;
    private boolean baneado;

    public Jugador() {
    }

    public Jugador(int idjugador,String nombre , String rango,double kills , double muerte, boolean baneado) {
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

    public double getKills() {
        return kills;
    }

    public void setKills(double kills) {
        this.kills = kills;
    }

    public double getMuerte() {
        return muerte;
    }

    public void setMuerte(double muerte) {
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
