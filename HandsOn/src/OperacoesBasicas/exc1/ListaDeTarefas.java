package OperacoesBasicas.exc1;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    //atributo
    private List<Tarefa> tarefaList;

    //construtor
    public ListaDeTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    //cria uma lista vazia para adicionar tarefas que estiverem com a mesma descrição;
    //depois fazendo um laço de repetição com foreach;
    //então pegando cada tarefa de dentro da tarefaList, se a descrição for igual ao do método, irá adicionar essa tarefa.
    public void removerTarefa(String descricao) {
        List<Tarefa> remocaoTarefas = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                remocaoTarefas.add(t);
            }
        }
        tarefaList.removeAll(remocaoTarefas);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
