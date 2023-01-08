/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class ListModelcajero extends DefaultListModel<String> {

    private final ArrayList<String> listaCajero;

    public ListModelcajero() {
        this.listaCajero = new ArrayList<>();
    }

    public boolean verificarLista() {
        return listaCajero.isEmpty();
    }

    public void fireIntervalRemoved(String s, int index) {
        listaCajero.remove(s);
        super.fireIntervalRemoved(this, index, index);
    }

    @Override
    public void removeAllElements() {
        listaCajero.removeAll(listaCajero);
        super.removeAllElements(); 
    }

    @Override
    public int getSize() {
        return listaCajero.size();
    }

    @Override
    public String getElementAt(int index) {
        return listaCajero.get(index); 
    }
    public void removelist(){
        listaCajero.clear();
        super.fireIntervalRemoved(this, 0, 0);
    }

    public void addElement(String s) {
        int index = listaCajero.size();
        listaCajero.add(s);
        fireIntervalAdded(this, index, index);
    }
}
