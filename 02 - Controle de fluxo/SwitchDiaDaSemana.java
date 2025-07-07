import java.util.Scanner;

public class SwitchDiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia; // Declara a variável 'dia' fora do loop, para que seja acessível em todo o main.

        // O loop do-while garante que a pergunta seja feita pelo menos uma vez
        // e se repita enquanto a entrada for inválida (fora do intervalo de 1 a 7).
        do {
            System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
            dia = scanner.nextInt(); // Atribui o valor lido à variável 'dia' já declarada.

            if (dia < 1 || dia > 7) { // Se o número for inválido, avisa o usuário.
                System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
            }
        } while (dia < 1 || dia > 7); // Continua o loop ENQUANTO 'dia' for menor que 1 OU maior que 7.

        // Uma vez que o loop termina, 'dia' com certeza tem um valor válido (entre 1 e 7).
        // Agora, podemos usar esse valor no switch.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            // O 'default' aqui se torna teoricamente inatingível se o do-while funcionar corretamente,
            // mas mantê-lo não prejudica. Poderíamos até removê-lo se tivéssemos certeza absoluta da validação.
            default:
                 System.out.println("Erro inesperado! Valor fora do esperado."); // Isso não deve acontecer com a validação acima
                 break;
        }

        scanner.close(); // É importante fechar o scanner no final para liberar recursos.
    }
}
