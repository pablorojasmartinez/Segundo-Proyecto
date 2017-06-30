package Domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Pablo Rojas Martínez
 */
public class BinaryTree {
    private MyNode root;
    
    public  BinaryTree(){
        this.root= new MyNode();
    }
    
    public BinaryTree(MyNode root){
        this.root=root;
    }
    
    public MyNode getRoot(){
        return root;
    }
    
    public void setRoot(MyNode root){
        this.root=root;
    }    
    
    public void addNode(MyNode node){
        if(root==null){
            this.setRoot(node);
        }
//        else{
//            if(node.getNumLetter()<=root.getNumLetter()){
//                if(root.getLeftNode()==null){
//                    root.setLeftNode(node);
//                }
//            }
//        }
    }//metodo
    public void print(){
        MyNode temp=new MyNode();
        print(temp);
    }
    public void print(MyNode node){
        if(node!=null){            
            System.out.println(node.getNumLetter()+" "+root.getLetter());
        }
    }
}
