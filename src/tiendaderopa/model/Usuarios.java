package tiendaderopa.model;

/**
 * Clase que representa un usuario de la tienda
 * Contiene nombre, email e ID, con validaciones simples
 * 
 * @author Rafael Navarrete
 */
public class Usuarios {
    private String nombre;
    private String email;
    private int id;

    public Usuarios(String nombre, String email, int id) {
        this.nombre = nombre;
        this.email = email;
        this.id = id;
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    //SETTERS CON VALIDACIONES
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }


    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID debe ser mayor que cero");
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ", Email: " + email + ")";
    }
}