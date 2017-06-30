/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.BinaryTree;
import Domain.MyNode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gerson
 */
public class Metods {
    private MyNode node=new MyNode();
    private String linea;
    private BinaryTree tree=new BinaryTree(node);
    private List<MyNode> nodeList=new ArrayList<MyNode>();

    public List<String> fileList = new ArrayList<String>();

    public List<String> getFileList() {
        return fileList;
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    File file = new File("proyecto.txt");

    public List<MyNode>  addToList() {
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            while ((linea = br.readLine()) != null) {
//                this.setLinea(br.readLine());
                fileList.add(linea);
                System.out.println(fileList);
                for (int i = 0; i < fileList.size(); i++) {
                    String meth = fileList.get(i);
                    String word[] = meth.split(" ");
                    for (int j = 0; j < word.length; j++) {                        
                        this.node.setNumLetter(word[j].codePointAt(0));
                        this.node.setWord(word[j].toString());
                        this.node.setLetter(word[j].charAt(0));
                        this.node.setPosition(j);                        
                        this.nodeList.add(node);  
                        this.tree.addNode(node);
                        this.tree.print(node);
                        //System.err.println(node.toString()+"\n");
                        //System.err.println("Nodo:\ncod assci:"+node.getNumLetter()+" word:"+node.getWord()+"letter:"+node.getLetter()+"\t ");
                        }//for j
                }//for i
            }//while    
            
            //if(){}
            br.close();
        } catch (IOException e) {
        }
        return this.nodeList;
    }//readFile

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
}//class
