/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp1;

/**
 *
 * @author prog2
 */
public class Principal {
    public static void main(String[] args) {
        Recurso unRecurso1 = new Recurso();
        Recurso unRecurso2 = new Recurso();
        Recurso unRecurso3 = new Recurso();
        Recurso unRecurso4 = new Recurso();
        Recurso unRecurso5 = new Recurso();
        
        Recurso [] vectorRecursos;
        vectorRecursos = new Recurso[5];
        
        unRecurso1.nombre = "Ventilador";
        unRecurso2.nombre = "Escritorio";
        unRecurso3.nombre = "silla";
        unRecurso4.nombre = "silla baja";
        
        vectorRecursos[0] = unRecurso1;
        vectorRecursos[1] = unRecurso2;
        vectorRecursos[2] = unRecurso3;
        vectorRecursos[3] = unRecurso4;
        vectorRecursos[4] = unRecurso5;
        
        System.out.println("Al cargar el vector los elementos son:\n");
        for(Recurso r : vectorRecursos)
            System.out.println("\tRecurso: " + r.nombre); 
        
        //Realizar modificaciones en algunos elementos
        vectorRecursos[2].nombre = "Pupitre alto";
        vectorRecursos[3].nombre = "Tandem de sillas";
    
        unRecurso2.nombre = "Escritorio mediano"; //referencias apuntan al mismo objeto
        
        System.out.println("\nAl modificar el vector los elementos son:\n");
        for(Recurso r : vectorRecursos)
            System.out.println("\tRecurso: " + r.nombre); 
        
        // borro el elemento 3
        int j;
        for(j = 2; j < 3; j++){
          vectorRecursos[j] = vectorRecursos[j + 1];
        }
        vectorRecursos[j] = null;

        System.out.println("\nAl cargar el vector los elementos son:\n");
        for(int i= 0; i<3; i++)
            System.out.println("\tRecurso: " + vectorRecursos[i].nombre); 
        



        

    }
}
