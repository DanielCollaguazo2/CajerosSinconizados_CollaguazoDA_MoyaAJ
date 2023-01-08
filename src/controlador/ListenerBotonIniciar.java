/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.tools.DocumentationTool;
import modelo.Cliente;
import modelo.Consumidor;
import modelo.ListModelcajero;
import modelo.ProductorPersona;
import modelo.Ticket;
import modelo.bodega;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class ListenerBotonIniciar implements ActionListener {

    vista v;
    ProductorPersona h1;
    ProductorPersona h2, h3, h4, h5;
    Consumidor c1, c2, c3;
    bodega b;
    ListModelcajero informacion;
    ArrayList<Cliente> clientes;
    public ListenerBotonIniciar(vista v, ProductorPersona h1, ProductorPersona h2, ProductorPersona h3, ProductorPersona h4, ProductorPersona h5, Consumidor c1, Consumidor c2, Consumidor c3, ListModelcajero informacion, ArrayList<Cliente> clientes) {
        this.v = v;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.informacion = informacion;
        this.clientes=clientes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //   try {
    //    try {
            h1.start();
            //PERSONA 2
            //   v.getPersona2().setLocation(new Point(900, 450));
            //   h2.setTiempo(1200);
            // Thread.sleep(2000);
            h2.start();
            //PERSONA 3
            //   v.getPersona3().setLocation(new Point(900, 450));
            //   h3.setTiempo(1000);
            h3.start();
            //PERSONA 4
            //    v.getPersona4().setLocation(new Point(900, 450));
            //   h4.setTiempo(1000);
            h4.start();
            //PERSONA 5
            //   v.getPersona5().setLocation(new Point(900, 450));
            //   h5.setTiempo(1000);
           h5.start();

           // Thread.sleep(2000);
            //CAJERO 1
            c1.start();

            //CAJERO 1
              c2.start();
//            
//            //CAJERO 1
              c3.start();
            //PERSONA 1
            //     v.getPersona1().setLocation(new Point(900, 450));
//            h1.join();
//            h2.join();
//            h3.join();
//            h4.join();
//            h5.join();
//            
//            v.getPersona1().setLocation(1020, 180);
//            v.getPersona2().setLocation(1020, 280);
//            v.getPersona3().setLocation(1020, 380);
//            v.getPersona4().setLocation(1020, 480);
//            v.getPersona5().setLocation(1020, 580);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ListenerBotonIniciar.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ListenerBotonIniciar.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
