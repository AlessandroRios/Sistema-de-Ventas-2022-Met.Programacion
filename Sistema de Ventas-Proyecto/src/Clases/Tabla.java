package Clases;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro Rios
 */
public class Tabla {

    public Tabla() {
    }
    
    
    public void modificarDatosTabla(){
        
    }
    public void agregarDatosTabla(){
        
    }
    public void borrarDatosTabla(DefaultTableModel modelo, javax.swing.JTable tabla) {
        if (modelo.getRowCount() != 0) {
            if (tabla.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione datos a borrar");
            } else {
                modelo.removeRow(tabla.getSelectedRow());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos que borrar");
        }
    }
}
