/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import Domain.Espacio;
import Domain.Tablero;
import GUI.Jugador;
import java.io.IOException;

/**
 *
 * @author rodri
 */
public class Partida {
    
    private static Partida instancePartida;
    private  int turno;
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tableroJugador1;
    private Tablero tableroJugador2;
    private int cantidadBarcos;

    public int getCantidadBarcos() {
        return cantidadBarcos;
    }

    public void setCantidadBarcos(int cantidadBarcos) {
        this.cantidadBarcos = cantidadBarcos;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public Tablero getTableroJugador1() {
        return tableroJugador1;
    }

    public void setTableroJugador1(Tablero tableroJugador1) {
        this.tableroJugador1 = tableroJugador1;
    }

    public Tablero getTableroJugador2() {
        return tableroJugador2;
    }

    public void setTableroJugador2(Tablero tableroJugador2) {
        this.tableroJugador2 = tableroJugador2;
    }
 
    
     public static Partida getInstance() throws IOException {
        if (instancePartida == null) {

            instancePartida = new Partida();
        }
        return instancePartida;

    }
     
     
     private Partida(){
     
     
         this.turno=0;
         
         this.tableroJugador1= new Tablero();
         this.tableroJugador2=new Tablero();
         this.jugador1= new Jugador();
         this.jugador2= new Jugador();
     
     
     
     }
     
     
     //Permite llenar el espacio del tablero para luego ser seleccionado con posiciones del barco 
     public void llenarTableroJugador1(){
     
                
         for (int i = 0; i < this.tableroJugador1.getEspacioJuego().length; i++) {
             
             for (int j = 0; j < this.tableroJugador1.getEspacioJuego().length; j++) {
                 Espacio espacio= new Espacio(j*45+5, i*45+5, i, j,1);
                 
                 
                 this.tableroJugador1.insertarEspacio(espacio, i, j);
                 
                 
             }
             
         }
     
     
     
     
     }
     
     
     
     
     
     
     
     
    
    
}
