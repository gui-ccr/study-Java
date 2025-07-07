import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tarefas = new ArrayList<>();

        System.out.println("--- Gerenciador de Tarefas ---");

        // tarefas iniciais

        tarefas.add("Estudar Java");
        tarefas.add("Tomar Agua");
        tarefas.add("encher o saco de milena ");

        System.out.println("\n Tarefas atuais: ");
        for(int i = 0; i < tarefas.size(); i++){
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }

        System.out.println("\n Digite uma nova tarefa para adicionar: ");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa nova adicionada \" " + novaTarefa + "\" ");

        if (!tarefas.isEmpty()) {
            System.out.println("Removendo a primeira tarefa ' " + tarefas.get(0));
            tarefas.remove(0);
        }

        System.out.println("Tarefas atualizadas");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa restante");
        }else{
            for(String tarefa : tarefas){
                System.out.println("- " + tarefa);
            }
        }
    scanner.close();
    }
}
