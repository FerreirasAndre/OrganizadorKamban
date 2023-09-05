package AD_1;

public class Phase {
    Card tarefas[];
    private int qntTarefas = 0;

    //restorna a um Array de Cards que connterá as fases do processo
    public Phase() {
        tarefas = new Card[100];
    }

    //adiciona um AD_1.Card a uma fase do processo
    public void adiciona(Card c) {
        tarefas[qntTarefas] = c;
        qntTarefas++;
    }
    //remove um AD_1.Card de uma fase do processo
    public void remove(Card c) {
        boolean achou = false;
        for (int i = 0; i < qntTarefas; i++) {
            if ((achou) || (tarefas[i] == c)) {
                tarefas[i] = tarefas[i + 1];
                achou = true;
            }
        }
        if (achou)
            qntTarefas--;
    }

    //retorna uma String com as fases do processo
    public String toString() {
        String saida = "";
        for (int i = 0; i < qntTarefas; i++) {
            saida += tarefas[i].toString();
        }
        return saida;
    }
}

