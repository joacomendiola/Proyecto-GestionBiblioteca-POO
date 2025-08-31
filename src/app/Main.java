package app;

import model.Libro;
import model.Usuario;
import service.BibliotecaService;
import utils.Archivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BibliotecaService biblioteca=new BibliotecaService();
        Scanner entrada=new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                ╔════════════════════════════╗
                ║     MENÚ BIBLIOTECA        ║
                ╚════════════════════════════╝
                1. Agregar usuario
                2. Agregar libro
                3. Listar usuarios
                4. Listar libros
                5. Prestar libro
                6. Devolver libro
                7. Listar préstamos
                8. Guardar libros en archivo
                9. Cargar libros desde archivo
                0. Salir
                """);
            System.out.print("Opcion:");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1 ->{
                    System.out.print("ID usuario: ");
                    int idUsuario=entrada.nextInt();entrada.nextLine();
                    System.out.print("Nombre: ");
                    String nombre=entrada.nextLine();
                    biblioteca.agregarUsuario(new Usuario(idUsuario,nombre));
                }
                case 2 ->{
                    System.out.print("ID libro: ");
                    int idLibro=entrada.nextInt(); entrada.nextLine();
                    System.out.print("titulo: ");
                    String titulo=entrada.nextLine();
                    System.out.print("Autor: ");
                    String autor=entrada.nextLine();
                    biblioteca.agregrarLibro(new Libro(idLibro,titulo,autor));
                }
                case 3 ->biblioteca.listarUsuarios().forEach(System.out::println);
                case 4 ->biblioteca.listarLibros().forEach(System.out::println);
                case 5 ->{
                    System.out.print("ID usuario: ");
                    int idUsuario=entrada.nextInt();
                    System.out.print("ID libro: ");
                    int idLibro=entrada.nextInt();
                    biblioteca.prestarLibro(idUsuario,idLibro);
                }
                case 6 ->{
                    System.out.print("ID libro: ");
                    int idLibro=entrada.nextInt();
                    biblioteca.devolverLibro(idLibro);
                }
                case 7 ->biblioteca.listarPrestamos().forEach(System.out::println);
                case 8 -> Archivo.guardarLibros(biblioteca,"libros.csv");
                case 9 -> Archivo.cargarLibros("libros.csv");
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }
        }while(opcion!=0);
        entrada.close();
    }
}