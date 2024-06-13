package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPeloCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConviados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println(convidados.contarConvidados());

        convidados.adicionarConvidado("Matheus", 777);
        System.out.println(convidados.convidadoSet);
        convidados.adicionarConvidado("Teste", 777);
        convidados.adicionarConvidado("Fulano", 777);

        System.out.println(convidados.convidadoSet);
        System.out.println(convidados.contarConvidados());
    }
}
