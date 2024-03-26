/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.HashMap;

import com.google.common.base.Strings;
import com.google.common.primitives.Booleans;

public class App {
    
    public static Scanner escaner = new Scanner(System.in);
    public static HashMap<String, String> usuarios = new HashMap<String, String>();
    public static HashMap<String, String> listalibros = new HashMap<String, String>();
    public static boolean leido = false;

    public static void registrarUsuario(){
        System.out.println("Introduce tu nomebre");
        String usuario = escaner.nextLine();
        usuarios.put(usuario, usuario);
    }

    public static void eliminarUsuario(){
        System.out.println("Introduce el nombre del usuario que quieras eliminar: ");
        String elimusuario = escaner.nextLine();
        
        if (elimusuario == usuarios.get(elimusuario)) {
            usuarios.remove(elimusuario, elimusuario);
        }else{
            System.out.println("No se ha encontrado ningun usuario con ese nombre");
        }
    }

    public static void añadirLibro() {
        System.out.println("Escribe el nombre del libro a añadir: ");
        String añadirLibro = escaner.nextLine();
        listalibros.put(añadirLibro, añadirLibro);
    }

    public static void eliminarLibro(){
        System.out.println("Que libro quieres eliminar: ");
        String libroaEliminar = escaner.nextLine();
        if (libroaEliminar == usuarios.get(libroaEliminar)) {
            listalibros.remove(libroaEliminar, libroaEliminar);
        }else{
            System.out.println("No se ha encontrado ningun usuario con ese nombre");
        }
    }

    public static void listarLibros(){
        for(String i : listalibros.values()){
            System.out.println(i);
        }
    }

    public static void marcarComoLeido(String usuario, String libro){
        System.out.println("Quieres marcar como leido el libro: si/no");
        String marcar = escaner.nextLine();
        if(marcar == "si" || marcar == "no"){
            if (marcar == "si") {
                leido = true;
            }else{
                System.out.println("No se ha hecho nada");
            }
        }else{
            System.out.println("Solo se permite si o no");
        }
        escaner.close();
    }

    public static void verLibrosLeidos(){
        String libro = "Marciano";
        String[] lista = {"Marica", libro};
        boolean leido = false;
        for(int i = 0; i < lista.length; i++){
            if(leido == true){
                System.out.println(lista);
            }
        }
    }
}
