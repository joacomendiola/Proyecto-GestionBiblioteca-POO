package model;

import java.time.LocalDate;

public class Prestamo {
    //Atributo
    private final Usuario usuario;
    private final Libro libro;
    private final LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    //Constructor
    public Prestamo(Usuario usuario, Libro libro){
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = null;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Libro getLibro() {
        return libro;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    //Metodo
    public void devolver(){
        this.fechaDevolucion =LocalDate.now();
        libro.setDisponible(true);
    }
    @Override
    public String toString(){
        return "Prestamo | Usuario"+usuario.getNombre()+"| Libro:"+libro.getTitulo()+"| Fecha prestamo"+fechaPrestamo+(fechaDevolucion!=null? "| Devuelto:"+fechaDevolucion:"| En curso");
    }
}
