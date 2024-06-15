package Set.OperacoesBasicasEmSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalabra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()) {
            palavraSet.remove(palavra);
        } else {
            System.out.println("Está lista está vazia!");
        }
    }

    public Set<Palavra> verificarPalavra(String palavra) {
        Set<Palavra> acharPalavra = new HashSet<>();
        if (!palavraSet.isEmpty()) {
            for (Palavra palavra2 : palavraSet) {
                if (palavra2.getPalavra().equalsIgnoreCase(palavra)) {
                    acharPalavra.add(palavra2);
                }
            }
        }
        return acharPalavra;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavraSet);
    }
}


