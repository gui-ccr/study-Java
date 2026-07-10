package src.desafios;

import java.util.HashMap;
import java.util.Map;

/*
 * Desafio: Controle de estoque com HashMap.
 *
 * Objetivo: Declarar um Map<String, Integer> (chave = nome do produto,
 * valor = quantidade em estoque) e praticar as operações mais comuns de
 * um mapa: inserir, iterar, atualizar, consultar, remover e verificar
 * a existência de uma chave.
 */
public class EstoqueProdutos {
    public static void main(String[] args) {
        // Usamos a interface Map como tipo de referência (em vez de HashMap)
        // por boa prática: o código fica desacoplado da implementação concreta.
        Map<String, Integer> estoqueProdutos = new HashMap<>();
        estoqueProdutos.put("Mouse", 20);
        estoqueProdutos.put("Teclado", 54);
        estoqueProdutos.put("Monitor", 13);
        estoqueProdutos.put("CPU", 10);
        estoqueProdutos.put("Fone", 31);

        System.out.println("\n Pares chave-Valor");
        // entrySet() permite percorrer o mapa obtendo, de uma vez, a chave e o valor
        for (Map.Entry<String, Integer> estoque : estoqueProdutos.entrySet()) {
            System.out.println(estoque.getKey() + " -> " + estoque.getValue());
        }

        // put() com uma chave já existente simplesmente SOBRESCREVE o valor antigo
        estoqueProdutos.put("Mouse", 5);

        // get() retorna o valor associado à chave (ou null se a chave não existir)
        int quantidadeTeclado = estoqueProdutos.get("Teclado");
        System.out.println("Temos " + quantidadeTeclado + ". unidades de teclado em estoque!");

        // remove() apaga o par chave-valor do mapa
        estoqueProdutos.remove("Mouse");

        // containsKey() verifica a existência de uma chave sem lançar exceção
        System.out.println("Contem 'Mouse'? " + estoqueProdutos.containsKey("Mouse"));

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
