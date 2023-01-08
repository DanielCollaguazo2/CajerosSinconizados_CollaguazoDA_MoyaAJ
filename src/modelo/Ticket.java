/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Ticket {
    private Cliente ClienteOr, clienteDes;
    private int monto; 
    private boolean estado;

    public Ticket(Cliente ClienteOr, Cliente clienteDes, int monto, boolean estado) {
        this.ClienteOr = ClienteOr;
        this.clienteDes = clienteDes;
        this.monto = monto;
        this.estado = estado;
    }
    
    public void generarValores(){
        ClienteOr.setSaldoFin(ClienteOr.getSaldoInit()-monto);
        clienteDes.setSaldoFin(clienteDes.getSaldoInit()+monto);
    }

    public Cliente getClienteOr() {
        return ClienteOr;
    }

    public void setClienteOr(Cliente ClienteOr) {
        this.ClienteOr = ClienteOr;
    }

    public Cliente getClienteDes() {
        return clienteDes;
    }

    public void setClienteDes(Cliente clienteDes) {
        this.clienteDes = clienteDes;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
     
}
