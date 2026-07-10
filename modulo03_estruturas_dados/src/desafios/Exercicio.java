package src.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; // Boa prática: usar a interface List para declarar

/**
 * DESAFIO 01: Gerenciador de Lista de Presença (ArrayList)
 */
public class Exercicio {
    public static void main(String[] args) {
        // 1. Instanciando a lista usando a interface List para maior flexibilidade
        List<String> convidados = new ArrayList<>();

        // 2. Adicionando convidados à lista
        convidados.add("Guilherme");
        convidados.add("Maria");
        convidados.add("Luiza");
        convidados.add("Henrique");
        convidados.add("Matheus");

        // 3. Removendo o 3º convidado (Luiza). Como o índice inicia em 0, o 3º é o índice 2.
        convidados.remove(2);

        // 4. Verificando a presença de um convidado específico
        boolean isGuilhermePresente = convidados.contains("Guilherme");
        System.out.println("O convidado Guilherme está na lista? " + (isGuilhermePresente ? "Sim" : "Não"));

        // 5. Ordenando a lista em ordem alfabética
        Collections.sort(convidados);

        // 6. Percorrendo a lista com Enhanced For e imprimindo formatado
        System.out.println("\n--- Lista Final de Convidados ---");
        for (String nome : convidados) {
            System.out.println("Convidado: " + nome);
        }
    }
}
