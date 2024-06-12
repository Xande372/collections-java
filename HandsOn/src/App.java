import PesquisaEmList.exc4.SomaNumeros;

public class App {
    public static void main(String[] args) throws Exception {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.calcularSoma());
    }
}
