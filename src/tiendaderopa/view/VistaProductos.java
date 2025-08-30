package tiendaderopa.view;

import java.util.Scanner;
import tiendaderopa.model.Productos;
import tiendaderopa.model.decorator.Component;
import tiendaderopa.model.decorator.Producto;

/**
 *
 * @author Rafael Navarrete
 */
public class VistaProductos {
    private Productos productos;
    private Scanner scanner;
    
    public static void agregarProductos(Scanner scanner, Productos productos) {
        System.out.println("Ingrese el noombre del producto a agregar");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la talla del producto a agretar");
        String talla = scanner.nextLine();
        
        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        
        Producto producto = new Producto(nombre, precio, talla);
        productos.agregarProducto(producto);
        System.out.println("Enhorabuena, has agregado el producto correctamente al catalogo");
    }
    
    public static void mostrarCatalogo(Productos productos) {
        System.out.println("====================================");
        System.out.println("        CATÁLOGO DE PRODUCTOS       ");
        System.out.println("====================================");
        
        if (productos.getProductos().isEmpty()) {
            System.out.println("No hay productos disponibles en el catálogo.");
        } else {
            int i = 1;
            for (Component p : productos.getProductos()) {
                System.out.println(i + ". " + p.getDescripcion());
                i++;
            }
        }
        System.out.println("====================================");
    }
    
    public static Producto seleccionarProducto(Scanner scanner, Productos productos) {
        mostrarCatalogo(productos);
        if (productos.getProductos().isEmpty()) {
            return null;
        }
        System.out.print("Seleccione el número de producto: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > productos.getProductos().size()) {
            System.out.println("Selección inválida.");
            return null;
        }
        return (Producto) productos.getProductos().get(opcion - 1);
    }


    
}
