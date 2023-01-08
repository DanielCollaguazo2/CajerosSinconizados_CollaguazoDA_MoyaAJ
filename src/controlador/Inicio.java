/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Bodega1;
import modelo.Cliente;
import modelo.Consumidor;
import modelo.DefaultTabla;
import modelo.ListModelTabla;
import modelo.ProductorPersona;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {
    public static void main(String[] args) {
        vista v =  new vista();
        Bodega1 b = new Bodega1(5);
        ListModelTabla l = new ListModelTabla();
        DefaultTabla tabla = new DefaultTabla(l);
        Cliente c1 = new Cliente("Cliente 1", 100);
        Cliente c2 = new Cliente("Cliente 2", 80);
        Cliente c3 = new Cliente("Cliente 3", 50);
        Cliente c4 = new Cliente("Cliente 4", 90);
        Cliente c5 = new Cliente("Cliente 5", 10);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
         
        ProductorPersona h1 = new ProductorPersona(v, v.getPersona1(), b, "1", c1);
        ProductorPersona h2 = new ProductorPersona(v, v.getPersona2(), b, "2", c2);
        ProductorPersona h3 = new ProductorPersona(v, v.getPersona3(), b, "3", c3);
        ProductorPersona h4 = new ProductorPersona(v, v.getPersona4(), b, "4", c4);
        ProductorPersona h5 = new ProductorPersona(v, v.getPersona5(), b, "5", c5);
        
        Consumidor cc1 = new Consumidor(b, "Cajero 1", clientes, v.getCampoText1(), l); 
        Consumidor cc2 = new Consumidor(b, "Cajero 2", clientes, v.getCampoText2(), l); 
        Consumidor cc3 = new Consumidor(b, "Cajero 3", clientes, v.getCampoText3(), l); 
        
        v.setModelTable(tabla);
        
        ListenerBotonIniciar li = new ListenerBotonIniciar(v, h1, h2, h3, h4, h5, cc1, cc2, cc3, clientes);
        v.listenerBotonIniciar(li);
        
        ListenerPararBoton lp = new ListenerPararBoton(h1, h2, h3, h4, h5, cc1, cc2, cc3);
        v.listenerBotonParar(lp);
        
        v.setVisible(true);
    }
}
