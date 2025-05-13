package consoleapp.usecase;

import modelo.Produto;
import java.util.HashMap;
import java.util.Map;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private final Map<String, Produto> armazenamento = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        armazenamento.put(produto.getCodigo(), produto);
    }

    @Override
    public Produto buscarPorCodigo(String codigo) {
        return armazenamento.get(codigo);
    }
}