package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bodega1 {
 
    private Cliente[] buffer;
    private int siguiente;
    private boolean isLlena;
    private boolean isVacia;
    private boolean consumed = true;
    private boolean esperando = true;
    
    public Bodega1(int tamanio){
        this.buffer = new Cliente[tamanio];
        this.siguiente = 0;
        this.isLlena = false;
        this.isVacia = true;
    }
    
    public synchronized Cliente consumir(){
        
        while(this.isVacia){
            try {
                System.out.println("Essta esperando a consumir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Bodega1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        this.siguiente--;
        this.isLlena = false;        
        if(this.siguiente == 0){
            this.isVacia = true;
        }       
        notifyAll();
        return this.buffer[this.siguiente];       
    }
    
    public synchronized boolean producir(Cliente c){
        esperando=false;
        while(this.isLlena){
            try {
                esperando = true;
                System.out.println("Esta esperando a Producir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Bodega1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer[this.siguiente] = c;
        
        this.siguiente++;
        this.isVacia = false;
        
        if(this.siguiente == this.buffer.length){
            this.isLlena = true;
        }
        
        notifyAll();
        return esperando;
    }

    public boolean isConsumed() {
        return consumed;
    }

    public void setConsumed(boolean consumed) {
        this.consumed = consumed;
    }

    public boolean isEsperando() {
        return esperando;
    }

    public void setEsperando(boolean esperando) {
        this.esperando = esperando;
    }
    
    
}
