/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class Cliente {
    private String nombre;
    private Cliente cliente = null;
    private String nombreHilo = "";
    private int SaldoInit=0;
    private int SaldoFin=0;

    public Cliente(String nombre, int monto) {
        this.nombre = nombre;
        this.SaldoInit = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldoInit() {
        return SaldoInit;
    }

    public void setSaldoInit(int SaldoInit) {
        this.SaldoInit = SaldoInit;
    }

    public int getSaldoFin() {
        return SaldoFin;
    }

    public void setSaldoFin(int SaldoFin) {
        this.SaldoFin = SaldoFin;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNombreHilo() {
        return nombreHilo;
    }

    public void setNombreHilo(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }

    
    
}
