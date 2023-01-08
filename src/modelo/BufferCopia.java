package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferCopia {
 
    private Cliente[] buffer;
    private int siguiente;
    private boolean estaLlena;
    private boolean estaVacia;
    private boolean consumed = true;
    private boolean esperando = true;
    
    public BufferCopia(int tamanio){
        this.buffer = new Cliente[tamanio];
        this.siguiente = 0;
        this.estaLlena = false;
        this.estaVacia = true;
    }
    
    public synchronized Cliente consumir(){
        
        while(this.estaVacia){
            try {
                System.out.println("Essta esperando a consumir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BufferCopia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.siguiente--;
        this.estaLlena = false;
        
        if(this.siguiente == 0){
            this.estaVacia = true;
        }
        
        notifyAll();
        
        return this.buffer[this.siguiente];
        
    }
    
    public synchronized boolean producir(Cliente c){
        esperando=false;
        while(this.estaLlena){
            try {
                esperando = true;
                System.out.println("Esta esperando a Producir");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(BufferCopia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.buffer[this.siguiente] = c;
        
        this.siguiente++;
        this.estaVacia = false;
        
        if(this.siguiente == this.buffer.length){
            this.estaLlena = true;
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
