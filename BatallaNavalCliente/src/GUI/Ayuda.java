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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Kevin
 */
public class Ayuda extends JFrame implements ActionListener{
    
    private JLabel lblIp;
    private JButton btnCerrar;
    private JLabel lblIp1;
    private JLabel lblIp2;
    private JLabel lblIp3;
    private JLabel lblIp4;
    private JLabel lblIp5;
    private JLabel lblIp6;
    private JLabel lblIp10;
    private JLabel lblIp9;
    private JLabel lblIp8;
    private JLabel lblIp7;
    private JLabel lblIpindi1;
    private JLabel lblIpindi2;
    private JLabel lblIpindi3;
    private JLabel lblIpindi4;
    private JLabel lblIpindi5;
    private JLabel lblIpindi6;
    private JLabel lblIpindi7;
    private JLabel lblIpindi8;
    
    public Ayuda(){
        init();    
    }
    
    private void init(){
    
        setTitle("Menú Ayuda");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(29, 90, 112));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        this.lblIp= new JLabel("             INDICACIONES");
        this.lblIp.setBounds(18, 40, 468, 50);
        this.lblIp.setForeground(Color.WHITE);
        this.lblIp.setBackground(new Color(49, 147, 189));
        this.lblIp.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.lblIp.setOpaque(true);
        
        this.lblIpindi1 = new JLabel(" Comienza colocando todos tus barcos en el mapa."); 
        this.lblIpindi1.setBounds(18, 100, 468, 40);
        this.lblIpindi1.setBackground(new Color(136, 210, 242));
        this.lblIpindi1.setForeground(Color.BLACK);
        this.lblIpindi1.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi1.setOpaque(true);
        
        this.lblIpindi2 = new JLabel(" En cada turno, haz click en la rejilla para "); 
        this.lblIpindi2.setBounds(18, 125, 468, 40);
        this.lblIpindi2.setBackground(new Color(136, 210, 242));
        this.lblIpindi2.setForeground(Color.BLACK);
        this.lblIpindi2.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi2.setOpaque(true);
        
        this.lblIpindi3 = new JLabel(" detectar y explotar los barcos de tu adversario."); 
        this.lblIpindi3.setBounds(18, 150, 468, 40);
        this.lblIpindi3.setBackground(new Color(136, 210, 242));
        this.lblIpindi3.setForeground(Color.BLACK);
        this.lblIpindi3.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi3.setOpaque(true);
        
        this.lblIpindi4 = new JLabel(" Cuentas con 3 tipos de barcos, una casilla, "); 
        this.lblIpindi4.setBounds(18, 175, 468, 40);
        this.lblIpindi4.setBackground(new Color(136, 210, 242));
        this.lblIpindi4.setForeground(Color.BLACK);
        this.lblIpindi4.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi4.setOpaque(true);
        
        this.lblIpindi5 = new JLabel(" dos casillas y de tres casillas. El juego se "); 
        this.lblIpindi5.setBounds(18, 200, 468, 40);
        this.lblIpindi5.setBackground(new Color(136, 210, 242));
        this.lblIpindi5.setForeground(Color.BLACK);
        this.lblIpindi5.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi5.setOpaque(true);
        
        this.lblIpindi6 = new JLabel(" termina cuando uno de los jugadores ha hundido "); 
        this.lblIpindi6.setBounds(18, 225, 468, 40);
        this.lblIpindi6.setBackground(new Color(136, 210, 242));
        this.lblIpindi6.setForeground(Color.BLACK);
        this.lblIpindi6.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi6.setOpaque(true);
        
        this.lblIpindi7 = new JLabel(" a todos los barcos de la flota enemiga."); 
        this.lblIpindi7.setBounds(18, 250, 468, 40);
        this.lblIpindi7.setBackground(new Color(136, 210, 242));
        this.lblIpindi7.setForeground(Color.BLACK);
        this.lblIpindi7.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi7.setOpaque(true);
        
        this.lblIpindi8 = new JLabel(" "); 
        this.lblIpindi8.setBounds(18, 275, 468, 225);
        this.lblIpindi8.setBackground(new Color(136, 210, 242));
        this.lblIpindi8.setForeground(Color.BLACK);
        this.lblIpindi8.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.lblIpindi8.setOpaque(true);
        
