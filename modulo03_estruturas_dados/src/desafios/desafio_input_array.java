package src.desafios;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Desafio: ler N strings do usuário para um array e ordená-las.
 *
 * Objetivo: mostrar como criar um array com tamanho decidido em tempo de
 * execução (novo String[tamanho]) e como ordenar com Arrays.sort().
 */
public class desafio_input_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] comidas;
        int tamanho;

        System.out.print("Quantas comidas voce quer adicionar: ");
        tamanho = scanner.nextInt();

        // nextInt() não consome a quebra de linha; nextLine() limpa o buffer
        // para que a próxima leitura de texto não pegue uma linha vazia
        scanner.nextLine();

        // Array criado com tamanho definido dinamicamente pelo usuário
        comidas = new String[tamanho];

        System.out.println("Digite quais sao as suas " + tamanho + " comidas favoritas");
        for (int i = 0; i < comidas.length; i++) {
            System.out.print("Prato favorito #" + i + ": ");
            comidas[i] = scanner.nextLine();
        }

        // Arrays.sort() ordena em ordem alfabética (natural) o array de Strings
        Arrays.sort(comidas);

        for (String comida : comidas) {
            System.out.print(comida + " ");
        }

        scanner.close();
    }
}
