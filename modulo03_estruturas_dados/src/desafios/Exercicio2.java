package src.desafios;

import java.util.HashSet;

/*
 * DESAFIO 02: Filtro de IDs Únicos (HashSet)
 * ---------------------------------------------------------
 * OBJETIVO: Praticar a garantia de unicidade de dados.
 * * TAREFAS:
 * 1. Criar um HashSet de Integers chamado 'registroAcessos'.
 * 2. Tentar adicionar os seguintes IDs: 101, 102, 103, 101, 104, 102.
 * 3. Imprimir o tamanho (size) da coleção após as inserções.
 * (Repara se o tamanho bate com a quantidade de números que tentaste inserir).
 * 4. Verificar se o ID 105 existe no Set e imprimir uma mensagem "ID 105 encontrado: Sim/Não".
 * 5. Remover o ID 102 da coleção.
 * 6. Percorrer o Set final com o Enhanced For Loop e imprimir cada ID.
 * ---------------------------------------------------------
 */

public class Exercicio2 {
    public static void main(String[] args) {
        HashSet<Integer> registroAcessos = new HashSet<Integer>();

        registroAcessos.add(101);
        registroAcessos.add(102);
        registroAcessos.add(103);
        registroAcessos.add(101);
        registroAcessos.add(104);
        registroAcessos.add(102);

        System.out.println(registroAcessos.size());

        int ID = 105;

        if (!registroAcessos.contains(ID)) {
            System.out.println("ID: (" + ID + ") não encontrado!");
        }

    }
}
