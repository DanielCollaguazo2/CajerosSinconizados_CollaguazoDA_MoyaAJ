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
public class Buffer {
    private int buffer;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;

    public Buffer(int tamanio) {
        this.buffer = 0;
        this.siguiente = 0;
        this.estaVacia = true;
        this.estaLlena =false;
    }
    
    public synchronized int consumir(){
        while (this.estaVacia) {            
            try {
                System.out.println("esperando un productor para consumir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        siguiente--;
        this.estaLlena = false;
        if (siguiente ==0) {
            this.estaVacia = true;
        }
        notifyAll();
        
        return buffer;
    }
    
    public synchronized  void producir(char c){
        while (this.estaLlena) {            
            try {
                System.out.println("Esta esperando a que alguien produzca");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      //  
       // buffer[siguiente] = c;
        siguiente++;
        this.estaVacia = false;
      //  if (siguiente == this.buffer.length) {
            this.estaLlena = true;
        }
        
        
      //  notifyAll();
    }

   // public int getSiguiente() {
     //   return siguiente;
  //  }
    
         

