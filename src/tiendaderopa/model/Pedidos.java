package tiendaderopa.model;

import java.util.List;
import tiendaderopa.model.decorator.Component;

/**
 * Clase que representa los pedidos de la tienda
 * Contiene lista de productos y un identificador único
 * Permite calcular el total
 * 
 * @author Rafael Navarrete
 */

public class Pedidos {
    private int idPedido;
    private List<Component> productos;

    public Pedidos(int idPedido, List<Component> productos) {
        this.idPedido = idPedido;
        this.productos = productos;
    }

    //GETTERS
    public int getIdPedido() {
        return idPedido;
    }

    public List<Component> getProductos() {
        return productos;
    }
    
    //SETTERS

    public void setIdPedido(int idPedido) {
        if (idPedido <= 0) {
            throw new IllegalArgumentException("ID del pedido debe ser mayor a 0");
        }
        this.idPedido = idPedido;
    }

    public void setProductos(List<Component> productos) {
        this.productos = productos;
    }
    
    //METODOS
    public void agregarProducto(Component producto) {
        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }
        productos.add(producto);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Component p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString() {
        String resultado = "Pedido ID: " + idPedido + "\nProductos:\n";
        for (Component p: productos) {
            resultado += "- " + p.getDescripcion() + "\n";
        }
        resultado += "Total: $" + calcularTotal();
        return resultado;
    }
}
