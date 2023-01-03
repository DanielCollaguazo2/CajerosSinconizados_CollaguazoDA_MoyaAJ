/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.tools.DocumentationTool;
import modelo.Hilo;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class ListenerBotonIniciar implements ActionListener {

    vista v;
    JLabel persona;

    public ListenerBotonIniciar(vista v, JLabel persona) {
        this.v = v;
        this.persona = persona;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //PERSONA 1
        v.getPersona1().setLocation(new Point(900, 450));
        Hilo h1 = new Hilo(v, v.getPersona1());
        h1.start();
        
        //PERSONA 2
        v.getPersona2().setLocation(new Point(900, 450));
        Hilo h2 = new Hilo(v, v.getPersona2());
        h2.setTiempo(500);
        h2.start();
        
        //PERSONA 3
        v.getPersona3().setLocation(new Point(900, 450));
        Hilo h3 = new Hilo(v, v.getPersona3());
        h3.setTiempo(700);
        h3.start();
        
        //PERSONA 4
        v.getPersona4().setLocation(new Point(900, 450));
        Hilo h4 = new Hilo(v, v.getPersona4());
        h4.setTiempo(900);
        h4.start();
        
        //PERSONA 5
        v.getPersona5().setLocation(new Point(900, 450));
        Hilo h5 = new Hilo(v, v.getPersona5());
        h5.setTiempo(1100);
        h5.start();
    }

}
