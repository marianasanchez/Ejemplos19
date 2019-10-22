/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

import java.time.LocalDate;
import java.util.Comparator;

/**
 *
 * @author M
 */
public interface IGestorPersonas {
     public String nuevaPersona (String dni, String apellido, String nombre, Nacionalidad origen, LocalDate fechaNacimiento);
     public void mostrarLista(CriterioOrdenamiento c);
      public void mostrarLista(Comparator<Persona> comp);
}
