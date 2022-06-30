/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

/**
 *
 * @author rodri
 */
public class Estadistica {
    
    
    
    private long minutosDuroPartida;
    private int cantidadFallos;
    private int cantidadAciertos;
    private int totalJugadas;
    private String nombreJugador;

    public Estadistica() {
        this.minutosDuroPartida = 0;
        this.cantidadFallos = 0;
        this.cantidadAciertos=0;
        this.totalJugadas = 0;
        this.nombreJugador = "";
        
        
    }
    

    public long getMinutosDuroPartida() {
        return minutosDuroPartida;
    }

    public void setMinutosDuroPartida(long minutosDuroPartida) {
        this.minutosDuroPartida = minutosDuroPartida;
    }

    public int getCantidadFallos() {
        return cantidadFallos;
    }

    public void setCantidadFallos(int cantidadFallos) {
        this.cantidadFallos = this.cantidadFallos+cantidadFallos;
    }

    public int getCantidadAciertos() {
        return cantidadAciertos;
    }

    public void setCantidadAciertos(int cantidadAciertos) {
        this.cantidadAciertos = this.cantidadAciertos+cantidadAciertos;
    }

    public int getTotalJugadas() {
        return totalJugadas;
    }

    public void setTotalJugadas(int totalJugadas) {
        this.totalJugadas = totalJugadas;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    
    
    
   
    
    
}
