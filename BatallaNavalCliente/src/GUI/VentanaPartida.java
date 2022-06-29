
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author valeska
 */
public class VentanaPartida extends JFrame implements ActionListener {

    private JButton btnCrearPartida;
    private JButton btnUnirsePartida;
 

    public VentanaPartida() throws IOException {
       
        // this.cantidadJUgadores= cantida;
        init();

    }

    private void init() throws IOException {

        setTitle("PARTIDA BATALLA NAVAL");
        setSize(420, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(29, 90, 112));
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
        btnCrearPartida = new JButton("Crear partida");
        btnUnirsePartida = new JButton("Unirse partida");
        btnCrearPartida.setBounds(120, 100, 200, 50);
        btnUnirsePartida.setBounds(120, 200, 200, 50);

        btnCrearPartida.addActionListener(this);
        btnUnirsePartida.addActionListener(this);
        
        this.btnCrearPartida.setBackground(new Color(49, 147, 189));
        this.btnCrearPartida.setForeground(Color.WHITE);
        this.btnCrearPartida.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnCrearPartida.setOpaque(true);
        
        this.btnUnirsePartida.setBackground(new Color(49, 147, 189));
        this.btnUnirsePartida.setForeground(Color.WHITE);
        this.btnUnirsePartida.setFont(new Font("Monospaced", Font.ITALIC, 15));
        this.btnUnirsePartida.setOpaque(true);
        
        
      
        add(btnCrearPartida);
        add(btnUnirsePartida);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnCrearPartida) {
            
            

        }

        if (e.getSource() == btnUnirsePartida) {
            

        }

    }
}
