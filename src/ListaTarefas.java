import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    //atributos
    //criando uma lista da classe tarefa
    private List<Tarefa> listTarefa;


    //por padrao receberia uma lista de tarefas vazia
    // mas queremos iniciar apenas uma lista
    public ListaTarefas() {
        this.listTarefa = new ArrayList<>();
    }

    public void adicinarTarefa(String descricao){
        //necessario estanciar o objeto
        //usar add para adicionar
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefaa(String descricao){
        //usar remove
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listTarefa);

    }

    /*public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O numero total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicinarTarefa("Tarefa 1");
        listaTarefas.adicinarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removerTarefaa("Tarefa ");
        System.out.println("O numero total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }*/
}
