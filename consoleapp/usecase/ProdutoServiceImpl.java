package consoleapp.usecase;

import modelo.Produto;

public class ProdutoServiceImpl implements ProdutoService {
    private final ProdutoRepository repositorio;

    public ProdutoServiceImpl(ProdutoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void cadastrarProduto(String codigo, String nome, double preco) {
        Produto produto = new Produto(codigo, nome, preco);
        repositorio.salvar(produto);
    }

    @Override
    public void alterarPrecoProduto(String codigo, double novoPreco) {
        Produto produto = repositorio.buscarPorCodigo(codigo);
        if (produto != null) {
            produto.alterarPreco(novoPreco);
            repositorio.salvar(produto);
        }
    }

    @Override
    public Produto buscarProduto(String codigo) {
        return repositorio.buscarPorCodigo(codigo);
    }
}