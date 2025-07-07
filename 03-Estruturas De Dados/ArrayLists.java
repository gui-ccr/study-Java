import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List; // Boa prática importar também a interface List

public class ArrayLists {
    public static void main(String[] args) {
        // Declaração usando a interface List (boa prática para flexibilidade)
        // e inicialização com a implementação ArrayList

        /*
         * Por que Integer e não int?
         * Coleções em Java (como ArrayList, HashMap etc.) só podem armazenar objetos,
         * não tipos primitivos (int, double, boolean). Para contornar isso, Java
         * fornece classes "wrapper" (invólucro) para cada tipo primitivo.
         *
         * int -> Integer
         *
         * double -> Double
         *
         * boolean -> Boolean
         *
         * char -> Character
         * Java faz o autoboxing e unboxing (conversão automática entre primitivo e
         * wrapper) para você na maioria das vezes, então a diferença é mais conceitual.
         *
         */

        List<String> frutas = new ArrayList<>(); // essa lista vai guardar strings
        frutas.add("Maçã"); // Adiciona no final
        frutas.add("Banana"); // Adiciona no final
        frutas.add("Laranja");
        frutas.add("Pera");
        frutas.add(1, "Morango"); // Adiciona na posição 1 (desloca "Banana" para frente)

        System.out.println(frutas); // Saída: [Maçã, Morango, Banana, Laranja]
        // List<Integer> idade = new ArrayList<>(); // Lista de números inteiros
        // (Integer é o "wrapper" para int)
        // List<Double> precos = new ArrayList<>(); // Lista de números decimais (Double
        // é o "wrapper" para double)
        // List<Boolean> status = new ArrayList<>(); // Lista de booleanos (Boolean é o
        // "wrapper" para boolean)

        String primeiraFruta = frutas.get(0);
        System.out.println("Primeira fruta: " + primeiraFruta);

        String segundafruta = frutas.get(1);
        System.out.println("Segunda fruta: " + segundafruta);

        frutas.remove(3); // remove o laranja
        System.out.println(frutas);

        frutas.remove("Pera"); // remove o objeto pera se ele existir
        System.out.println(frutas);

        int quantidade = frutas.size();
        System.out.println("Quantidade de frutas na lista: " + quantidade);

        System.out.println("Minhas frutas:");
        for (String fruta : frutas) { // Para cada String 'fruta' na lista 'frutas'
            System.out.println("- " + fruta);
        }

        System.out.println("Frutas com índice:");
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("No índice " + i + ": " + frutas.get(i));
        }

    }
}
