import Set.PesquisaEmSet.AgendaContatos;

public class App {
    public static void main(String[] args) throws Exception {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 123);
        agendaContatos.adicionarContato("Contato 2", 456);
        agendaContatos.adicionarContato("Contato 3", 789);
        agendaContatos.adicionarContato("Contato 4", 000);
        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Contato 1", 233);
        agendaContatos.exibirContatos();
    }   
}
