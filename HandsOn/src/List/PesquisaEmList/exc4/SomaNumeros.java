package List.PesquisaEmList.exc4;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> Numeros;

    public SomaNumeros() {
        this.Numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.Numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer integer : Numeros) {
            soma += integer;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!Numeros.isEmpty()) {
            for (Integer integer : Numeros) {
                if (integer >= maiorNumero) {
                    maiorNumero = integer;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!Numeros.isEmpty()) {
            for (Integer integer : Numeros) {
                if (integer <= menorNumero) {
                    menorNumero = integer;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!Numeros.isEmpty()) {
            System.out.println(this.Numeros);
        } else {
            System.out.println("Lista está vazia!");
        }
    }
}
