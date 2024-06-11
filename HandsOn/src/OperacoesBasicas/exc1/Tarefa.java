package OperacoesBasicas.exc1;

//classe que representa o elemento que estará dentro da ListaDeTarefas.
public class Tarefa {

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
