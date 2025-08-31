package utils;

import model.Libro;
import service.BibliotecaService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
    public static void guardarLibros(BibliotecaService biblio, String ruta){
        try(PrintWriter pw=new PrintWriter(ruta)){
            for(Libro libro:biblio.listarLibros()){
                pw.println(libro.getIdLibro()+";"+libro.getTitulo()+";"+libro.getAutor()+";"+libro.isDisponible());
            }
            System.out.println("Libros guardados en:"+ruta);
        }
        catch(IOException e){
            System.err.println("Error al guardar:"+e.getMessage());
        }
    }
    public static void cargarLibros(String ruta){
        try(BufferedReader leer=new BufferedReader(new FileReader(ruta))){
            String linea;
            System.out.println("Libros leidos desde archivo");
            while((linea=leer.readLine())!=null){
                System.out.println(linea);
            }
        }
        catch(IOException e){
            System.err.println("Error al cargar:"+e.getMessage());
        }
    }
}
