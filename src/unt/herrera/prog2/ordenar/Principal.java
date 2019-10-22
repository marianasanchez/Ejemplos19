/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

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
    gNac.nuevaNacionalidad("Italiano", "Italia");
    gNac.nuevaNacionalidad("Español", "España");
    gNac.nuevaNacionalidad("Brasilero", "Brasil");
    gNac.nuevaNacionalidad("Argentino", "Argentina");
    
    System.out.println("Muestra las nacionalidades ordenadas (usa Comparable)");
    gNac.mostrarLista();
    System.out.println("\n");
    
    GestorPersonas gPersonas= GestorPersonas.instanciar();
    gPersonas.nuevaPersona("1", "Juarez", "Julio", gNac.obtener(0), LocalDate.of(1980, Month.MARCH, 3));
    gPersonas.nuevaPersona("5", "San Martin", "Jose", gNac.obtener(0), LocalDate.of(1976, Month.DECEMBER, 23));
    gPersonas.nuevaPersona("6", "Alvarez", "Jose", gNac.obtener(0), LocalDate.of(1976, Month.DECEMBER, 23));
    gPersonas.nuevaPersona("7", "Zapata", "Jose", gNac.obtener(0), LocalDate.of(1975, Month.DECEMBER, 23));
    gPersonas.nuevaPersona("3", "Guemes", "Martin Miguel", gNac.obtener(0), LocalDate.of(1985, Month.APRIL,10));
    gPersonas.nuevaPersona("2", "Juarez", "Maria", gNac.obtener(0), LocalDate.of(1979, Month.MARCH, 3));
    gPersonas.nuevaPersona("4", "Bolivar", "Simon", gNac.obtener(0), LocalDate.of(1995, Month.NOVEMBER, 13));
    gPersonas.nuevaPersona("8", "Belgrano", "Juan Manuel", gNac.obtener(3), LocalDate.of(1998, Month.MARCH, 8));
    gPersonas.nuevaPersona("1", "Perez", "Julio", gNac.obtener(3), LocalDate.of(2001, Month.JANUARY, 3));   // no lo agrega
    gPersonas.nuevaPersona("9", "Juarez", "Ana", gNac.obtener(3), LocalDate.of(1980, Month.MARCH, 3));
    
    System.out.println("Ascendente usando un Comparator - No Implementado");
    gPersonas.mostrarLista(CriterioOrdenamiento.ASCENDENTE); 
    //IMPLEMENTAR EL ORDENAMIENTO
    System.out.println("Descendente usando un Comparator - No Implementado");
    gPersonas.mostrarLista(CriterioOrdenamiento.DESCENDENTE);   
    //IMPLEMENTAR EL ORDENAMIENTO
            
    System.out.println("\nPor Fecha Nac con un Comparator con Clases Anonimas");
    CriterioOrdenamiento orden = CriterioOrdenamiento.ASCENDENTE;
    //IMPLEMENTAR 
    //con CLASES ANONIMAS definir la implementación de compara para ordenar 
    //por fecha de nacimiento
    
    
   // gPersonas.mostrarLista(fechaComparator);
    
       
    System.out.println("\nOrdenar personas por DNI con Lambda");
    //IMPLEMENTAR 
    //Con Expresión Lambda definir la implementación de compare()
    // tanto para ordenar ascendente o descendentemente
    
    //gPersonas.mostrarLista(comp1);    

    
    
   
    
    
    
    
        }
    
  
    }
    
    