/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.persistencia;

import java.util.Objects;

/**
 *
 * @author Mariana
 */
public class Nacionalidad implements Comparable<Nacionalidad>{
    private String nombre;
    private String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Nacionalidad(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nacionalidad other = (Nacionalidad) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public void mostrar(){
        System.out.println("Nacionalidad: " + nombre + " - Pais:" + pais);
    }
    
    public String toString(){
        return nombre.toUpperCase();
    }

    @Override
    public int compareTo(Nacionalidad o) {
        return nombre.compareToIgnoreCase(o.nombre);
    
    }

   
    
}
