import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


//! coleções de lista em java

public class Collections {
    public static void main(String[] args) {
        // ? ===== SET ======
        // * é uma lista aonde os elementos sao unicos

        Set<String> nomesUnicos = new HashSet<>();
        nomesUnicos.add("Guilherme");
        nomesUnicos.add("Henrique");
        nomesUnicos.add("Matheus");
        nomesUnicos.add("Milena");
        nomesUnicos.add("Milena"); // esssa linha nao sera executado pois esta repetindo o nomesUnicos

        System.out.println(nomesUnicos);

        // ? ====== QUEUE ======
        // * é basicamente uma fila aonde o primeiro item que entrar é o primeiro que
        // static

        Queue<String> filaDeTarefas = new LinkedList();

        filaDeTarefas.add("Lista 1");
        filaDeTarefas.add("Lista 2");
        filaDeTarefas.add("Lista 3");

        System.out.println("Item do começo da fila: " + filaDeTarefas.peek()); // peek olha o primeiro item mas nao remove nem faz nada
        System.out.println("Item do começo da fila: " + filaDeTarefas.poll()); // remove o primeiro item da lista
        System.out.println("Lista atual: " + filaDeTarefas);

        // ? ==== STACK (Pilha) =====
        // * segue a regra de LIFO = ultimo a entrar | primeiro a sair

        Stack<String> historicoDeAcoes = new Stack<>();

        historicoDeAcoes.push("Enviar mensagem"); // push envia para o topo
        historicoDeAcoes.push("Receber mensagem");
        historicoDeAcoes.push("Sair do telefone");

        System.out.println("Ação mais recente: " + historicoDeAcoes.peek()); // peek() olha o item do topo. Saída: Salvar
        System.out.println("Desfazendo a última ação: " + historicoDeAcoes.pop()); // pop() remove o item do topo. Saída: Salvar
        System.out.println("Histórico atual: " + historicoDeAcoes); // Saída: [Abrir arquivo, Digitar texto]


        //? ======= ITERATOR ========
        //* Objeto para percorrer por uma lista é o melhor metodo

        List<String> frutas = new ArrayList<String>();

        frutas.add("maça");
        frutas.add("uva");
        frutas.add("pera");


        Iterator<String> fruIterator = frutas.iterator(); // pega o navegador da lista
        while (fruIterator.hasNext()) { // enquanto o meu iterador tiver itens na frente ele vai executar
            String fruta = fruIterator.next(); // adiciona o proximo item à minha variavel fruta

            if (fruta.equals("pera")) { // se o iterador da fruta, na minha variavel por "pera"
                fruIterator.remove(); // ele vai remover
            }
        }
        System.out.println(frutas);


        //? ===== MAP ====
        //* Map eu passo 2 valores, 1° valor é para a chave | 2° é o valor (id)


        Map<String, Integer> pacientes = new HashMap<>();

        pacientes.put("claudia", 1234);
        pacientes.put("Julia", 4321);
        pacientes.put("julimar", 1212);


        System.out.println(pacientes); // pode variar a ordem

        pacientes.put("claudia", 9999); // subistitui o valor de claudia

        int idPaciente1 = pacientes.get("claudia"); // pega e armazena o valor da minha key
        System.out.println("id do pacientw 1 (" + idPaciente1 + ")");

        pacientes.remove("julimar"); // remove o map julimar

        System.out.println(pacientes);

        // existem outros modificadores o resto ta em Maps.java

    }
}
