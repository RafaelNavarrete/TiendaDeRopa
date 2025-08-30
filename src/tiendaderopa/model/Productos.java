package tiendaderopa.model;

import java.util.ArrayList;
import java.util.List;
import tiendaderopa.model.decorator.Component;

/**
 * Clase modelo para gestionar la colección de productos de la tienda
 * Mantiene una lista de productos disponibles
 * 
 * @author Rafael Navarrete
 */
public class Productos {
    private List<Component> productos;
    
    public Productos() {
        this.productos = new ArrayList<>();
    }

    public List<Component> getProductos() {
        return productos;
    }

    public void setProductos(List<Component> productos) {
        this.productos = productos != null ? productos : new ArrayList<>();
    }
    
    //METODOS
    public void agregarProducto(Component producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        productos.add(producto);
    }
    
    public boolean eliminarProducto(Component producto) {
        return productos.remove(producto);
    }
    
    @Override
    public String toString() {
        String resultado = "Catálogo de productos (" + productos.size() + " items):\n";
        for (Component p : productos) {
            resultado += "- " + p.getDescripcion() + "\n";
        }
        return resultado;
    }
}
