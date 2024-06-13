package set;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;

public class Produto implements Comparable<Produto>{

    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    public Produto(int quantidade, double preco, int cod, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.cod = cod;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCod() {
        return cod;
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
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCod());
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    static class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}
