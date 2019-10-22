/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ordenar;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Mariana
 */
public class Persona {
    private String dni;
    private String apellido;
    private String nombre;
    private Nacionalidad origen;
    private LocalDate fechaNacimiento;

    public String getDni() {
        return dni;
    }

    public Persona(String dni, String apellido, String nombre, Nacionalidad origen, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.origen = origen;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nacionalidad getOrigen() {
        return origen;
    }

    public void setOrigen(Nacionalidad origen) {
        this.origen = origen;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.dni);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    public String getFechaNacimientoCadena(){
        return this.fechaNacimiento.toString();
    }
      
    public void mostrar(){
        System.out.println("Apellido y Nombre: " + apellido +", "+ nombre +" DNI: "+ dni + " FechaNac: " +fechaNacimiento + " Nacion: " + origen);
    }
    
      
}
