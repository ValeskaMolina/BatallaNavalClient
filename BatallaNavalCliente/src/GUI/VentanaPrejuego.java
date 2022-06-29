/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author rodri
 */
public class VentanaPrejuego extends JFrame  implements ActionListener{
    
     private PanelPrejuego panelTablero;
     private JLabel lblTipoBarco, lblForma;
     private JComboBox<String>tipoBarco;
     private JComboBox<String>tipoForma;
     private int cantidadBarcos;

    public JComboBox<String> getTipoForma() {
        return tipoForma;
    }
     private JButton btnContinuar;

    
    public VentanaPrejuego(int cantidadBarcos) throws IOException{ // constructor

        setTitle("BATALLA NAVAL");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(100,10);
        setSize(1020,560);
        setLayout(null);
        getContentPane().setBackground(new Color(29, 90, 112));
     
                
        panelTablero = new PanelPrejuego(cantidadBarcos,this);
        this.cantidadBarcos=cantidadBarcos;
        panelTablero.setBounds(0, 0, 700, 500);
        panelTablero.setLayout(null);  
        panelTablero.setBackground(new Color(29, 90, 112));
        
        this.lblTipoBarco= new JLabel("Tipo Barco:");
        this.lblTipoBarco.setBounds(715, 40,270, 30);
        this.lblTipoBarco.setForeground(Color.WHITE);
        this.lblTipoBarco.setBackground(new Color(49, 147, 189));
        this.lblTipoBarco.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblTipoBarco.setOpaque(true);
        
        
        tipoBarco=new JComboBox<String>();
        tipoBarco.setBounds(715,90,270,30);
        tipoBarco.addItem("Nave una casilla");
        this.tipoBarco.setForeground(Color.WHITE);
        this.tipoBarco.setBackground(new Color(136, 210, 242));
        this.tipoBarco.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.tipoBarco.setOpaque(true);
       
        
        this.lblForma= new JLabel("Posicion:");
        this.lblForma.setBounds(715, 150,270, 30);
        this.lblForma.setForeground(Color.WHITE);
        this.lblForma.setBackground(new Color(49, 147, 189));
        this.lblForma.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblForma.setOpaque(true);
        
        tipoForma=new JComboBox<String>();
        tipoForma.setBounds(715,190,270,30);
        tipoForma.addItem("Horizontal");
        tipoForma.addItem("vertical");
        
        this.tipoForma.setForeground(Color.WHITE);
        this.tipoForma.setBackground(new Color(136, 210, 242));
        this.tipoForma.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.tipoForma.setOpaque(true);
        
        
        this.btnContinuar = new JButton("Continuar");
        this.btnContinuar.setBounds(820, 340, 180, 70);
        this.btnContinuar.addActionListener(this);
        this.btnContinuar.setBackground(new Color(49, 147, 189));
        this.btnContinuar.setForeground(Color.WHITE);
        this.btnContinuar.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnContinuar.setOpaque(true);
        
        
        
        

        add(panelTablero);
        add(lblTipoBarco);
        add(tipoBarco);
        add(lblForma);
        add(tipoForma);
        add(btnContinuar);
        
        setVisible(true);
   
    }  
    
    
    public void mostrarMsj(){
    
    
        JOptionPane.showMessageDialog(this, "No se puede añadir mas barcos su maxmo es: "+this.cantidadBarcos);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Object selected = e.getSource();        

    } 



    
}
