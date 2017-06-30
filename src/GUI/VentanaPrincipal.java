/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Data.Metods;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import proyecto.pkg2.algoritmos.Files;

/**
 *
 * @author gerson
 */
public class VentanaPrincipal extends JFrame implements ActionListener{
    JDesktopPane escritorio;
  JMenuBar jmb;
  JMenu menu;
  JMenuItem mostrarArchivo, mostrarArbol,volverTexto;
  private JFileChooser chooser;

    public VentanaPrincipal() {
        super("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,450);
        init();   
    }//const
    
    public void init(){
        this.jmb = new JMenuBar();
        this.setJMenuBar(jmb);
    
        this.menu = new JMenu ("Ingresar");
        jmb.add(menu);
        
        this.mostrarArchivo=new JMenuItem("Mostrar Archivo");
        mostrarArchivo.addActionListener(this);
        this.menu.add(mostrarArchivo);
        
        this.mostrarArbol=new JMenuItem("Mostrar Arbol");
        mostrarArbol.addActionListener(this);
        this.menu.add(mostrarArbol);
        
        this.volverTexto=new JMenuItem("Regresar a Texto");
        volverTexto.addActionListener(this);
        this.menu.add(volverTexto);
        
    }//init
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.mostrarArchivo){
            try {
                Metods m=new Metods();
                this.chooser=new JFileChooser();
                this.chooser.showOpenDialog(null);
                File f=chooser.getSelectedFile();
                
                m.setLinea(f.toString());
                //if(f!=null){
                   
                    
                VentanaArchivo vA=new VentanaArchivo();
                System.out.println("lee texto: " +m.getLinea());
                vA.getTxtArchivo().append(m.getLinea());
                this.add(vA);
                vA.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }
  
}//class
