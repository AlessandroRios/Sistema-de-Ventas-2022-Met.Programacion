package Clases;

/**
 *
 * @author Alessandro Rios
 */
public class Pago {
    
    private double pago;
    private double precioTotal;//subtotal+igv

    public Pago() {
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    public double calcularVuelto(){
        return pago-precioTotal;
    }
    
}
