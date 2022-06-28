/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

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
    
     public static Partida getInstance() throws IOException {
        if (instancePartida == null) {

            instancePartida = new Partida();
        }
        return instancePartida;

    }
     
     
     
    
    
}
