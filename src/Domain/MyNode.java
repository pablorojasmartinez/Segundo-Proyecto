/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author gerson
 */
public class MyNode {
    
    private int numLetter, position,repetitions;
    private char letter;
    private String word;
    private MyNode leftNode;
    private MyNode rightNode;

    public MyNode() {
        this.numLetter = 0;
        this.position = 0;
        this.repetitions = 0;
        this.letter = ' ';
        this.word = "";
        this.leftNode = null;
        this.rightNode = null;
    }//const

    public MyNode(int numLetter, int position, int repetitions, char letter, String word, MyNode leftNode, MyNode rigthNode) {
        this.numLetter = numLetter;
        this.position = position;
        this.repetitions = repetitions;
        this.letter = letter;
        this.word = word;
        this.leftNode = leftNode;
        this.rightNode = rigthNode;
    }//const

    public MyNode(int numLetter, int position, int repetitions) {
        this.numLetter = numLetter;
        this.position = position;
        this.repetitions = repetitions;
    }//const

    public int getNumLetter() {
        return numLetter;
    }

    public void setNumLetter(int numLetter) {
        this.numLetter = numLetter;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public MyNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(MyNode leftNode) {
        this.leftNode = leftNode;
    }

    public MyNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(MyNode rightNode) {
        this.rightNode = rightNode;
    }
    

    @Override
    public String toString() {
        return "MyNode{" + "numLetter=" + numLetter + ", position=" + position + ", repetitions=" + repetitions + ", letter=" + letter + ", word=" + word + ", leftNode=" + leftNode + ", rigthNode=" + rightNode + '}';
    }
    
    

    
   
}//class
