/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mariana
 */
public class GestorPersonas {
    public static final String MENSAJE_OK="Se creo la persona";
    public static final String MENSAJE_ERROR="No se pudo crear la persona";
    
    
    
    private List<Persona> listaPersonas = new ArrayList<>();
    private static GestorPersonas gestor;
    private GestorPersonas(){
      
    }
    
    public static GestorPersonas instanciar(){
        if(gestor==null)
            gestor = new GestorPersonas();
        return gestor;
            
    }
    
    public List<Persona> getListaPersonas(){
        
        return listaPersonas;
    }


    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public String nuevaPersona (String dni, String apellido, String nombre, Nacionalidad origen, LocalDate fechaNacimiento){
    if(dni.trim().isEmpty() || dni== null || apellido.trim().isEmpty() || apellido== null ) // agregar controles
        return MENSAJE_ERROR;
    else
    {
      Persona unaPersona = new Persona ( dni,  apellido,  nombre,  origen,  fechaNacimiento);
      if(!listaPersonas.contains(unaPersona)){
          listaPersonas.add(unaPersona);
         
          return MENSAJE_OK;
      }
      else 
        return MENSAJE_ERROR;
      
    }
    
    }
    /**
     * Muestra la lista de personas ordenadas según el criterio..
     * Usar Comparator
     * @param c Criterio de Ordenamiento ASCENDENTE o DESCENDENTE
     */
    public void mostrarLista(CriterioOrdenamiento c) {
        /* Usar una clase externa que implementa Comparator        
         para ordenar. Tener en cuenta que se debe ordenar 
        segun el criterio dado*/
        /*
        if(c == CriterioOrdenamiento.ASCENDENTE)
            //ordeno la lista
        else
            // doy vuelta la lista
        */
        for (Persona n : listaPersonas)
            n.mostrar();
               
    }
    
    /**
     * Muestra la lista de Personas ordenadas según el Comparator que recibe
     * @param comp Comparator que indica porque se ordena
     */
    public void mostrarLista(Comparator<Persona> comp){
        //Recibe un comparator y ordena la lista antes de mostrarla
        /* Se puede usar para crear el Comparator
        a) clase externa que implemente comparator
        b) clase anónima
        c) exp lambda 
        
        */
        Collections.sort(listaPersonas, comp);
        for (Persona n : listaPersonas)
            n.mostrar();
        
        
    }
    
    
    
    
    

     
     
     
}
