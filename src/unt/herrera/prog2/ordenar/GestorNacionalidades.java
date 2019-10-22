/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mariana
 */
public class GestorNacionalidades  implements IGestorNacionalidades{
    
    
    public static final String MENSAJE_OK="Se creo la nac";
    public static final String MENSAJE_ERROR="No se pudo crear la nac";
    //private Set<Nacionalidad> listaNac = new TreeSet<>();
    private List<Nacionalidad> listaNac = new ArrayList<>();
    private static GestorNacionalidades gestor;
    private GestorNacionalidades(){
    }
    
    public static GestorNacionalidades instanciar(){
        if(gestor==null)
            gestor = new GestorNacionalidades();
        return gestor;
            
    }
    
    public void mostrarLista(){
        //agregar lo que falta para mostrar la lista ordenada usando Comparable
      // Collections.sort(listaNac);
        for (Nacionalidad n : listaNac)
            n.mostrar();
    }
    
    public String nuevaNacionalidad (String nombre, String pais){
    if(nombre.trim().isEmpty() || nombre== null || pais.trim().isEmpty() || pais== null )
        return MENSAJE_ERROR;
    else
    {
      Nacionalidad nac = new Nacionalidad (nombre, pais);
      if(!listaNac.contains(nac)){
          listaNac.add(nac);
          return MENSAJE_OK;
      }
      else 
        return MENSAJE_ERROR;
      
    }
    
    }
   
    
    public Nacionalidad obtener(int posicion){
         if (posicion >=0  && posicion < this.listaNac.size())
            return this.listaNac.get(posicion);
        else
            return null;
    }
    
    public Nacionalidad buscarNac(String nombre){
        for (Nacionalidad n :listaNac)
            if(n.toString().trim().equalsIgnoreCase(nombre.trim()))
                return n;
        return null;
    }
    
    
    
    public String borrarNacionalidad(Nacionalidad unaNac){
        GestorPersonas gP = GestorPersonas.instanciar();
        if(listaNac.contains(unaNac)){
            for(Persona p : gP.getListaPersonas()){
                if(p.getOrigen().equals(unaNac))
                    return "\n\nNo se puede borrar la nac porque hay personas";
                else{
                    listaNac.remove(unaNac);
                    return "\n\nSe borro la nac";
                }
            }
        }
        return "\n\nNO existe lo que quiere borrar";
    }
    
}
