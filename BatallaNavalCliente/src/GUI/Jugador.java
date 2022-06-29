/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DOMAIN.NaveUnEspacio;
import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Jugador {

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNaveUnEspacio(ArrayList<NaveUnEspacio> naveUnEspacio) {
        this.naveUnEspacio = naveUnEspacio;
    }
    
    private String nombre;
    private ArrayList<NaveUnEspacio> naveUnEspacio;

    public String getNombre() {
        return nombre;
    }

    public ArrayList<NaveUnEspacio> getNaveUnEspacio() {
        return naveUnEspacio;
    }
    
    
   
    
    
    
}
