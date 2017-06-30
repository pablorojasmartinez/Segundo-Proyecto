/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg2.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Rojas Martínez
 */
public class Files {

    public List<String> fileList = new ArrayList<String>();

    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    File file = new File("proyecto.txt");

<<<<<<< HEAD
    public String readFile() {
        String linea="";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            
//<<<<<<< HEAD
=======
    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
<<<<<<< HEAD
>>>>>>> df1afcb5a25364aa163b73be490cc1b69bd21bc7
            while ((linea = br.readLine()) != null) {
                fileList.add(linea + "\n");
                System.out.println(fileList);
                for (int i = 0; i < fileList.size(); i++) {
                    String meth = fileList.get(i);
                    String word[] = meth.split(" ");
                    for (int j = 0; j < word.length; j++) {
<<<<<<< HEAD
                        System.out.println("letra= "+word[j].charAt(0) + " palabra= "+word[j].toString()+" =" + word[j].codePointAt(0));
=======
                        System.out.println(word[j].charAt(0) + " =" + word[j].codePointAt(0));
>>>>>>> df1afcb5a25364aa163b73be490cc1b69bd21bc7
                    }//for j
                }//for i
            }//while
            br.close();
<<<<<<< HEAD
////=======
=======
=======
>>>>>>> df1afcb5a25364aa163b73be490cc1b69bd21bc7

            while ((linea = br.readLine()) != null) {
                fileList.add(linea + "\n");
                System.out.println(fileList);
                br.close();
                
                int count = 0;
                boolean flag = true;
                
                for (int i = 0; i < fileList.size(); i++) {
                    String meth = fileList.get(i);

                    for (int j = 0; j < meth.length(); j++) {
                        if (flag) {
                            
                            String word = meth.split(" ")[count];
                            System.out.println(word.charAt(i) + " =" + word.codePointAt(i));
                            count++;
//                            if (count == word.length()) {
//                                flag = false;
//                            }//if
                        }//if
                    }//for j
                }//for i
            }//while
<<<<<<< HEAD
//>>>>>>> 6301e7e29a4747ed682ef53507a8db3a089e103c
        } catch (IOException e) {
        }
        return linea;
=======
>>>>>>> 6301e7e29a4747ed682ef53507a8db3a089e103c
        } catch (IOException e) {
        }
>>>>>>> df1afcb5a25364aa163b73be490cc1b69bd21bc7
    }//readFile
}//class
