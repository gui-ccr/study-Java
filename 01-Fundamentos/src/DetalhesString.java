public class DetalhesString {
    public static void main(String[] args) {

        /*
         * =================================================================================
         * CONCEITO 1: Por que 'String' é uma Classe e não um tipo primitivo?
         * =================================================================================
         *
         * Em Java, temos 8 tipos primitivos (int, double, boolean, char, etc.).
         * Pense neles como "matéria-prima": um número é só um número, um booleano é só
         * verdadeiro ou falso. Eles guardam um valor e nada mais.
         *
         * Uma CLASSE, por outro lado, é um "molde" para criar OBJETOS complexos.
         * Um objeto pode ter tanto DADOS (características) quanto MÉTODOS (comportamentos).
         *
         * A String é uma Classe porque um texto é mais do que só uma sequência de
         * caracteres. Ele precisa de "ferramentas" para ser manipulado.
         *
         * - O DADO de um objeto String: a sequência de caracteres (ex: "Java").
         * - Os MÉTODOS de um objeto String: a "caixa de ferramentas" que já vem com
         * ele (ex: .toUpperCase(), .length(), .trim(), .equals(), etc.).
         *
         * É por isso que 'String' começa com 'S' maiúsculo (convenção para nomes de Classe)
         * e 'int' começa com 'i' minúsculo (convenção para tipos primitivos).
         *
         */

        System.out.println("--- Entendendo a Criação e Comparação de Strings ---");

        /*
         * =================================================================================
         * CONCEITO 2: Comparação e o "String Pool"
         * =================================================================================
         *
         * Para otimizar o uso de memória, o Java mantém uma área especial chamada "String Pool".
         *
         * Quando você cria uma String da forma literal (com aspas duplas), como em s1 e s2,
         * o Java faz o seguinte:
         * 1. Para s1 = "Java": Ele procura por "Java" no pool. Não encontra, então cria o
         * objeto "Java" no pool e faz a variável s1 apontar para ele.
         * 2. Para s2 = "Java": Ele procura por "Java" no pool. AGORA ELE ENCONTRA! Em vez de
         * criar um novo objeto, ele simplesmente faz a variável s2 apontar para o MESMO
         * objeto que a s1 já estava apontando. Isso economiza memória.
         *
         * Quando você usa a palavra-chave 'new' (como em s3), você está FORÇANDO o Java a
         * ignorar o pool e criar um objeto completamente novo na memória, mesmo que o
         * conteúdo seja idêntico a um já existente.
         *
         */

        // s1 e s2 apontam para o MESMO objeto no "String Pool".
        String s1 = "Java";
        String s2 = "Java";

        // s3 é um NOVO objeto na memória, criado fora do pool, mas com o mesmo conteúdo.
        String s3 = new String("Java");

        // O operador '==' COMPARA O ENDEREÇO DE MEMÓRIA (se as variáveis apontam para o mesmo objeto).
        System.out.println("s1 == s2 ? " + (s1 == s2)); // Resultado: true (ambos apontam para o mesmo objeto no pool)
        System.out.println("s1 == s3 ? " + (s1 == s3)); // Resultado: false (s1 aponta para o objeto no pool, s3 para um objeto novo)

        // O método '.equals()' COMPARA O CONTEÚDO, caractere por caractere.
        System.out.println("s1.equals(s3) ? " + s1.equals(s3)); // Resultado: true (o conteúdo de ambos é "Java")

        System.out.println("\nREGRA DE OURO: Para saber se duas Strings têm o mesmo texto, SEMPRE use o método .equals()!");
    }
}
