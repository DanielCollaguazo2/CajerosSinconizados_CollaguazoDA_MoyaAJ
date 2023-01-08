/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Collaguazo Malla
 */
public class DefaultTabla extends AbstractTableModel {

    String[] title = {"Hilo", "Nº Cliente", "Monto", "Saldo inicial", "Saldo Final", "Nº Cliente", "Saldo inicial", "Saldo Final"};
    ListModelTabla lista;

    public DefaultTabla(ListModelTabla lista) {
        this.lista = lista;
        ListenerListaPersonas listenerListaPersonas = new ListenerListaPersonas();
        lista.addListDataListener(listenerListaPersonas);
    }

    @Override
    public String getColumnName(int index) {
        return title[index];
    }

    private class ListenerListaPersonas implements ListDataListener {

        @Override
        public void intervalAdded(ListDataEvent e) {
            int index = lista.getListDataListeners().length;
            fireTableDataChanged();
            fireTableRowsInserted(index, index);
        }

        @Override
        public void intervalRemoved(ListDataEvent e) {
            fireTableDataChanged();
        }

        @Override
        public void contentsChanged(ListDataEvent e) {
            fireTableDataChanged();
        }

    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch (col) {
            case 0:
                return lista.getElementAt(row).getClienteOr().getNombreHilo();
            case 1:
                return lista.getElementAt(row).getClienteOr().getNombre();
            case 2:
                return lista.getElementAt(row).getMonto();
            case 3:
                return lista.getElementAt(row).getClienteOr().getSaldoInit();
            case 4:
                return lista.getElementAt(row).getClienteOr().getSaldoFin();
            case 5:
                return lista.getElementAt(row).getClienteDes().getNombre();
            case 6:
                return lista.getElementAt(row).getClienteDes().getSaldoInit();
            case 7:
                return lista.getElementAt(row).getClienteDes().getSaldoFin();
            default:
                return "";
        }

    }
}
