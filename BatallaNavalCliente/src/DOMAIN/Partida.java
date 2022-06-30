/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOMAIN;

import Domain.Espacio;
import Domain.Tablero;
import GUI.Jugador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author rodri
 */
public class Partida {

    private static Partida instancePartida;
    private int turno;
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tableroJugador1;
    private Tablero tableroJugador2;
    private int cantidadBarcos;
    private Estadistica estadisticaJugador1;
    private ArrayList<Posicion>espacioComputadora;
    
    private int aciertoComputadora;
    private long tiempoInicial;


    
    private boolean continuo;

    public int getCantidadBarcos() {
        return cantidadBarcos;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
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

    private Partida() {

        this.turno = 1;

        this.tableroJugador1 = new Tablero();
        this.tableroJugador2 = new Tablero();
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.estadisticaJugador1=new Estadistica();
        this.continuo=true;
        this.espacioComputadora= new ArrayList<>();

    }

    //Permite llenar el espacio del tablero para luego ser seleccionado con posiciones del barco 
    public void llenarTableroJugador1() {

        for (int i = 0; i < this.tableroJugador1.getEspacioJuego().length; i++) {

            for (int j = 0; j < this.tableroJugador1.getEspacioJuego().length; j++) {
                Espacio espacio = new Espacio(j * 45 + 5, i * 45 + 5, i, j, 1);

                this.tableroJugador1.insertarEspacio(espacio, i, j);

            }

        }

    }
    
    
    public void llenarTableroComputadora(){
        for (int i = 0; i < this.tableroJugador2.getEspacioJuego().length; i++) {

            for (int j = 0; j < this.tableroJugador2.getEspacioJuego().length; j++) {
                Espacio espacio = new Espacio(j * 45 + 5, i * 45 + 5, i, j, 1);

                this.tableroJugador2.insertarEspacio(espacio, i, j);

            }

        }
    
    
    }
    
    
    //Crea naves para el jugador dos que es la computadora
    public void llenarTableroComputadorNave() {

        int cantidadBarcosAllenar = 0;

        while (cantidadBarcosAllenar < this.cantidadBarcos) {
            
            int tempI=posicion();
            int tempJ=posicion();
            
            if(!existeNave(tempI, tempJ)){
                Espacio tempTablero [][]= this.tableroJugador2.getEspacioJuego();
            // pone un tablero oculto con la imagen del barco a atacar
               tempTablero[tempI][tempJ].setTipo(4);
               tempTablero[tempI][tempJ].setOculto(true);
               this.tableroJugador2.getEspacioJuego()[tempI][tempJ]=tempTablero[tempI][tempJ];
               //agrego a mi lista de barcos
               
               this.jugador2.setNave(tempTablero[tempI][tempJ]);
               
               cantidadBarcosAllenar=cantidadBarcosAllenar+1;
               
            
            
            }
            
            
            
           

        }

    }

    //me duevuelve posicion tablero para colocar una nave
    private int posicion() {

        Random numAleatorio = new Random();

        int n = numAleatorio.nextInt(9 - 0 + 1) + 0;
        return n;

    }
    
    
    //valida que no se repitan naves a la hora crear tablero para computador
    private boolean existeNave(int i, int j) {

        boolean existeNave = false;
        for (int k = 0; k < this.jugador2.getNaveUnEspacio().size(); k++) {
            Espacio temp = this.jugador2.getNaveUnEspacio().get(k).getUnEspacio();

            if (temp.getI() == i && temp.getJ() == j) {

                existeNave = true;

            }

        }

        return existeNave;

    }

    public Estadistica getEstadisticaJugador1() {
        return estadisticaJugador1;
    }

    public void setEstadisticaJugador1(Estadistica estadisticaJugador1) {
        this.estadisticaJugador1 = estadisticaJugador1;
    }

    public static Partida getInstancePartida() {
        return instancePartida;
    }

    public static void setInstancePartida(Partida instancePartida) {
        Partida.instancePartida = instancePartida;
    }

    public boolean isContinuo() {
        return continuo;
    }

    public void setContinuo(boolean continuo) {
        this.continuo = continuo;
    }
    
    
    
    public void turnoComputadora(){
        
        
        boolean busco=true;
        
        while (busco) {
            
            int i = posicion();
            int j=posicion();
            
            if(!existePosicionTocada(i, j)){
        
                Posicion posicion = new Posicion();

                posicion.setI(i);
                posicion.setJ(j);
                
                this.espacioComputadora.add(posicion);
                
                
               Espacio  espacio[][]= this.tableroJugador1.getEspacioJuego();
               
               
                if(espacio[i][j].getTipo()==1){
                    
                    System.out.println("i : "+ i+" J: "+j+" tipo : "+espacio[i][j].getTipo());
                    this.tableroJugador1.getEspacioJuego()[i][j].setTipo(3);
                    sonidoFallido();
                     System.out.println("Cambiado tipo: "+ this.tableroJugador1.getEspacioJuego()[i][j].getTipo());
                    
                
                
                
                
                }
                
                
                if(espacio[i][j].getTipo()==2){
                    System.out.println("i : "+ i+" J: "+j+" tipo : "+espacio[i][j].getTipo());
                    
                    this.tableroJugador1.getEspacioJuego()[i][j].setTipo(5);
                    this.aciertoComputadora=aciertoComputadora+1;
                
                    sonidoGanar();
                    System.out.println("Cambiado tipo: "+ this.tableroJugador1.getEspacioJuego()[i][j].getTipo());
                
                }
                
                
                
                busco=false;
        
        
        }
            
        }
        
        
        
 
    }
    
     private boolean existePosicionTocada(int i,int j){
         
         
         for (int k = 0; k < this.espacioComputadora.size(); k++) {
             
             if(this.espacioComputadora.get(k).getI()==i && this.espacioComputadora.get(k).getJ()==j){
             
                  return true;
                  
             
             }
             
             
         }
     
     return false;
     
     }
    
    
        public int getAciertoComputadora() {
        return aciertoComputadora;
    }

    public void setAciertoComputadora(int aciertoComputadora) {
        this.aciertoComputadora = aciertoComputadora;
    }
    
    
    
    public void sonidoGanar(){
    
        try {
          
          
         Clip sonido = AudioSystem.getClip();
      
         
         File a = new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\Sonido\\src\\sonido\\explosion.wav");
         sonido.open(AudioSystem.getAudioInputStream(a));
         sonido.start();
         System.out.println("Reproduciendo 3s. de sonido...");
         Thread.sleep(3000); // 3000 milisegundos (3 segundos)
         sonido.close();
      } catch (Exception tipoError) {
         System.out.println("" + tipoError); 
      }
    
    
    }
    
    
      
    public void sonidoFallido(){
    
        try {
          
          
         Clip sonido = AudioSystem.getClip();
      
         
         File a = new File("C:\\Users\\rodri\\OneDrive\\Escritorio\\Sonido\\src\\sonido\\agua.wav");
         sonido.open(AudioSystem.getAudioInputStream(a));
         sonido.start();
         System.out.println("Reproduciendo 3s. de sonido...");
         Thread.sleep(3000); // 3000 milisegundos (3 segundos)
         sonido.close();
      } catch (Exception tipoError) {
         System.out.println("" + tipoError); 
      }
    
    
    }
    
    
    public long tiempoInicial(){
    
        long startTime = System.currentTimeMillis();
    
    
        return startTime;
    
    }
    
     public long tiempoFinal(){
    
       long endTime   = System.currentTimeMillis();
    
    
        return endTime;
    
    }
    
    
    
    
    
    
    
    

}
