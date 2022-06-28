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
    
    
    
    private int minutosDuroPartida;
    private int cantidadFallos;
    private int totalJugadas;
    private String nombreJugador;

    public Estadistica(int minutosDuroPartida, int cantidadFallos, int totalJugadas, String nombreJugador) {
        this.minutosDuroPartida = minutosDuroPartida;
        this.cantidadFallos = cantidadFallos;
        this.totalJugadas = totalJugadas;
        this.nombreJugador = nombreJugador;
    }
    
    
    
}
