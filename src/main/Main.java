
package main;

import gui.Ventana;

/**
 *
 * @author Alfred
 */
public class Main
{
    public static void main(String[] args)
    {
        new Thread(new Ventana()).start();
    }
}
