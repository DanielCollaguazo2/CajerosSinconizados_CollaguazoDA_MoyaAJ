/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.xml.transform.Source;
import vista.vista;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class ProductorPersona extends Thread {

    vista v;
    JLabel persona;
    int x = 0;
    int y = 0;
    int tiempo = 1000;
    private BufferCopia buffer;
    boolean verificar = true;
    String nombre;
    private final String letras = "abcdefghijklmnopqrstuvxyz";
    private int produced;
    private final int LIMIT = 10;
    private Cliente cliente;

    public ProductorPersona(vista v, JLabel persona, BufferCopia buffer, String nombre, Cliente cliente) {
        this.v = v;
        this.persona = persona;
        this.buffer = buffer;
        this.nombre = nombre;
        this.cliente = cliente;
    }

    @Override
    public void run() {
        x = persona.getLocation().x;
        int antiguo = persona.getLocation().x;
        y = persona.getLocation().y;
        while (produced < LIMIT) {

            try {
//***************************************************************************************************************
//                if (buffer.isConsumed() == true) {
//                    persona.setLocation(antiguo, y);
//                    buffer.setConsumed(false);
//                } else {
//                    char c = letras.charAt((int) (Math.random() * letras.length()));
//                    buffer.producir(c);
//                    produced++;
//                    if (produced < 10 && buffer.isEsperando() == true) {
//                        persona.setLocation(520, 380);
//                    } else {
//                        persona.setLocation(antiguo, y);
//                    }
//                    System.out.println(nombre + " Depositado el caracter " + c + " del buffer");
//                }
//***************************************************************************************************************
                //int cliente1 = (int) (Math.random() * 4);
//                int cliente2 = (int) (Math.random() * 4);
               
                //               Cliente c2 = clientes.get(cliente2);
               // int saldo1 = c1.getSaldo();
                //               int saldo2 = c2.getSaldo();
                buffer.producir(cliente);
                produced++;
                System.out.println("producido el cliente: " + cliente.getNombre());
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorPersona.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        int uno = persona.getLocation().x;
//        int dos = persona.getLocation().y;
//        System.out.println(x + "--" + y);
//        System.out.println("entro total");
        /* for (int i = 0; i < 20; i++) {
            System.out.println("entro " + i);
            try {
                sleep((int) (tiempo));
                if (buffer.isConsumed() == true) {
                    
                    persona.setLocation(520, 230);
                    buffer.setConsumed(false);
                } else {
                    int c = (int) (Math.random() * 10 + 1);
                    b.Producir(c);
                    System.out.println(nombre + " Produce");
                    System.out.println(b.isConsumed());
                    persona.setLocation(antiguo, y);
                    //             if (x != 520) {
                }*/
        //                   x=520;
        //        v.repaint();
//                } else {
//                    x= antiguo;
//                    persona.setLocation(antiguo, y);
        //        v.repaint();
        //  }
//                int c = (int)(Math.random()*10+1);
//                b.Producir(c);
//                if (b.isProduced()) {
//                    persona.setLocation(520, 230);
//                    v.repaint();
//                }
//                if(b.isConsumed()){
//                    persona.setLocation(x, y);
//                    v.repaint();
//                }
//                System.out.println(" Depositado el caracter " + c + " del buffer");
//                while (verificar == true) {
//                    sleep((int) (tiempo));
//                    System.out.println("entro");
//                    System.out.println(x + "--" + y);
//                    if (x != 130 && y == 450) {
//                        System.out.println("entro 1");
//                        persona.setLocation(x - 110, y);
//                        x -= 110;
//                        v.repaint();
//                    } else if (x == 130 && y != 330) {
//                        System.out.println("entro 2");
//                        persona.setLocation(x, y - 120);
//                        y -= 120;
//                        v.repaint();
//                    } else if (x != 518 && y == 330) {
//                        System.out.println(persona.getLocation());
//                        System.out.println("entro 3");
//                        persona.setLocation(x + 97, y);
//                        x += 97;
//                        v.repaint();
//                    } else {
//                        System.out.println("entro fin");
//                        verificar = false;
//                        b.Producir(i);
//                        persona.setLocation(900, 450);
//                        x = persona.getLocation().x;
//                        y = persona.getLocation().y;
//                        if (b.isconsumed) {
//                            i=10;
//                        }
//                    }
//                }
//                verificar = true;
//                System.out.println("hola mundo" + i);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(ProductorPersona.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("termino " + i);
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}
