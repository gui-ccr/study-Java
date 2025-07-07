/* Crie um programa Java que:

Declare um HashMap chamado estoqueProdutos onde a chave é o nome do produto (String) e o valor é a quantidade em estoque (Integer).

Adicione os seguintes produtos ao estoque:

"Notebook": 5

"Mouse": 20

"Teclado": 15

"Monitor": 10

? Imprima todo o estoque (nomes dos produtos e suas quantidades) usando o entrySet() para iterar.

Atualize a quantidade do "Notebook" para 7.

Verifique a quantidade atual de "Teclado" e imprima-a.

Remova o "Mouse" do estoque.

Verifique se o "Mouse" ainda está no estoque (usando containsKey()) e imprima a mensagem adequada.

Imprima o estoque final. */


import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    public static void main(String[] args) {
        Map<String, Integer> estoqueProdutos = new HashMap<>();
        estoqueProdutos.put("Mouse", 20);
        estoqueProdutos.put("Teclado", 54);
        estoqueProdutos.put("Monitor", 13);
        estoqueProdutos.put("CPU", 10);
        estoqueProdutos.put("Fone", 31);

        System.out.println("\n Pares chave-Valor");
        for(Map.Entry<String, Integer> estoque : estoqueProdutos.entrySet()){
            System.out.println(estoque.getKey() + " -> " + estoque.getValue());
        }

        estoqueProdutos.put("Mouse", 5);

        int quantidadeTeclado = estoqueProdutos.get("Teclado");
        System.out.println("Temos " + quantidadeTeclado + ". unidades de teclado em estoque!");

        estoqueProdutos.remove("Mouse");

        System.out.println("Contem 'Mouse'? "+ estoqueProdutos.containsKey("Mouse"));

        System.out.println("\nEstoque Final:");
        if (estoqueProdutos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Map.Entry<String, Integer> entrada : estoqueProdutos.entrySet()) {
                System.out.println(entrada.getKey() + " -> " + entrada.getValue());
            }
        }



    }
}
