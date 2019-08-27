/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.ejtp2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Principal {

    public static void main(String[] args) {
        Empleado unEmpleado;
        unEmpleado = new Empleado("ROberto", "Juarez", "288888", 3,"mail", LocalDate.of(1980, Month.JUNE, 5));
        
//        Empleado unEmpleado2=new Empleado();
//        Empleado unEmpleado3= new Empleado();
        
//        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
//        
//        unEmpleado.setNombre("Roberto");
//        unEmpleado.setApellido("Funes");
//        unEmpleado.setDocumento("28567876");
//        unEmpleado.setCategoria(3);
//        unEmpleado.setFechaNacimiento(LocalDate.of(1980, Month.JUNE, 5));
//        
//        unEmpleado2.setNombre("Julia Maria");
//        unEmpleado2.setApellido("Juarez");
//        unEmpleado2.setDocumento("12567876");
//        unEmpleado2.setCategoria(1);
//        unEmpleado2.setFechaNacimiento(LocalDate.of(1956, Month.JUNE, 25));
//        
//        unEmpleado3.setNombre("Juan Jose");
//        unEmpleado3.setApellido("Martinez");
//        unEmpleado3.setDocumento("25567876");
//        unEmpleado3.setCategoria(3);
//        unEmpleado3.setFechaNacimiento(LocalDate.of(1977, Month.DECEMBER, 5));
//        
//        listaEmpleados.add(unEmpleado);
//        listaEmpleados.add(unEmpleado2);
//        listaEmpleados.add(unEmpleado3);
//        
//        //Mostrar la lista
//        for(Empleado e : listaEmpleados)
//            e.mostrar();
        
        unEmpleado.mostrar();
        
       // /*
        //Interfaz Gráfica
        VNuevo ventanaEmpleados = new VNuevo(null);
        System.out.println("Desde la ventana de empleados");
//*/
    }
    
}
