public class OperadoresAtalho {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Número inicial: " + numero);

        // --- Operadores de Incremento e Decremento ---

        // Para somar 1 (pós-incremento)
        numero++; // Equivalente a: numero = numero + 1;
        System.out.println("Depois de numero++: " + numero); // Mostra 11

        // Para subtrair 1 (pós-decremento)
        numero--; // Equivalente a: numero = numero - 1;
        System.out.println("Depois de numero--: " + numero); // Volta a ser 10

        System.out.println("-----------------");

        // --- Operadores de Atribuição Composta ---

        // Para somar um valor qualquer (ex: somar 5)
        numero += 5; // Equivalente a: numero = numero + 5;
        System.out.println("Depois de numero += 5: " + numero); // Mostra 15

        // Para subtrair um valor qualquer
        numero -= 3; // Equivalente a: numero = numero - 3;
        System.out.println("Depois de numero -= 3: " + numero); // Mostra 12

        // O mesmo funciona para multiplicação e divisão
        numero *= 2; // Equivalente a: numero = numero * 2;
        System.out.println("Depois de numero *= 2: " + numero); // Mostra 24

        numero /= 4; // Equivalente a: numero = numero / 4;
        System.out.println("Depois de numero /= 4: " + numero); // Mostra 6
    }
}
