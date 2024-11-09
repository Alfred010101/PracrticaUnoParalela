package hilos;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Alfred
 */
public class Producto extends JLabel implements Runnable
{
    private final List<Point> coordenadas;
     private ImageIcon imagen;
    public Producto()
    {
        this.coordenadas = new ArrayList<>(List.of(
                new Point(0, 100),
                new Point(15, 90),
                new Point(30, 80),
                new Point(45, 90),
                new Point(60, 100),
                new Point(75, 90)));
        imagen = new ImageIcon("src/gui/src/producto.png");
        setIcon(imagen);
    }

    @Override
    public void run()
    {
        for(Point actual : coordenadas)
        {
            try
            {
                setBounds(actual.x, actual.y,  imagen.getIconWidth(), imagen.getIconHeight());
                Thread.sleep(600);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
    }
}
