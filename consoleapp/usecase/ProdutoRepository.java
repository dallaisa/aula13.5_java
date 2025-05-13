package consoleapp.usecase;

import modelo.Produto;

public interface ProdutoRepository {
    void salvar(Produto produto);
    Produto buscarPorCodigo(String codigo);
}