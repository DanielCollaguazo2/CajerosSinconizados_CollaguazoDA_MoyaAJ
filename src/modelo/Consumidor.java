/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Consumidor extends Thread {

    private Bodega1 b;
    String name;
    private int consumed;
    private ArrayList<Cliente> clientes;
    JTextArea t;
    ListModelTabla lista;
    DefaultTabla tabla;
    private int tiempo=0;

    public Consumidor(Bodega1 buffer, String name, ArrayList<Cliente> clientes, JTextArea t, ListModelTabla lista) {
        this.b = buffer;
        this.name = name;
        this.clientes = clientes;
        this.t = t;
        this.lista = lista;
    }

    @Override
    public void run() {
        while (consumed < 1000) {

            try {
                Cliente c1 = b.consumir();
                int cliente2 = (int) (Math.random() * 4);
                Cliente c2 = clientes.get(cliente2);
                consumed++;
                int monto = (int) (Math.random() * c1.getSaldoInit());
                Ticket tt = new Ticket(c1, c2, monto, true);
                tt.generarValores();
                t.setText("Cliente O: " + c1.getNombre() + "\nSaldo Cuenta: " + c1.getSaldoInit() + "\nMonto: " + monto + "\nCliente D: " + c2.getNombre() + "\nEstado: " + tt.isEstado());
                lista.addElement(tt);
                System.out.println("atendido al cliente: " + c1.getNombre());
                sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
}
