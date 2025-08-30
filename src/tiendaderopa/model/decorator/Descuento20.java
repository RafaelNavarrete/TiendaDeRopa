package tiendaderopa.model.decorator;

/**
 * Decorador concreto que aplica 20% de descuento al componente
 * Extiende Decorator y modifica el precio y descripcion
 * 
 * @author Rafael Navarrete
 */
public class Descuento20 extends Decorator {
     public Descuento20(Component componente) {
        super(componente);
    }

    @Override
    public double getPrecio() {
        double precioBase = super.getPrecio();
        return precioBase * 0.8; //AQUI LE APLICAMOS EL DESCUENTO
    }
    
    @Override
    public String getDescripcion() {
        String descuentoBase = super.getDescripcion();
        return descuentoBase + " (20% de descuento)"; //MENSAJE DEL 20% DE DESCUENTO
    }
}