        this.lblIp2= new JLabel("    DESARROLLADORES");
        this.lblIp2.setBounds(500, 40,270, 50);
        this.lblIp2.setForeground(Color.WHITE);
        this.lblIp2.setBackground(new Color(49, 147, 189));
        this.lblIp2.setFont(new Font("Monospaced", Font.BOLD, 20));
        this.lblIp2.setOpaque(true);
        
        this.lblIp3= new JLabel("    Valeska Molina Rodríguez");
        this.lblIp3.setBounds(500, 100,270, 30);
        this.lblIp3.setForeground(Color.WHITE);
        this.lblIp3.setBackground(new Color(29, 90, 112));
        this.lblIp3.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp3.setOpaque(true);
        
        this.lblIp4= new JLabel("          8888-8888");
        this.lblIp4.setBounds(500, 120, 270, 30);
        this.lblIp4.setForeground(Color.WHITE);
        this.lblIp4.setBackground(new Color(29, 90, 112));
        this.lblIp4.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp4.setOpaque(true);
        
        this.lblIp5= new JLabel("       valeska@gmail.com");
        this.lblIp5.setBounds(500, 140, 270, 30);
        this.lblIp5.setForeground(Color.WHITE);
        this.lblIp5.setBackground(new Color(29, 90, 112));
        this.lblIp5.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp5.setOpaque(true);
        
        this.lblIp6= new JLabel("          Profesión");
        this.lblIp6.setBounds(500, 160, 270, 30);
        this.lblIp6.setForeground(Color.WHITE);
        this.lblIp6.setBackground(new Color(29, 90, 112));
        this.lblIp6.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp6.setOpaque(true);
        
        this.lblIp7= new JLabel("    Kevin Aguilar Masís");
        this.lblIp7.setBounds(500, 300,270, 30);
        this.lblIp7.setForeground(Color.WHITE);
        this.lblIp7.setBackground(new Color(29, 90, 112));
        this.lblIp7.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp7.setOpaque(true);
        
        this.lblIp8= new JLabel("          8888-8888");
        this.lblIp8.setBounds(500, 320, 270, 30);
        this.lblIp8.setForeground(Color.WHITE);
        this.lblIp8.setBackground(new Color(29, 90, 112));
        this.lblIp8.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp8.setOpaque(true);
        
        this.lblIp9= new JLabel("       kevin@gmail.com");
        this.lblIp9.setBounds(500, 340, 270, 30);
        this.lblIp9.setForeground(Color.WHITE);
        this.lblIp9.setBackground(new Color(29, 90, 112));
        this.lblIp9.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp9.setOpaque(true);
        
        this.lblIp10= new JLabel("          Profesión");
        this.lblIp10.setBounds(500,360, 270, 30);
        this.lblIp10.setForeground(Color.WHITE);
        this.lblIp10.setBackground(new Color(29, 90, 112));
        this.lblIp10.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp10.setOpaque(true);
        
        this.btnCerrar = new JButton("Cerrar");
        this.btnCerrar.setBounds(350, 520, 100, 30);
        this.btnCerrar.addActionListener(this);
        this.btnCerrar.setBackground(new Color(49, 147, 189));
        this.btnCerrar.setForeground(Color.WHITE);
        this.btnCerrar.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.btnCerrar.setOpaque(true);
        
        add(this.lblIp);
        add(this.lblIpindi1);
        add(this.lblIpindi2);
        add(this.lblIpindi3);
        add(this.lblIpindi4);
        add(this.lblIpindi5);
        add(this.lblIpindi6);
        add(this.lblIpindi7);
        add(this.lblIpindi8);
        add(this.lblIp2);
        add(this.lblIp3);
        add(this.lblIp4);
        add(this.lblIp5);
        add(this.lblIp6);
        add(this.lblIp7);
        add(this.lblIp8);
        add(this.lblIp9);
        add(this.lblIp10);
        add(this.btnCerrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Ayuda ventana = new Ayuda();
        this.dispose();
    }

}
