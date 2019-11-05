/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.persistencia;
import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Mariana
 */
public class Principal {
    public static void main(String [] args){
        GestorNacionalidades gNac = GestorNacionalidades.instanciar();
        /* Vez 1: Correr con las lineas 23 a 26 sin comentar y las lineas 33 y 34 comentadas. Observar el contenido del archivo
           Vez 2: Comentar las líneas 23 a 26 y descomentar las 33 y 34. Observar el contenido del archivo.
        */
        gNac.nuevaNacionalidad("Italiano", "Italia");
        gNac.nuevaNacionalidad("Español", "España");
        gNac.nuevaNacionalidad("Brasilero", "Brasil");
        gNac.nuevaNacionalidad("Argentino", "Argentina");
        
        
        System.out.println("Muestra las nacionalidades ordenadas (usa Comparable)");
        gNac.mostrarLista();
        System.out.println("\n");
    
        //gNac.nuevaNacionalidad("Paraguayo", "Paraguay");
        //gNac.mostrarLista();
   
    }
    
  
    }
    
    