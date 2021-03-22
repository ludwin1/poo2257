/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.basicos;

import ico.fes.automovil;
import java.awt.Color;

/**
 *
 * @author Mireya
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        automovil miBocho=new automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        automovil miAcura=new automovil();
        miAcura.setMarca("acura");
        miAcura.setSubMarca("NSK");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println(miAcura);
        
        automovil miMustang=new automovil();
        miMustang.setMarca("acura");
        miMustang.setSubMarca("NSK");
        miMustang.setModelo(2013);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
    }  
        
        
       
    
}
 //tarea programar los objetos miAcura y miMustang
    //acura nsk,2013,gris
        //ford mustan,2010, amarillo