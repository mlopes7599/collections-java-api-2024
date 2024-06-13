package set;

import java.util.Objects;

public class Contato {

    private String nome;
    private int contato;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.contato = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + contato +
                '}';
    }
}
