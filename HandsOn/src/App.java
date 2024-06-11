import OperacoesBasicas.exc1.ListaDeTarefas;
import OperacoesBasicas.exc2.CarrinhoDeCompra;

public class App {
    public static void main(String[] args) throws Exception {
        
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("banana", 2d, 5);
        carrinhoDeCompra.adicionarItem("maçã", 5d, 2);
        carrinhoDeCompra.adicionarItem("uva", 1d, 3);
        carrinhoDeCompra.adicionarItem("abóbora", 10d, 1);
        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total é: " + carrinhoDeCompra.calcularValorTotal() + " reais.");

        carrinhoDeCompra.removerItem("banana");
        carrinhoDeCompra.exibirItens();
        
        System.out.println("O valor total é: " + carrinhoDeCompra.calcularValorTotal() + " reais.");
    }
}
