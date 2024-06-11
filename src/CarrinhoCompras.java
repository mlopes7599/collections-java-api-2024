import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Compras> compraList;
    String nome;
    double preco;
    int quantidade;

    public CarrinhoCompras() {
        this.compraList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        compraList.add(new Compras(nome, preco, quantidade));
        System.out.println(compraList);
    }

    public void removerItem(String nome, double preco, int quantidade) {
        List<Compras> comprasParaRemover = new ArrayList<>();
        for (Compras c : comprasParaRemover){
            if(c.getProduto().equalsIgnoreCase(nome)){
                comprasParaRemover.add(c);
            }
        }
        compraList.removeAll(comprasParaRemover);

    }
        public void obterProdutosCompras(){
            System.out.println(compraList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.println("Lista: ");
        carrinhoCompras.obterProdutosCompras();

        System.out.println("Lista adicionada: ");

        carrinhoCompras.adicionarItem("Maçã", 20.0, 1);
        carrinhoCompras.adicionarItem("Banana", 5.0, 2);

        carrinhoCompras.obterProdutosCompras();
        carrinhoCompras.removerItem("Maçã", 20.0, 1);
        carrinhoCompras.removerItem("Banana", 5.0, 2);

        System.out.println("Lista removida");
        carrinhoCompras.obterProdutosCompras();

    }
}