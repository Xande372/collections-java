import Set.OrdenacaoEmSet.CadastroProdutos;

public class App {
    public static void main(String[] args) throws Exception {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("lápis", 12, 5d, 10);
        cadastroProdutos.adicionarProduto("caneta", 20, 7d, 5);
        cadastroProdutos.adicionarProduto("caderno", 30, 10d, 20);
    
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }   
}
