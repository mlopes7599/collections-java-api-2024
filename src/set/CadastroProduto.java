package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void cadastrarProduto(String nome, int cod, double preco, int quantidade){
        produtoSet.add(new Produto(quantidade, preco, cod, nome));
    }

    public Set<Produto> exibirProdutosNome(){
        Set<Produto> exibeProdutosNome = new TreeSet<>(produtoSet);
        return exibeProdutosNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProduto produto = new CadastroProduto();


        produto.cadastrarProduto("Notebook", 3, 5500, 23);
        produto.cadastrarProduto("Celular", 0, 10000, 1);
        produto.cadastrarProduto("Geladeira", 1, 300, 5);
        System.out.println(produto.exibirProdutosNome());
        System.out.println(produto.exibirProdutosPorPreco());
    }


}
