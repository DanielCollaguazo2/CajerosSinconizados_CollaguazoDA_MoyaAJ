/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Hilo extends Thread {

    vista v;
    JLabel persona;
    int x=0;
    int y = 0;
int tiempo = 300;
    public Hilo(vista v, JLabel persona) {
        this.v = v;
        this.persona = persona;
    }

    @Override
    public void run() {
        x = persona.getLocation().x;
        y = persona.getLocation().y;
        System.out.println("entro total");
        while (x != 518) {
            try {
                sleep((int) (tiempo));
                System.out.println("entro");
//                if (x == 900 && y == 450) {
//                    persona.setLocation(x, y);
//                    x -= 110;
//                    v.repaint();
               if (x != 130 && y == 450) {
                   System.out.println("entro 1");
                    persona.setLocation(x - 110, y);
                    x -= 110;
                    v.repaint();
                } else if (x == 130 && y != 330) {
                    System.out.println("entro 2");
                    persona.setLocation(x, y - 120);
                    y -= 120;
                    v.repaint();
                } else if (x != 518 && y == 330) {
                    System.out.println(persona.getLocation());
                    System.out.println("entro 3");
                    persona.setLocation(x + 97, y);
                    x += 97;
                    v.repaint();
                } else {
                    System.out.println("entro fin");
                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    

}
