/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DOMAIN.NaveUnEspacio;
import Domain.Espacio;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Jugador {
    
    
   private String nombre;
    private ArrayList<NaveUnEspacio> naveUnEspacio;
    
    
    public Jugador(){
    
        this.nombre="";
        this.naveUnEspacio=new ArrayList<>();
    
    
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNaveUnEspacio(ArrayList<NaveUnEspacio> naveUnEspacio) {
        this.naveUnEspacio = naveUnEspacio;
    }
    
    
    public void setNave(Espacio espacio) {
        
        NaveUnEspacio nave= new NaveUnEspacio(1, espacio);
        this.naveUnEspacio.add(nave);
    }
    
 

    public String getNombre() {
        return nombre;
    }

    public ArrayList<NaveUnEspacio> getNaveUnEspacio() {
        return naveUnEspacio;
    }
    
    
   
    
    
    
}
