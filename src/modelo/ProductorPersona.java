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
    int tiempo = 0;
    private Bodega1 b;
    boolean verificar = true;
    String nombre;
    private int produced;
    private final int LIMIT = 10;
    private Cliente cliente;

    public ProductorPersona(vista v, JLabel persona, Bodega1 buffer, String nombre, Cliente cliente) {
        this.v = v;
        this.persona = persona;
        this.b = buffer;
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
                b.producir(cliente);
                produced++;
                cliente.setNombreHilo(getName());
                System.out.println("producido el cliente: " + cliente.getNombre());
                sleep(tiempo);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorPersona.class.getName()).log(Level.SEVERE, null, ex);
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
