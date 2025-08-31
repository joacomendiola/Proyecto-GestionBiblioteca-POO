package service;

import model.Libro;
import model.Prestamo;
import model.Usuario;

import java.util.*;

public class BibliotecaService {
    private final Map<Integer, Usuario> usuarios=new HashMap<>();
    private final Map<Integer, Libro> libros=new HashMap<>();
    private final List<Prestamo> prestamos=new ArrayList<>();

    //Usuarios
    public void agregarUsuario(Usuario usernuevo){
        usuarios.put(usernuevo.getId(),usernuevo);
    }
    public Collection<Usuario> listarUsuarios(){
        return usuarios.values();
    }

    //Libros
    public void agregrarLibro(Libro libronuevo){
        libros.put(libronuevo.getIdLibro(),libronuevo);
    }
    public Collection<Libro>listarLibros(){
        return libros.values();
    }

    //Prestamos
    public void prestarLibro(int idUsuario,int idLibro){
        Usuario usuario=usuarios.get(idUsuario);
        Libro libro=libros.get(idLibro);
        if(usuario!=null && libro!=null && libro.isDisponible()) {
            libro.setDisponible(false);
            prestamos.add(new Prestamo(usuario, libro));
            System.out.println("Prestamo realizado:" + usuario.getNombre() + "->" + libro.getTitulo());
        }else{
            System.out.println("No se pudo realizar el prestamo (usuario/libro invalido o no disponible)");
        }
    }

    public void devolverLibro(int idLibro){
        for(Prestamo p:prestamos){
            if(p.getLibro().getIdLibro()==idLibro && p.getFechaDevolucion()==null){
                p.devolver();
                System.out.println("Devolucion registrada:"+p.getLibro().getTitulo());
                return;
            }
        }
        System.out.println("No se encontro prestamo activo para ese libro");
    }

    public List<Prestamo> listarPrestamos(){
        return prestamos;
    }
}
