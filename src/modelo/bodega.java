/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class bodega {

    boolean lleno = false;
    int valor=0;

    public synchronized void Producir(int valor) {
        if (lleno == true) {
            try {
                System.out.println("Esta esperando");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(bodega.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.valor = valor;

        lleno = true;
        System.out.println("Productor genera" + valor + "Lleno = " + lleno);
        notifyAll();
    }

    public synchronized void consumir() {
        if (lleno == false) {
            try {
                System.out.println("esta esperado a consumir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(bodega.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        lleno = true;
        System.out.println("Consumidor consume" + valor);
        notifyAll();
    }
}
