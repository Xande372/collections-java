import OrdenacaoEmList.exc5.OrdenacaoPessoas;

public class App {
    public static void main(String[] args) throws Exception {
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Alexandre", 24, 1.75);
        ordenacaoPessoas.adicionarPessoa("Bianca", 23, 1.68);
        ordenacaoPessoas.adicionarPessoa("Camargo", 78, 1.56);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
