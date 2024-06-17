package map;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadep=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return 0;
    }
}




