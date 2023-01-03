/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Inicio {
    public static void main(String[] args) {
        vista v =  new vista();
        ListenerBotonIniciar li = new ListenerBotonIniciar(v, v.getPersona1());
        v.listenerBotonIniciar(li);
        v.setVisible(true);
    }
}
