/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BufferCopia;
import modelo.Cliente;
import modelo.Consumidor;
import modelo.ListModelcajero;
import modelo.ProductorPersona;
import modelo.bodega;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {
    public static void main(String[] args) {
        vista v =  new vista();
        bodega b1 = new bodega();
        BufferCopia b = new BufferCopia(5);
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
        
         ListModelcajero mc = new ListModelcajero();
         ListModelcajero mc2 = new ListModelcajero();
         ListModelcajero mc3 = new ListModelcajero();
         
        ProductorPersona h1 = new ProductorPersona(v, v.getPersona1(), b, "1", c1);
        ProductorPersona h2 = new ProductorPersona(v, v.getPersona2(), b, "2", c2);
        ProductorPersona h3 = new ProductorPersona(v, v.getPersona3(), b, "3", c3);
        ProductorPersona h4 = new ProductorPersona(v, v.getPersona4(), b, "4", c4);
        ProductorPersona h5 = new ProductorPersona(v, v.getPersona5(), b, "5", c5);
        
        Consumidor cc1 = new Consumidor(b, "Cajero 1", clientes, mc); 
        Consumidor cc2 = new Consumidor(b, "Cajero 2", clientes, mc2); 
        Consumidor cc3 = new Consumidor(b, "Cajero 3", clientes, mc3); 
        
        
        
        ListenerBotonIniciar li = new ListenerBotonIniciar(v, h1, h2, h3, h4, h5, cc1, cc2, cc3, mc, clientes);
        v.listenerBotonIniciar(li);
        v.setmodelListCajero1(mc);
        v.setmodelListCajero2(mc2);
        v.setmodelListCajero3(mc3);
        v.setVisible(true);
    }
}
