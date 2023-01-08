/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consumidor;
import modelo.ProductorPersona;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class ListenerPararBoton implements ActionListener{
ProductorPersona h1;
    ProductorPersona h2, h3, h4, h5;
    Consumidor c1, c2, c3;

    public ListenerPararBoton(ProductorPersona h1, ProductorPersona h2, ProductorPersona h3, ProductorPersona h4, ProductorPersona h5, Consumidor c1, Consumidor c2, Consumidor c3) {
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        h1.suspend();
        h2.suspend();
        h3.suspend();
        h4.suspend();
        h5.suspend();
        c1.suspend();
        c2.suspend();
        c3.suspend();
    }
    
}
