package decisiontree;

public class DecisionTree {

    public static void main(String[] args) {
        System.out.println("Quem é você na Sociedade do Anel??");
        System.out.println("Digite 1 para sim ou 2 para não");
        
        Tree t = new Tree();
        t.insertNode(4, "Seu personagem é um Hobbit?");
        t.insertNode(2, "Seu personagem foi até a Montanha da Perdição em Mordor?");
        t.insertNode(1, "Seu personagem era o portador do Um Anel?"); 
        t.insertNode(3, "Seu personagem lutou junto do exécito de Rohan na Guerra do Anel?");
        t.insertNode(6, "Seu personagem pertence ao Reino dos Homens?");
        t.insertNode(5, "Seu personagem foi coroado o Rei de Gondor?");
        t.insertNode(7, "Seu personagem ressurgiu após derrotar Balrog?");
        t.insertNode(8, "Seu personagem foi o único de sua raça a lutar na guerra contra Sauron?");
        
        t.showQuestions();
        
        System.out.println("XXXXXXXX");
    }
    
}
