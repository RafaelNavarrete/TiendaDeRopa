package tiendaderopa.model.command;

import tiendaderopa.model.decorator.Component;
import tiendaderopa.model.decorator.Descuento20;


/**
 * Comando concreto que aplica un 200% de descuento
 * Implementa Command y encapsula la acción
 * 
 * @author Rafael Navarrete
 */
public class AplicarDescuento20 implements Command {
    private Component producto;
    
    public AplicarDescuento20(Component producto) {
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        //APLICAR EL DECORADOR
        producto = new Descuento20(producto);
    }
    
    public Component getProductoConDescuento() {
        return producto;
    }
    
    
}
