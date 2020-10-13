package decisiontree;

import java.util.Scanner;

public class Tree {
    private TreeNode root;
    static Scanner scanner = new Scanner(System.in);

    public Tree(){
        root = null;  
    }
 
    public void insertNode(int id, String question){
        if (root == null)
            root = new TreeNode(id, question);
        else
            root.insertNode(id, question);
    }
    
    public void showQuestions() {
        showQuestions(root);
    }
    
    private void showQuestions(TreeNode node) {
        if(node == null)
            return;
            
        if(node.leftNode == null || node.rightNode == null) {
            System.out.println(node.question);
            boolean answer = getQuestionAnswer();
            
            getCharacter(node, answer);
            
            return;
        }
            
        System.out.println(node.question);
            
        boolean answer = getQuestionAnswer();
            
        if(answer == true)
            showQuestions(node.leftNode);
        else
            showQuestions(node.rightNode);
            
    }
    
    private boolean getQuestionAnswer() {
        int answer = scanner.nextInt();
        
        if(answer == 1)
            return true;
        
        return false;
    }
    
    private void getCharacter(TreeNode node, boolean finalAnswer) {
        if(finalAnswer == true) {
            switch(node.id) {
                case 1:
                    System.out.println("Seu personagem é o Frodo!");
                    break;
                case 3:
                    System.out.println("Seu personagem é o Merry!");
                    break;
                case 5:
                    System.out.println("Seu personagem é o Aragon!");
                    break;
                case 7:
                    System.out.println("Seu personagem é o Gandalf!");
                    break;
                case 8:
                    System.out.println("Seu personagem é o Gimli!");
                    break;
                default:
                    System.out.println("Seu personagem não faz parte da Sociedade do Anel!");
            }
        } else {
            switch(node.id) {
                case 1:
                    System.out.println("Seu personagem é o Sam!");
                    break;
                case 3:
                    System.out.println("Seu personagem é o Pippin!");
                    break;
                case 5:
                    System.out.println("Seu personagem é o Boromir!");
                    break;
                case 7:
                    showQuestions(node.rightNode);
                    break;
                case 8:
                    System.out.println("Seu personagem é o Legolas!");
                    break;
                default:
                    System.out.println("Seu personagem não faz parte da Sociedade do Anel!");
                    break;
            }
        }
    }
}