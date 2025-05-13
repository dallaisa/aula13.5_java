package consoleapp.usecase;

import consoleapp.usecase.*;
import modelo.Produto;

public class ConsoleApp {
    public static void main(String[] args) {
        ProdutoRepository repo = new InMemoryProdutoRepository();
        ProdutoService service = new ProdutoServiceImpl(repo);

        // Cadastrando 3 produtos
        service.cadastrarProduto("1", "Boneca", 10.0);
        service.cadastrarProduto("2", "Maçã", 15.0);
        service.cadastrarProduto("3", "Ração de cachorro", 20.0);

        // Alterando preços
        service.alterarPrecoProduto("1", 12.5);
        service.alterarPrecoProduto("2", 17.0);
        service.alterarPrecoProduto("3", 25.0);

        // Exibindo produtos
        Produto p1 = service.buscarProduto("1");
        Produto p2 = service.buscarProduto("2");
        Produto p3 = service.buscarProduto("3");

        System.out.println("Produto: " + p1.getNome() + " | Preço: R$" + p1.getPreco());
        System.out.println("Produto: " + p2.getNome() + " | Preço: R$" + p2.getPreco());
        System.out.println("Produto: " + p3.getNome() + " | Preço: R$" + p3.getPreco());
    }
}
