package tiendaderopa.model.decorator;

/**
 * Clase abstracta base para los decoradores
 * Implementa la interfaz Component
 * Esta clase permite añadir más descuentos sin modificar las clases que ya existen
 * 
 * @author Rafael Navarrete
 */
public abstract class Decorator implements Component {
    protected Component componente;
    
    public Decorator(Component componente) {
        this.componente = componente;
    }
    
    @Override
    public double getPrecio() {
        return componente.getPrecio();
    }
    
    @Override
    public String getDescripcion() {
        return componente.getDescripcion();
    }
}
