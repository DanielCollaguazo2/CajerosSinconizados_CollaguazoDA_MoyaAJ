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
    int valor = 0;
    Cliente cliente = new Cliente("", 0);
    boolean consumed = false;
    boolean produced = true;

    public synchronized void Producir(Cliente valor) {
        if (lleno == true) {
            try {
                produced =false;
                System.out.println("Esta esperando a producir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(bodega.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        produced=true;
        this.cliente = valor;
        lleno = true;
        System.out.println("Productor genera " + valor + " Lleno = " + lleno);
        notifyAll();
    }

    public synchronized Cliente consumir() {
        if (lleno == false) {
            try {
                System.out.println("Esta esperando a consumir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(bodega.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lleno = false;
        System.out.println("Consumidor consume" + valor);
        notifyAll();
        return cliente;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public boolean isProduced() {
        return produced;
    }

    public void setProduced(boolean produced) {
        this.produced = produced;
    }

}
