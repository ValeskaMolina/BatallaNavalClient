package GUI;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class VentanaPrincipal extends JFrame implements ActionListener {

    private JDesktopPane desktoPane;
    private JMenuBar jmbMenu;
    private JMenu jmNuevoJuego,jmSalonFama,jmAbrir,jmAyuda;
    
    private JMenuItem nuevoJuego;
    private JMenuItem salonFama;
    private JMenuItem ABRIR;
   private JMenuItem ayuda;
    private JPanel fondo;
   // private Cliente cliente;
    // private JMenuItem record;
    //private JPanel panelFondo;

    public VentanaPrincipal() throws IOException {
        super();//hace referencia al constructor del JFrame que extiende

        init();

    }//contructor

    private void init() throws IOException {

        this.setSize(800, 600);
        this.setLayout(null);
        this.setTitle("Batalla Naval");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.desktoPane = new JDesktopPane();
        //this.desktoPane.setSize(800, 600);
        this.desktoPane.setBounds(0, 20, 800, 600);
        add(desktoPane);
        //this.cliente = Cliente.instance();

        this.jmbMenu = new JMenuBar();
        this.jmbMenu.setBackground(new Color(136, 210, 242));
        this.jmbMenu.setSize(200, 200);
        this.jmbMenu.setOpaque(true);
        
        this.jmNuevoJuego = new JMenu("NUEVO JUEGO");
        jmNuevoJuego.setForeground(Color.WHITE);
        jmNuevoJuego.setBackground(new Color(49, 147, 189));
        jmNuevoJuego.setOpaque(true);
        jmNuevoJuego.addMouseListener(new MouseListener() {
            
           @Override
          public void mouseClicked(MouseEvent e) {
              
              VentanaModoJuego ventana= new VentanaModoJuego();
              ventana.setVisible(true);
              
              //aqui iria la ventana
           }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        this.jmSalonFama = new JMenu("SALON DE LA FAMA");
        jmSalonFama.setForeground(Color.WHITE);
        jmSalonFama.setBackground(new Color(49, 147, 189));
        jmSalonFama.setOpaque(true);
        jmSalonFama.addMouseListener(new MouseListener() {
            
           @Override
          public void mouseClicked(MouseEvent e) {
              JOptionPane.showConfirmDialog(null, "Salon fama");
               //aqui iria la ventana
           }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        this.jmAbrir = new JMenu("ABRIR");
        jmAbrir.setForeground(Color.WHITE);
        jmAbrir.setBackground(new Color(49, 147, 189));
        jmAbrir.setOpaque(true);
        jmAbrir.addMouseListener(new MouseListener() {
            
           @Override
          public void mouseClicked(MouseEvent e) {
              JOptionPane.showConfirmDialog(null, "presiono abrir");
               //aqui iria la ventana
           }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
         
        this.jmAyuda = new JMenu("AYUDA");
        jmAyuda.setForeground(Color.WHITE);
        jmAyuda.setBackground(new Color(49, 147, 189));
        jmAyuda.setOpaque(true);
        jmAyuda.addMouseListener(new MouseListener() {
            
           @Override
            public void mouseClicked(MouseEvent e) {
                Ayuda ventana= new Ayuda();
                ventana.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });

        this.jmbMenu.add(this.jmNuevoJuego);
         this.jmbMenu.add(this.jmSalonFama);
          this.jmbMenu.add(this.jmAbrir);
           this.jmbMenu.add(this.jmAyuda);
        this.jmbMenu.setBounds(0, 0, this.getWidth(), 20);

        //this.panelFondo= new PanelFondoSecundario(1, 800, 600);
        // panelFondo.setBounds(0, 0, 800, 600);
        //fondo = new PanelFondoSecundario(0, 800, 600);
       // fondo.setBounds(0, 0, 800, 600);
       
       // add(fondo);
        //this.add(panelFondo);
        
        
        fondo = new PanelFondoSecundario(1, 800, 600);
        fondo.setBounds(0, 0, 800, 600);
        this.add(this.jmbMenu);
        add(fondo);

        this.add(this.desktoPane);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jmNuevoJuego) {
            System.out.println("nuevo");
            JOptionPane.showConfirmDialog(null, "aqui va la ventana nuevo juego");
            //ventana nuevo juego 
        }
        if (e.getSource() == this.jmAyuda) {

            System.out.println("ayuda");
            //se abriria la ventana para fama
        }

        if (e.getSource() == this.ABRIR) {

            // se abriria la ventana para cargar tablero 

        }

    }

}
