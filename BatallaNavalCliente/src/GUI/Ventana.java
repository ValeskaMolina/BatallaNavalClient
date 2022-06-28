
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Ventana extends JFrame implements ActionListener{
    
    
    
    private JLabel lblIp;
    private JButton btnContinuar;
    private JTextField ip_ingresada;
    
    
    
    
    public Ventana(){
        
        setTitle("Establecer conexión");
        setSize(420, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(29, 90, 112));
       
    
    
        this.lblIp= new JLabel("Ingrese la ip del servidor:");
        this.lblIp.setBounds(50, 40,270, 30);
        this.lblIp.setForeground(Color.WHITE);
        this.lblIp.setBackground(new Color(49, 147, 189));
        this.lblIp.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.lblIp.setOpaque(true);
        
        this.ip_ingresada = new JTextField("192.168.0.XX");
        this.ip_ingresada.setBackground(new Color(49, 147, 189));
        this.ip_ingresada.setForeground(Color.WHITE);
        this.ip_ingresada.setFont(new Font("Monospaced", Font.BOLD, 15));
        this.ip_ingresada.setBounds(50, 83, 270, 40);
        this.ip_ingresada.setOpaque(true);
        
        this.btnContinuar = new JButton("Continuar");
        this.btnContinuar.setBounds(127, 142, 120, 50);
        this.btnContinuar.addActionListener(this);
        this.btnContinuar.setBackground(new Color(49, 147, 189));
        this.btnContinuar.setForeground(Color.WHITE);
        this.btnContinuar.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnContinuar.setOpaque(true);
        
        
        
     
        
        
        add(this.lblIp);
        add(this.ip_ingresada);
        add(this.btnContinuar);
        
       
        
        
        
        
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        if (e.getSource() == btnContinuar) {

            if (ip_ingresada.getText().length() != 0) {

                String ip = ip_ingresada.getText();
                Utility.Constante.setHostIP(ip);

                try {
                    VentanaPrincipal v = new VentanaPrincipal();
                    v.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Ingrese una IP válida", "", JOptionPane.ERROR_MESSAGE);
            }

        }
        
    }
    
}
