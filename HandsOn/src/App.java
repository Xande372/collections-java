import Set.OperacoesBasicasEmSet.ConjuntoPalavrasUnicas;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalabra("dançar");
        conjuntoPalavrasUnicas.adicionarPalabra("comer");
        conjuntoPalavrasUnicas.adicionarPalabra("ouvir");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }   
}
