
package Vistas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        System.out.println("/////   Trabajo Práctico Restaurante, Grupo 2, 2024, Comision 2 /////");
        System.out.println("////\n///// por: Walter Alexander Vertacnik,");
        System.out.println("////       Soto Vela Luciano Ezequiel, ");
        System.out.println("////       Ferro Julieta Ferro, ");
        System.out.println("////       Pagnone Patricia, ");
        System.out.println("////       Muñoz Maycol\n//");
        
        Set<String> accionesValidas = new HashSet<>();
        accionesValidas.add("1");
        accionesValidas.add("2");
        accionesValidas.add("3");
        accionesValidas.add("4");
        accionesValidas.add("5");
        accionesValidas.add("6");
        accionesValidas.add("7");
        accionesValidas.add("listar");
        accionesValidas.add("guardar");
        accionesValidas.add("deshabilitar");
        accionesValidas.add("actualizar");
        accionesValidas.add("buscar");
        accionesValidas.add("categoria");
        accionesValidas.add("salir");
        String accion = "";
        Scanner leerInt = new Scanner(System.in);
        Scanner leerString = new Scanner(System.in);
        boolean seguir = true;
        
        do {
            System.out.println("/// Bienvenido a la consola para gestionar la base de datos de los productos del Restaurante Entre Amigos ///");
            System.out.println("//                 (1/listar) Lista los productos de la base de datos");
            System.out.println("//                 (2/guardar) Inserta un nuevo producto a la base de datos");
            System.out.println("//                 (3/deshabilitar) Cambia el Estado de un producto de la base de datos para deshabilitarlo");
            System.out.println("//                 (4/actualizar) Actualiza los datos de un producto por codigo del producto");
            System.out.println("//                 (5/buscar) Busca un producto en la base de datos por codigo del producto");
            System.out.println("//                 (6/categoria) filtra los productos que quieras ver por categoria");
            System.out.println("//                 (7/salir) filtra los productos que quieras ver por categoria\n//");

            accion = "";

            System.out.print("//// Ingrese a continuación el número o la palabra para realizar alguna acción\n//// : ");
            do {
                accion = leerString.nextLine();
                if (!accionesValidas.contains(accion.toLowerCase())) {
                    System.err.println("//// Accion invalida intentelo de nuevo");
                    System.out.print("//// : ");
                }
            } while (!accionesValidas.contains(accion.toLowerCase()));
            
            switch (accion.toLowerCase()) {
                case ("7") : case ("salir") : {
                    seguir = false;
                }
            }
            
        } while (seguir);
        
        System.out.println("\nFin de la ejecucion\n");
        
    }
    
}
