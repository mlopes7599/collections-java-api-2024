package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContatos(String nome, int contato){
        contatoSet.add(new Contato(nome, contato));
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public void exibirContato(){
        System.out.println(contatoSet);
}

    public Contato atualizarNumeroContato(String nome, int novoContato){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setContato(novoContato);
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContato();
        contatos.adicionarContatos("Matheus", 985380205);
        contatos.exibirContato();
        contatos.atualizarNumeroContato("Matheus", 99999999);
        contatos.exibirContato();
    }
}