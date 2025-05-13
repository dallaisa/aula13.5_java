package consoleapp.usecase;

import modelo.Produto;

public interface ProdutoService {
    void cadastrarProduto(String codigo, String nome, double preco);
    void alterarPrecoProduto(String codigo, double novoPreco);
    Produto buscarProduto(String codigo);
}