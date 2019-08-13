package unt.herrera.prog2.t1.ejem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mariana
 */
public class Principal {
    public static void main(String[] args) {
        //una variable referencia que apunta a algo de tipo Felpon
        Felpon unFelpon=new Felpon();
        // otra referencia que puede apuntar a algo de tipo Felpon
        Felpon otroFelpon;
        
        unFelpon.color="azul";
        unFelpon.trazo="grueso";
        
        System.out.println(unFelpon.trazo);
        System.out.println(unFelpon.color);
        
        unFelpon.mostrar();
                
    }
    
}
