/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01_g3_javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54935
 */
public class Ejercicio_01_G3_JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Diseñar un programa que lea y guarde razas de perros en un "ArrayList" de tipo "String".✓
        //El programa debera pedir una raza de perro en un bucle, donde el mismo se guardara en la lista.✓
        //Siguiente le preguntara al usuario si quiere guardar otro perro o si quiere salir.✓
        //Cunado decida salir, se mostraran todos los perros del ArrayList.✓

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //ArrayList:
        ArrayList<String> ListRazas = new ArrayList();

        //LogicaPrograma:
        String respuesta = "s";
        do {
            System.out.println("Ingrese una raza de perros: ");
            String raza = leer.next();
            ListRazas.add(raza);
            System.out.println("Desea añadir otra raza? s/n. ");
            respuesta = leer.next();
        } while (respuesta.equals("s"));

        //Impresion:
        System.out.println("Las razas de perros guardadas son: ");
        for (String aux : ListRazas) {
            System.out.println(aux);

        }
        //Se le pedira al usuario un nombre de perro y se recorrera la lista con un "Iterator".
        //Si el perro esta en la lista, se eliminara el perro que ingreso el usuario (Y se mostrara de nuevo la lista).
        //Si el perro no se encuentra en la lista, se le informara (Y se mostrara de nuevo la lista).

        //Iterador: 
        Iterator iterador1 = ListRazas.iterator();

        System.out.println("Ingrese la raza de perro que desee verificar: ");
        String razaX = leer.next();

        //LogicaPrograma:
        while (iterador1.hasNext()) {
            if (razaX.equals(iterador1.next())) {
                iterador1.remove();
                break;
            } else {
                System.out.println("No se ha encontrado la raza especificada.");
                break;
            }
        }
        //Impresion: 
        System.out.println(
                "Las razas de perros guardadas son: ");
        for (String aux : ListRazas) {
            System.out.println(aux);

        }

    }

}
