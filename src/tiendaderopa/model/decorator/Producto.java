package tiendaderopa.model.decorator;


/**
 * Clase concreta que representa un producto de la tienda.
 * Implementa la interfaz Component, entregando precio y descripción.
 * Puede ser decorado con distintos descuentos.
 * Incluye métodos para validar precio y talla.
 * 
 * @author Rafael Navarrete
 */
public class Producto implements Component {
    private String nombre;
    private double precio;
    private String talla;

    public Producto(String nombre, double precio, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String getDescripcion() {
        return nombre + " -$" + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTalla() {
        return talla;
    }
    
    @Override
    public String toString() {
        return nombre + " (talla " + talla + ") - $" + precio;
    }
    
    // Métodos para validar atributos
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }
    
    public void setTalla(String talla) {
        if (!talla.equals("XS") && !talla.equals("S") && !talla.equals("M") &&
            !talla.equals("L") && !talla.equals("XL") && !talla.equals("XXL")) {
            throw new IllegalArgumentException("Talla inválida. Debe ser XS, S, M, L, XL o XXL");
        }
        this.talla = talla;
    }
}

