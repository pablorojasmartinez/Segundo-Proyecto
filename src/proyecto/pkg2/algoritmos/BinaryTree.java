package proyecto.pkg2.algoritmos;

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
    private Node root;
    
    public  BinaryTree(int valor){
        this.root= new Node(valor);
    }
    
    public BinaryTree(Node root){
        this.root=root;
    }
    
    public Node getRoot(){
        return root;
    }
    
    public void setRoot(Node root){
        this.root=root;
    }
    
    private void addNode(Node node, Node root){
        if(root==null){
            this.setRoot(node);
        }
        else{
            if(node.getDato()<=root.getDato()){
                if(root.getLeft()==null){
                    root.setLeft(node);
                }
                else{
                    addNode(node, root.getLeft());
                }
            }
            else{
                if(root.getRight()==null){
                    root.setRight(node);
                }
                else{
                    addNode(node, root.getRight());
                }
            }
        }
    }
    
    public void addNode(Node node){
        this.addNode(node,this.root);
    }
    
}
