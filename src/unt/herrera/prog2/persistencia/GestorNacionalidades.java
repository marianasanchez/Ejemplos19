/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariana
 */
public class GestorNacionalidades  implements IGestorNacionalidades{   
    public static final String MENSAJE_OK="Se creo la nacionalidad";
    public static final String MENSAJE_ERROR="No se pudo crear la nacionalidad";
    public static final String TEXTO = "./nacionalidades.txt";
    private List<Nacionalidad> listaNac = new ArrayList<>();
    private static GestorNacionalidades gestor;
    
    private GestorNacionalidades(){
        this.leerArchivo();
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
                this.guardarEnArchivo();
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
        return "Implementar el borrado";
        
    }

    
    private void leerArchivo() {
        BufferedReader br = null;
        File file = new File(TEXTO);
        
        if (file.exists()) {
            try {
                FileReader fr = new FileReader(file);
                br = new BufferedReader(fr);
                String cadena;
                System.out.println("hola");
                while((cadena = br.readLine()) != null) {
                    String[] vector = cadena.split(";");
                    String nombre = vector[0];
                    String pais=vector[1];
                            
                    Nacionalidad unaNacionalidad = new Nacionalidad(nombre, pais);
                    this.listaNac.add(unaNacionalidad);
                }
            }
            catch (IOException ioe) {
                System.out.println("No se pudo leer el archivo.");
            }
            finally {
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        }
    }     

    
        private void guardarEnArchivo() {
        BufferedWriter bw = null;
        File file = new File(TEXTO);
        try {     
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for(int i = 0; i < this.listaNac.size(); i++) {
                Nacionalidad unaNacionalidad = this.listaNac.get(i);
                String cadena = unaNacionalidad.getNombre() + ";";
                cadena += unaNacionalidad.getPais()+ ";"; 
                bw.write(cadena);
                if (i < this.listaNac.size() - 1)
                    bw.newLine();
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error al ");
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                }
                catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }            
        }
    }        
    
}
