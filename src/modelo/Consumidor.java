/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Consumidor extends Thread {

    private BufferCopia buffer;
    String name;
    private int consumed;
    private final int LIMIT = 15;
    private ArrayList<Cliente> clientes;
    ListModelcajero ticket;

    public Consumidor(BufferCopia buffer, String name, ArrayList<Cliente> clientes, ListModelcajero ticket) {
        this.buffer = buffer;
        this.name = name;
        this.clientes = clientes;
        this.ticket = ticket;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 100; i++) {
//            try {
//                Thread.sleep(10000);
//                b.consumir();
//                b.setConsumed(true);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println(i +"-"+ name + " consume " + getName());
//        }
//        System.out.println("Termina thread " + getName());
//    }

        while (consumed < 1000) {

            try {
                //***************************************************************************************************************
//                char c = buffer.consumir();
//                buffer.setConsumed(true);
//                consumed++;
//                System.out.println("Recogido el caracter " + c + " del buffer");
                //***************************************************************************************************************

//                int cliente1 = (int) (Math.random() * 4);
//                int cliente2 = (int) (Math.random() * 4);
//                Cliente c1 = clientes.get(cliente1);
//                Cliente c2 = clientes.get(cliente2);
//                int saldo1 = c1.getSaldo();
//                int saldo2 = c2.getSaldo();
//                System.out.println("El saldo del cliente 1 es: " + saldo1 + " El saldo del cliente 2 es: " + saldo2);
                Cliente c1 = buffer.consumir();
                int cliente2 = (int) (Math.random() * 4);
//                int cliente2 = (int) (Math.random() * 4);
                Cliente c2 = clientes.get(cliente2);
                consumed++;
                int monto = (int) (Math.random() * 100 + 1);
                Ticket t = new Ticket(c1, c2, monto, true);
                if (ticket.verificarLista()==true) {
                    ticket.addElement("Cliente O: " + c1.getNombre());
                    ticket.addElement("Saldo Cuenta: " + c1.getSaldo());
                    ticket.addElement("Monto: " + monto);
                    ticket.addElement("Cliente D: " + c2.getNombre());
                    ticket.addElement("Estado: " + t.isEstado());
                } else {
                    ticket.removeAllElements();
                    ticket.addElement("Cliente O: " + c1.getNombre());
                    ticket.addElement("Saldo Cuenta: " + c1.getSaldo());
                    ticket.addElement("Monto: " + monto);
                    ticket.addElement("Cliente D: " + c2.getNombre());
                    ticket.addElement("Estado: " + t.isEstado());
                }
                System.out.println("**************************************" + ticket.size());
                System.out.println("atendido al cliente: " + c1.getNombre());
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
