import Set.OperacoesBasicasEmSet.ConjuntoConvidados;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);

        System.out.println("Tem: " + conjuntoConvidados.contarConvidados() + " convidados.");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        conjuntoConvidados.exibirConvidados();
    }   
}
