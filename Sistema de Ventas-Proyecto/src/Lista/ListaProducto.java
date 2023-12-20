package Lista;

import Clases.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro Rios
 */
public class ListaProducto {
    
    private final ArrayList<Producto> listaProductos = new ArrayList<>();
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    
    public void mostrarEnTabla(DefaultTableModel tabla){
        tabla.setNumRows(0);
        
        for(Producto producto: listaProductos){
            if(producto!=null){
                tabla.addRow(new Object[]{
                    tabla.getRowCount()+1,
                });
            }
        }
    }
    
    
    
    public Producto buscarProducto(String id){
        for(Producto producto: listaProductos){
            if(producto!= null){
                if(id.equals(producto.getIdProducto())){
                    return producto;
                }
            }
        }
        return null;
    }
}
