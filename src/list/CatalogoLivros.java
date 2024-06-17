package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String autor, String titulo, int dataPublicacao){
        catalogoLivros.add(new Livro(autor, titulo, dataPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!catalogoLivros.isEmpty()){
            for (Livro l : catalogoLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarLivroPorTitulo(String titulo){
        Livro livroPorTditulo = null;
        if(!catalogoLivros.isEmpty()){
            for(Livro l : catalogoLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTditulo = l;
                    break;
                }
            }
        }
        return livroPorTditulo;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Titulo 1", "Autor 1", 2024);
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Titulo1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Titulo2", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Titulo3", "Autor3", 2022);
        catalogoLivros.adicionarLivro("Titulo3", "Autor2", 2028);

        //System.out.println(catalogoLivros.catalogoLivros);
        //System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        //System.out.println(catalogoLivros.pesquisarLivroPorTitulo("Titulo3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));

    }
}
