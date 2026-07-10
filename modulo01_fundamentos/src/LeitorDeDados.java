// 1. Para poder usar a classe Scanner, primeiro precisao importar do seu pacote original, que é o java.util
import java.util.Scanner;


public class LeitorDeDados {
    public static void main(String[] args) {
    // 2. crio um "objeto" do tipo scanner e digo a ele que aentrada de dados que ele vai 'escutar' é a entrada padrao do sistema, ou seja, o teclado no terminal
    Scanner leitor = new Scanner(System.in);

    System.out.println("Por favor digite seu nome: ");

    // 3. o metodo nextLine() pausa o programa e fica esperando o usuario digitar algo e apertar a tecla Enter. o texto digitado é guardado na variavel

    String nomeDigitado = leitor.nextLine();

    System.out.println("Agora digite sua idade: ");

    // .4 o metodo nextInt() le a proxima entrada e converte em um numero inteiro

    int idadeDigitada = leitor.nextInt();

    // 5. agora é so imprimir os dados que recebi do usuario

    System.out.println("--- DADOS RECEBIDOS ---");
    System.out.println("Nome: " + nomeDigitado);
    System.out.println("Idade: " + idadeDigitada);

    // 6. é uma boa pratica de gerenciamento de recursos 'fechar o leitor' quando nao vou mais usar
    leitor.close();


    }

}
