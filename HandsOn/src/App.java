import OperacoesBasicas.exc1.ListaDeTarefas;

public class App {
    public static void main(String[] args) throws Exception {
        
        ListaDeTarefas listaTarefa = new ListaDeTarefas();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
