package tiendaderopa.model;

import tiendaderopa.model.decorator.Component;
import tiendaderopa.model.decorator.Descuento10;
import tiendaderopa.model.decorator.Descuento20;

/**
 * Clase Singleton responsable de gestionar los descuentos en el sistema.
 * Aplica decoradores según el tipo de descuento solicitado.
 * 
 * @author Rafael Navarrete
 */
public class DiscountManager {
    private static DiscountManager instancia;
    
    private DiscountManager() {
    }
    
    public static DiscountManager getInstance() {
        if (instancia == null) {
            instancia = new DiscountManager();
        }
        return instancia;
    }
    
    //METODO PARA APLICAAR DESCUENTO
    public double aplicarDescuento(Component producto, String tipo) {
        if (tipo.equals("DESC10")) {
            return new Descuento10(producto).getPrecio();
        } else if (tipo.equals("DESC20")) {
            return new Descuento20(producto).getPrecio();
        }
        return producto.getPrecio();
    }
}
