import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {

        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();

        pessoas.adicionarPessoa("Matheus", 25, 1.70);
        pessoas.adicionarPessoa("Fulano", 55, 1.80);
        pessoas.adicionarPessoa("Heve", 20, 1.65);

        System.out.println(pessoas.listaPessoa);
        System.out.println(pessoas.ordernarPorIdade());
        System.out.println(pessoas.ordernarPorAltura());
    }
}
