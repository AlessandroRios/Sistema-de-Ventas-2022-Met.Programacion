package Lista;

import Clases.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro Rios
 */
public class ListaClientes {
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();

    public ListaClientes() {
    }
    
    public void agregarCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        listaClientes.remove(cliente);
    }
    
    public Cliente buscarClienteDni(String dni){
        for(Cliente cliente : listaClientes){
            if(cliente!=null){
                if(cliente.getDni().equals(dni)){
                    return cliente;
                }
            }
        }
        return null;
    }
  
    public Cliente buscarClienteRuc(String ruc){
        for(Cliente cliente : listaClientes){
            if(cliente!=null){
                if(cliente.getRuc().equals(ruc)){
                    return cliente;
                }
            }
        }
        return null;
    }
    
    public void mostrarEnTabla(DefaultTableModel tabla){
        tabla.setNumRows(0);
        
        for(Cliente cliente: listaClientes){
            if(cliente!=null){
                tabla.addRow(new Object[]{
                    tabla.getRowCount() + 1, 
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getDni(),
                    cliente.getTelefono(),
                    cliente.getRuc(),
                    cliente.getId()
                    
                });
            }
        }
    }
}
