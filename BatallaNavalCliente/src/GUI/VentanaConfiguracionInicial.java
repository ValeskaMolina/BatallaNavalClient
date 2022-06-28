/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author rodri
 */
public class VentanaConfiguracionInicial  extends JFrame implements ActionListener{
    
    
    private JLabel lblTitulo,lblNombreJugador,lblNaveUnaCasilla;
    private JButton btnContinuar;
    private JTextField jtxfNombreJugador,jtxfNaveUnaCasilla;
    public VentanaConfiguracionInicial(){
    
        init();
    
    
    
    
    }

    private void init() {
        
        setTitle("Batalla Naval");
        setSize(600, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(29, 90, 112));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        this.lblTitulo= new JLabel("BATALLA NAVAL");
        this.lblTitulo.setBounds(180, 15,250, 30);
        this.lblTitulo.setForeground(Color.WHITE);
        this.lblTitulo.setBackground(new Color(29, 90, 112));
        this.lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.lblTitulo.setOpaque(true);
        
        
        
        this.lblNombreJugador= new JLabel("NOMBRE JUGADOR");
        this.lblNombreJugador.setBounds(20, 90,250, 30);
        this.lblNombreJugador.setForeground(Color.WHITE);
        this.lblNombreJugador.setBackground(new Color(49, 147, 189));
        this.lblNombreJugador.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblNombreJugador.setOpaque(true);
        
        
        
        this.jtxfNombreJugador = new JTextField("");
        this.jtxfNombreJugador.setBackground(new Color(136, 210, 242));
        this.jtxfNombreJugador.setForeground(Color.WHITE);
        this.jtxfNombreJugador.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.jtxfNombreJugador.setBounds(280, 90, 250, 30);
        this.jtxfNombreJugador.setOpaque(true);
        
        
        
        this.lblNaveUnaCasilla= new JLabel("CANTIDAD NAVE UNA CASILLA");
        this.lblNaveUnaCasilla.setBounds(20, 130,250, 30);
        this.lblNaveUnaCasilla.setForeground(Color.WHITE);
        this.lblNaveUnaCasilla.setBackground(new Color(49, 147, 189));
        this.lblNaveUnaCasilla.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblNaveUnaCasilla.setOpaque(true);
        
        
        
        this.jtxfNaveUnaCasilla = new JTextField("");
        this.jtxfNaveUnaCasilla.setBackground(new Color(136, 210, 242));
        this.jtxfNaveUnaCasilla.setForeground(Color.WHITE);
        this.jtxfNaveUnaCasilla.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.jtxfNaveUnaCasilla.setBounds(280, 130, 250, 30);
        this.jtxfNaveUnaCasilla.setOpaque(true);
        
        
        this.btnContinuar = new JButton("Continuar");
        this.btnContinuar.setBounds(390, 190, 120, 50);
        
        this.btnContinuar.setBackground(new Color(49, 147, 189));
        this.btnContinuar.setForeground(Color.WHITE);
        this.btnContinuar.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnContinuar.setOpaque(true);
        this.btnContinuar.addActionListener(this);
        
        add(lblTitulo);
        add(lblNombreJugador);
        add(jtxfNombreJugador);
        
        add(lblNaveUnaCasilla);
        
        add(jtxfNaveUnaCasilla);
        add(btnContinuar);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.btnContinuar)
        {
            if(this.jtxfNaveUnaCasilla.getText().length() != 0 && this.jtxfNombreJugador.getText().length() != 0 ){
        
                int cantidadNave= Integer.parseInt(this.jtxfNaveUnaCasilla.getText());
                
                String nombreJugador=this.jtxfNombreJugador.getText();
            
                if(cantidadNave>100){
                
                     JOptionPane.showMessageDialog(this, "No puede existir mas de 100 naves", "", JOptionPane.ERROR_MESSAGE);
                
                
                
                }else{
                
                
                    //va ventana llenar tablero 
                
                }
                
                
            
            
            }else{
            
                    JOptionPane.showMessageDialog(this, "Los campos no pueden ir vacios", "", JOptionPane.ERROR_MESSAGE);
            
            
            }
                
        }
        
    }
        
    }
    
    