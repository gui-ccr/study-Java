public class ExemploPrintF {
    public static void main(String[] args) {
        double valorPI = 3.1415926535;
        int idade = 30;
        String nome = "Carlos";

        // Apenas um float com 2 casas decimais
        System.out.printf("O valor de PI arredondado é: %.2f%n", valorPI);
        // Saída: O valor de PI arredondado é: 3,14 (ou 3.14 dependendo da sua localidade)

        // Com mais casas decimais
        System.out.printf("O valor de PI completo é: %.8f%n", valorPI);
        // Saída: O valor de PI completo é: 3,14159265

        // Formatando inteiros (%d) e strings (%s)
        System.out.printf("Olá, meu nome é %s e tenho %d anos.%n", nome, idade);
        // Saída: Olá, meu nome é Carlos e tenho 30 anos.

        double preco = 19.9987;
        System.out.printf("Preço do produto: R$ %.2f%n", preco);
        // Saída: Preço do produto: R$ 20,00 (arredonda automaticamente)

        double valorPequeno = 5.0;
        System.out.printf("Valor exato: %.2f%n", valorPequeno);
        // Saída: Valor exato: 5,00 (adiciona zeros para preencher as casas decimais)
    }
}
