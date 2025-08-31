package model;

public class Usuario {
    //Atributo
    private final int id;
    private final String nombre;
    //Constructor
    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + '}';
    }
}
