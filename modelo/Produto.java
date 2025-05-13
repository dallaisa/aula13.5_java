package modelo;

public class Produto {
    private final String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}