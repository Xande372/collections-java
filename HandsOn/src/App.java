import Map.OperacoesBasicasEmMap.AgendaContatos;

public class App {
    public static void main(String[] args) throws Exception {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        //trabalhando com o método put, servindo tanto pra atualizar como para adicionar.
        //se repetir a chave, o put faz o replace.
        agendaContatos.adicionarContato("Alexandre", 134);
        agendaContatos.adicionarContato("Bianca", 576);
        agendaContatos.adicionarContato("Alebi", 896);
        agendaContatos.adicionarContato("Biale", 125);

        agendaContatos.exibirContatos();

    }   
}
