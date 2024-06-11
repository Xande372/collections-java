import PesquisaEmList.exc3.CatalogoLivros;

public class App {
    public static void main(String[] args) throws Exception {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2025);
        System.out.println("Por título: " + catalogoLivros.pesquisarPorTitulo("Livro 3"));
        System.out.println("Por Autor: " + catalogoLivros.pesquisarPorAutor("autor 2"));
        System.out.println("Do ano de 2022 até 2024: " + catalogoLivros.pesquisaPorIntervaloDeAnos(2022, 2024));
    }
}
