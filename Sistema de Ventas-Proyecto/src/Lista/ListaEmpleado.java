package Lista;

import Clases.Empleado;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro Rios
 */
public class ListaEmpleado {
    
    private final ArrayList<Empleado> listaEmpleados= new ArrayList<>();

    public ListaEmpleado() {
    }
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }
    
    public boolean login(String user, String pass){
        
        for (Empleado empleado : listaEmpleados) {
            if(empleado!=null){
                if(empleado.getNombreUsuario().equals(user) && empleado.getPassword().equals(pass)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }
    
    public Empleado buscarEmpleado(String user){
        for(Empleado empleado: listaEmpleados){
            if(empleado!=null){
                if(empleado.getNombreUsuario().equals(user)){
                    return empleado;
                }
            }
        }
        return null;
    }
    
    public void mostrarEnTabla(DefaultTableModel tabla){
        tabla.setNumRows(0);
        for(Empleado empleado:listaEmpleados){
            if(empleado!=null){
                tabla.addRow(new Object[]{
                    tabla.getRowCount() + 1, 
                    empleado.getNombre(), 
                    empleado.getApellido(), 
                    empleado.getDni(),
                    empleado.getTelefono(),
                    empleado.getNombreUsuario(), 
                    empleado.getPassword(),
                    empleado.getTipoEmpleado()
                });
            }
        }
    }
    
    
    
}
