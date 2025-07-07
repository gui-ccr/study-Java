import java.util.Scanner;

public class VerificaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade para verificar a situação do seu voto: ");
        int idade = scanner.nextInt();

        // Usando o operador E (&&) para checar um intervalo
        // A idade precisa ser >= 18 E, ao mesmo tempo, <= 70.
        if (idade >= 18 && idade <= 70) {
            System.out.println("Seu voto é OBRIGATÓRIO.");
        }

        // Usando o operador OU (||) para checar múltiplos casos
        // Se a idade for 16 OU 17 OU maior que 70.
        if (idade == 16 || idade == 17 || idade > 70) {
            System.out.println("Seu voto é FACULTATIVO.");
        }

        // Usando o operador NÃO (!)
        // A condição (idade >= 16) resulta em true ou false. O '!' inverte esse resultado.
        if (!(idade >= 16)) { // Se NÃO for (maior ou igual a 16), ou seja, se for menor que 16.
            System.out.println("Você ainda NÃO PODE votar.");
        }

        scanner.close();
    }
}
