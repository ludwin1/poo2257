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
        //tarea programar los objetos miAcura y miMustang
    }   //acura nsk,2013,gris
        //ford mustan,2010, amarillo
    
    
}
