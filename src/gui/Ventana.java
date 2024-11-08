
package gui;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Alfred
 */
public class Ventana extends JFrame implements Runnable
{
    private JLayeredPane panelPrincipal;

    public Ventana()
    {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setSize(670, 230);
        initComponents();
    }

    private void initComponents()
    {
        panelPrincipal = new JLayeredPane();
        panelPrincipal.setPreferredSize(new Dimension(670, 230));
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);

        ImageIcon n1 = new ImageIcon("src/gui/src/banda.PNG");
        JLabel lblFondo1 = new JLabel(n1);
        lblFondo1.setBounds(0, 0, n1.getIconWidth(), n1.getIconHeight());
        
        panelPrincipal.add(lblFondo1, Integer.valueOf(0));
    }

    @Override
    public void run()
    {
        
    }
    
}