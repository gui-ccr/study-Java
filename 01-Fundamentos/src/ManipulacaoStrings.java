public class ManipulacaoStrings {
    public static void main(String[] args) {
        // Adicionamos espaços em branco de propósito no início e no fim
        String frase = "   O Rato Roeu a Roupa do Rei de Roma   ";

        System.out.println("Frase Original: '" + frase + "'");
        System.out.println("------------------------------------");

        // --- MÉTODOS ÚTEIS ---

        // .length() -> Retorna o número de caracteres (o tamanho da String)
        int tamanho = frase.length();
        System.out.println("Tamanho (com espaços): " + tamanho);

        // .trim() -> Remove os espaços em branco inúteis do início e do fim
        String fraseSemEspacos = frase.trim();
        System.out.println("Frase com .trim(): '" + fraseSemEspacos + "'");
        System.out.println("Tamanho (sem espaços): " + fraseSemEspacos.length());

        // .toUpperCase() -> Converte tudo para MAIÚSCULAS
        String maiusculas = fraseSemEspacos.toUpperCase();
        System.out.println("Em maiúsculas: " + maiusculas);

        // .toLowerCase() -> Converte tudo para minúsculas
        String minusculas = fraseSemEspacos.toLowerCase();
        System.out.println("Em minúsculas: " + minusculas);

        // .charAt(index) -> Pega o caractere em uma posição específica (lembre-se que a contagem começa do 0)
        char primeiroCaractere = fraseSemEspacos.charAt(0); // Pega o 'O'
        System.out.println("O primeiro caractere é: '" + primeiroCaractere + "'");

        System.out.println("------------------------------------");
        // --- COMPARAÇÃO DE STRINGS (MUITO IMPORTANTE!) ---
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java"); // Uma forma diferente de criar, forçando um novo objeto na memória

        System.out.println("Comparando s1 e s2 com '==': " + (s1 == s2)); // Compara a referência na memória (geralmente true para literais iguais)
        System.out.println("Comparando s1 e s3 com '==': " + (s1 == s3)); // Compara a referência na memória (sempre false aqui, pois s3 é um novo objeto)
        System.out.println("Comparando s1 e s3 com '.equals()': " + s1.equals(s3)); // Compara O CONTEÚDO (true)

    }
}
