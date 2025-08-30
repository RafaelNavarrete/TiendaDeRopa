package tiendaderopa.model.decorator;

/**
 * Decorador concreto que aplica 10% de descuento
 * Extiende Decorator y modifica precio y descripcion 
 * 
 * @author Rafael Navarrete
 */
public class Descuento10 extends Decorator {
    public Descuento10(Component componente) {
        super(componente);
    }

    @Override
    public double getPrecio() {
        double precioBase = super.getPrecio();
        return precioBase * 0.9;
    }
    
    @Override
    public String getDescripcion() {
        String descuentoBase = super.getDescripcion();
        return descuentoBase + " (10% de descuento)"; //MENSAJE DEL 10% DE DESCUENTO
    }
}
