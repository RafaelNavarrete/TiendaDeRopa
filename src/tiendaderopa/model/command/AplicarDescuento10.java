package tiendaderopa.model.command;

import tiendaderopa.model.decorator.Component;
import tiendaderopa.model.decorator.Descuento10;

/**
 * Comando Concreto que aplica un 10% de descuento a un producto.
 * Implementa Command y encapsula la acción
 * 
 * @author Rafael Navarrete
 */
public class AplicarDescuento10 implements Command {
    private Component producto;
    
    public AplicarDescuento10(Component producto) {
        this.producto = producto;
    }
    
    @Override
    public void ejecutar() {
        //APLICAR EL DECORADOR
        producto = new Descuento10(producto);
    }
    
    public Component getProductoConDescuento() {
        return producto;
    }
}
