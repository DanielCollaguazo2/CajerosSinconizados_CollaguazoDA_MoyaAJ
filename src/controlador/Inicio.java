/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Consumidor;
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
        bodega b = new bodega();
        ProductorPersona h1 = new ProductorPersona(v, v.getPersona1(), b);
        ProductorPersona h2 = new ProductorPersona(v, v.getPersona2(), b);
        ProductorPersona h3 = new ProductorPersona(v, v.getPersona3(), b);
        ProductorPersona h4 = new ProductorPersona(v, v.getPersona4(), b);
        ProductorPersona h5 = new ProductorPersona(v, v.getPersona5(), b);
        
        Consumidor c1 = new Consumidor(b); 
        ListenerBotonIniciar li = new ListenerBotonIniciar(v, h1, h2, h3, h4, h5, c1);
        v.listenerBotonIniciar(li);
        v.setVisible(true);
    }
}
