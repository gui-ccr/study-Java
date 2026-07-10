package src.desafios;

import java.util.ArrayList;
import java.util.List;

/*
 * Desafio: Gerenciador de notas com ArrayList.
 *
 * Objetivo: manipular uma lista dinâmica de números (List<Double>),
 * calcular uma média e remover um elemento por posição (índice).
 */
public class GerenciadorDeNotas {
    public static void main(String[] args) {
        // List é a interface; ArrayList é a implementação concreta escolhida.
        // Programar contra a interface facilita trocar a implementação depois
        // (ex: LinkedList) sem alterar o resto do código.
        List<Double> notas = new ArrayList<>();

        System.out.println("---Gerenciador de notas---");

        // notas iniciais
        notas.add(2.5);
        notas.add(9.1);
        notas.add(8.9);
        notas.add(3.8);

        System.out.println("\n notas atuais: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println((i + 1) + ". nota: " + notas.get(i));
        }

        // Percorrendo com for-each para somar (não precisamos do índice aqui)
        double somaNotas = 0.0;
        for (double temp : notas) {
            somaNotas += temp;
        }

        double media = somaNotas / notas.size();
        System.out.printf("Media de notas %.2f%n", media);

        if (!notas.isEmpty()) {
            System.out.println("removendo a segunda nota da lista '" + notas.get(1));
            // remove(int index) remove pela POSIÇÃO na lista (índice 1 = segundo elemento)
            notas.remove(1);
        }
        System.out.println("Notas atualizadas");
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota restante");
        } else {
            for (double nota : notas) {
                System.out.println("- " + nota);
            }
        }
    }
}
