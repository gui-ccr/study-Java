public class TemperaturasSemanais {
    public static void main(String[] args) {
        // 1. Declare e inicialize o array de temperaturas
        double[] temperaturas = {15.6, 25.5, 14.5, 30.0, 22.0, 27.3, 19.65};

        // 2. Use um for loop para imprimir todas as temperaturas
        System.out.println("Temperaturas registradas:");
        // Podemos usar um contador auxiliar se quisermos numerar as temperaturas com o for-each
        int dia = 1;
        for (double temp : temperaturas) {
            System.out.println("Temperatura do dia " + dia + ": " + temp + "°C");
            dia++; // Incrementa o contador para o próximo dia
        }

        // 3. Calcule e imprima a temperatura média da semana
        double somaTemperaturas = 0.0;
        // Percorrer o array novamente para somar os valores
        for (double temp : temperaturas) {
            somaTemperaturas += temp;
        }

        double media = somaTemperaturas / temperaturas.length; // Divide a soma pelo número total de elementos
        System.out.printf("Temperatura média da semana: %.2f°C%n", media); // Usando printf para formatar com 2 casas decimais

        // 4. Matriz 2x2 de strings para nomes e sobrenomes
        String[][] nomesCompletos = {
            {"João", "Silva"},
            {"Maria", "Souza"}
        };

        System.out.println("\nNomes completos:");
        for (int i = 0; i < nomesCompletos.length; i++) { // Itera sobre as linhas
            for (int j = 0; j < nomesCompletos[i].length; j++) { // Itera sobre as colunas da linha atual
                System.out.print(nomesCompletos[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada nome completo
        }
    }
}
