/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ejtp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author p2
 */
public class Empleado {
   //variables de instancia  

  private String nombre;
  private String apellido;
  private String documento;
  private int categoria;
  private String mail;
  private LocalDate fechaNacimiento;
  
//  
//  //CON ENCAPSULAMIENTO
////   private String nombre;
////   private String apellido;
////   private String documento;
////   private int categoria;
////   private String mail;
////   private LocalDate fechaNacimiento;
//   
//    //Constructor para ver el ejemplo de GUI
    public Empleado(String nombre, String apellido, String documento, int categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.categoria = categoria;
        this.mail = null;
        this.fechaNacimiento = null;
    }
//
//   
// 
//// CONSTRUCTOR Opcion 0
//public Empleado(String n, String a, String d, int c, String m, LocalDate f) {
//        nombre = n;
//        apellido = a;
//        documento = d;
//        categoria = c;
//        mail = m;
//        fechaNacimiento = f;
//    }
////
//
//// CONSTRUCTOR Opcion 1
public Empleado(String nombre, String apellido, String documento, int categoria, String mail, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.categoria = categoria;
        this.mail = mail;
        this.fechaNacimiento = fechaNacimiento;
    }
//
//// CONSTRUCTOR Opcion2 
////public Empleado(String nombre, String apellido, String documento, int categoria,  LocalDate fechaNacimiento) {
////        this.nombre = nombre;
////        this.apellido = apellido;
////        this.documento = documento;
////        this.categoria = categoria;
////        this.fechaNacimiento = fechaNacimiento;
////}
////public Empleado(String nombre, String apellido, String documento, int categoria, String mail, LocalDate fechaNacimiento) {
////        this(nombre, apellido, documento, categoria, fechaNacimiento);
////        this.mail = mail;
////}
//
//// <editor-fold defaultstate="collapsed" desc="Get y Set">
   public String getNombre(){
        return nombre;
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

   
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
//
//    //</editor-fold>
//    
//// <editor-fold defaultstate="collapsed" desc="Métodos">
//    /**
//    public void mostrar()
//     * Muestra los datos del empleado
//     */
    public void mostrar() {
        String patron= "dd/MM/yyyy";
        String fechaFormateada = this.fechaNacimiento!= null ? this.fechaNacimiento.format(DateTimeFormatter.ofPattern(patron)): "";
        System.out.println("\nEmpleado: " + documento + " - " + apellido + ", " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaFormateada);
        System.out.println("Categoría: " + categoria);
    }
//    //</editor-fold>
//
//// <editor-fold defaultstate="collapsed" desc="Sobrecarga">
//    @Override
//    public String toString() {
//        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + '}';
//    }
// 
//
////</editor-fold>
//
//   

  
    
}

