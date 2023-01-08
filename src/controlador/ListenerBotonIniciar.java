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
import javax.swing.JOptionPane;
import javax.tools.DocumentationTool;
import modelo.Cliente;
import modelo.Consumidor;
import modelo.ProductorPersona;
import modelo.Ticket;
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
    ArrayList<Cliente> clientes;

    public ListenerBotonIniciar(vista v, ProductorPersona h1, ProductorPersona h2, ProductorPersona h3, ProductorPersona h4, ProductorPersona h5, Consumidor c1, Consumidor c2, Consumidor c3, ArrayList<Cliente> clientes) {
        this.v = v;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.clientes = clientes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (h1.isAlive()) {
                h1.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h2.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h3.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h4.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h5.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));

                c1.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));
                c2.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));
                c3.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));

                h1.resume();
                h2.resume();
                h3.resume();
                h4.resume();
                h5.resume();
                c1.resume();
                c2.resume();
                c3.resume();

            } else {
                h1.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h2.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h3.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h4.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));
                h5.setTiempo(Integer.valueOf(v.getTxtCliente().getText()));

                c1.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));
                c2.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));
                c3.setTiempo(Integer.valueOf(v.getTxtCajero().getText()));

                h1.start();
                h2.start();
                h3.start();
                h4.start();
                h5.start();
                c1.start();
                c2.start();
                c3.start();
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(v, "Ingrese el tiempo");
        }

    }

}
