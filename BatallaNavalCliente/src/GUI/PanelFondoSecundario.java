package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class PanelFondoSecundario extends JPanel {

    private Image img = null;
    private int ancho, alto;

    public PanelFondoSecundario(int size, int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.setSize(this.ancho, this.alto);
        
      
        
            switch (size) {
            case 1 -> {
                this.img = new ImageIcon(getClass().getResource("/assets/fondo.png")).getImage();
                this.setSize(this.ancho, this.alto);
                }

            case 2 -> {
                this.img = new ImageIcon(getClass().getResource("/assets/fondoSecundario.png")).getImage();
                this.setSize(ancho, alto);
                }

            case 3 -> {
                this.img = new ImageIcon(getClass().getResource("/assets/fondoJuego.png")).getImage();
                this.setSize(ancho, alto);
                }

        }
        
        
        
        

      

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
     
         
             g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
         
        
    }

}
