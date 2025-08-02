import java.util.Arrays;
import java.util.Scanner;

public class desafio_input_array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] comidas;
        int tamanho;

        System.out.print("Quantas comidas voce quer adicionar: ");
        tamanho = scanner.nextInt();

        scanner.nextLine();

        comidas = new String[tamanho];

        System.out.println("Digite quais sao as suas " + tamanho + " comidas favoritas");
        for (int i = 0; i < comidas.length; i++) {

            System.out.print("Prato favorito #" + i + ": ");
            comidas[i] = scanner.nextLine();

        }
        Arrays.sort(comidas);

        for (String comida : comidas) {

            System.out.print(comida + " ");
        }

        scanner.close();
    }
}
