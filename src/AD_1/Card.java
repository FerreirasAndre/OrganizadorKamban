package AD_1;

public class Card {
    String tarefa;
    int id;
    private static int numCard = 0;

    //retorna um AD_1.Card com uma tarefa
    public Card(String tarefa) {
        this.tarefa = tarefa;
        id = numCard;
        numCard++;
    }

    //retorna uma String com o id e a tarefa do AD_1.Card
    public String toString() {
        return id + " " + tarefa + "\n";
    }
}
