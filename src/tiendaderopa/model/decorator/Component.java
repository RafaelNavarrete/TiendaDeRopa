package tiendaderopa.model.decorator;

/**
 * Interfaz base para los componentes de la tienda de ropa
 * Define metodos comunes para precio y Descripcion de algun producto
 * 
 * 
 * @author Rafael Navarrete
 */

public interface Component {
    double getPrecio(); 
    String getDescripcion();
}
