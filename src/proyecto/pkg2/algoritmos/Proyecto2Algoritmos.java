/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2.algoritmos;

import Data.Metods;
import GUI.VentanaPrincipal;
import java.io.File;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class Proyecto2Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metods metods=new Metods();
        VentanaPrincipal vP=new VentanaPrincipal();
        vP.setVisible(true);
        metods.addToList();  
//        System.err.println("con izquierda y derecha");
//        metods.lefthRigth(metods.addToList());
        
//     
//        Files leerArchivo = new Files();
//        leerArchivo.readFile();
    }
    
}
