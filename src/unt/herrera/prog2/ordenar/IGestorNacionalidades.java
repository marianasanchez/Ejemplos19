/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

/**
 *
 * @author M
 */
public interface IGestorNacionalidades {
  public String nuevaNacionalidad (String nombre, String pais);
  public Nacionalidad obtener(int posicion);
  public Nacionalidad buscarNac(String nombre);
  public String borrarNacionalidad(Nacionalidad unaNac);
    /**
   * muestra la lista ordenada ascendentemente por Nombre de Nacionalidad
   * utilizar Comparable
   */
  public void mostrarLista();
}
