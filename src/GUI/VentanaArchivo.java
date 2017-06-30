/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

/**
 *
 * @author gerson
 */
public class VentanaArchivo extends JInternalFrame{
    private JTextArea txtArchivo;
     public VentanaArchivo() throws IOException {
        this.txtArchivo=new JTextArea(50,50);
        this.add(txtArchivo);      
        this.setSize(500,500);
        this.setClosable(true);
        this.setVisible(true);
    }//const

    public JTextArea getTxtArchivo() {
        return txtArchivo;
    }

    public void setTxtArchivo(JTextArea txtArchivo) {
        this.txtArchivo = txtArchivo;
    }
     
}//class
