import Map.OperacoesBasicasEmMap.Dicionario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("rápido", "algo que não se move lento");
        dicionario.adicionarPalavra("devagar", "algo que não se move rápido");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("devagar");
        dicionario.removerPalavra("rápido");
        dicionario.exibirPalavras();
    }   
}
