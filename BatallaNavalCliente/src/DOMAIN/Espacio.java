
package Domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Espacio {
    
  
    private int x;
     private int y;
     private int i;
     private int j;
     private BufferedImage imagen;
     private int clicks;
     
     
    private int tipo;// 1 mar,2 fallido,3 imagen barco
    private boolean tocado;// cambia el tipo si es tocado.

  
    
    private int forma;//horizontal o vertical int 1 vertical 2 si es horizontal

    public Espacio(int x, int y, int i, int j, int tipo) {
        this.x = x;
        this.y = y;
        this.i = i;
        this.j = j;
        this.tocado=false;
        this.tipo=tipo;
        
    }
    
     public boolean mousePresionadoPreJuego(int xMouse, int yMouse,String forma){
         
        //  condición de que presionaron una casilla
        if ((xMouse >= this.x && xMouse <= this.x + 40) 
                && (yMouse >= this.y && yMouse <= this.y + 40)) {
            
                if(!this.tocado){
                
                
                
                    this.tipo=2;
                    this.tocado=true;
            
                    if(forma.equalsIgnoreCase("horizontal")){

                        this.forma=2;

                    }else{


                        this.forma=1;

                    }

                      return true; 
                
                
                }
            
                           
        }
        return false;
 
    }
    
    
    
    
    public  void draw(Graphics g) throws IOException {
       
        if(this.tipo==1){
            g.setColor(new Color(29, 65, 112));
            g.fillRect(x, y, 40, 40);
        }   
      
        if(this.tipo==2){
            
            if(this.forma==1){
                
            this.imagen=ImageIO.read(getClass().getResourceAsStream("/assets/barcoVertical.png"));
            g.drawImage(this.imagen, x, y, null);
            
            }else{
                this.imagen=ImageIO.read(getClass().getResourceAsStream("/assets/barcoHorizontal.png"));
               
            
                g.drawImage(this.imagen, x, y, null);
            
            }
           
        }
    
        if(this.tipo==3){
            
            //4
            
            
         this.imagen=ImageIO.read(getClass().getResourceAsStream("/assets/fallido.png"));
          g.drawImage(this.imagen, x, y, null);
           
          
        }
        
        
           if(this.tipo==4){
            
            //4
            
            
          this.imagen=ImageIO.read(getClass().getResourceAsStream("/assets/atacado.png"));
          g.drawImage(this.imagen, x, y, null);
           
          
        }
        
    }
    
      public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public boolean isTocado() {
        return tocado;
    }

    public void setTocado(boolean tocado) {
        this.tocado = tocado;
    }
    
    
    
    
    
    
    
    
    
    
    
    

    
 
    
    
}