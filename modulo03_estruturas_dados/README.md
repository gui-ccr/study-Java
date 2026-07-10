# Módulo 03 — Estruturas de Dados

Como organizar e trabalhar com múltiplos dados de forma eficiente: arrays,
o Java Collections Framework (Listas, Sets) e Maps (chave-valor).

## Conceitos abordados

### 1. Arrays (vetores)
Estrutura de dados fundamental de **tamanho fixo**: uma vez criado
(`new double[7]` ou `new String[tamanho]`), o array não pode crescer nem
encolher. Todos os elementos têm o mesmo tipo. Acesso por índice, começando
em `0`. Também existem arrays multidimensionais (matrizes), como
`String[][]` em `TemperaturasSemanais.java`. A classe utilitária
`Arrays` (pacote `java.util`) oferece métodos prontos como `Arrays.sort()`.

### 2. Java Collections Framework
Conjunto de interfaces e classes para trabalhar com grupos de objetos de
forma dinâmica (ao contrário do array, que tem tamanho fixo). Os dois
principais tipos usados aqui:

- **`List`** (ex.: `ArrayList`): coleção **ordenada** que permite
  **elementos duplicados** e acesso por índice (`get(i)`).
- **`Set`** (ex.: `HashSet`): coleção que garante **elementos únicos** —
  tentar adicionar um valor repetido simplesmente não tem efeito
  (`add()` retorna `false` e o tamanho da coleção não muda).

Boa prática, usada em todos os arquivos deste módulo: declarar a variável
com o tipo da **interface** (`List<String> lista = new ArrayList<>();`) em
vez do tipo concreto. Isso desacopla o código da implementação escolhida —
trocar `ArrayList` por `LinkedList` no futuro não exigiria mudar o resto do
código.

### 3. Listas dinâmicas com `ArrayList`
Operações comuns: `add()` (insere), `get(i)` (lê pela posição),
`remove(i)` (remove pela posição — cuidado, `remove(Object)` é diferente
e remove pelo *valor*), `size()`, `isEmpty()`, `contains()`.
`Collections.sort(lista)` ordena a lista em ordem natural.

### 4. Sets com `HashSet`
Ideal quando a regra de negócio exige que não haja duplicatas (ex.:
registro de IDs únicos de acesso). Não garante nenhuma ordem específica de
iteração.

### 5. Mapas (chave-valor) com `HashMap`
Um `Map<K, V>` associa uma **chave** única a um **valor**
(`Map<String, Integer> estoque = new HashMap<>();`). Operações principais:
`put(chave, valor)` (insere ou sobrescreve), `get(chave)`, `remove(chave)`,
`containsKey(chave)`, `entrySet()` (retorna os pares chave-valor, útil para
iterar com `for (Map.Entry<K,V> e : mapa.entrySet())`).

### 6. Enhanced for loop (`for-each`)
`for (Tipo elemento : colecaoOuArray) { ... }` percorre todos os elementos
sem precisar controlar um índice manualmente. É a forma preferida de
iterar quando não se precisa saber a posição do elemento.

### 7. Por que `Integer` e não `int` nas coleções?
Coleções em Java só armazenam **objetos**, nunca tipos primitivos. Para
guardar números em uma `List` ou `Set`, o Java usa as classes *wrapper*
(`Integer`, `Double`, `Boolean`...), convertendo automaticamente entre o
primitivo e o wrapper (*autoboxing*/*unboxing*).

## Arquivos deste módulo

### `src/concepts`
| Arquivo | Conceito principal |
|---|---|
| `TesteArrays.java` | Arrays, `ArrayList`, autoboxing |
| `Collections.java` | `Set`, `Map`, `LinkedList`, `Queue`, `Stack`, `Iterator` |
| `Maps.java` | `HashMap` na prática |

### `src/desafios`
| Arquivo | Conceito principal |
|---|---|
| `Exercicio.java` | Lista de presença com `ArrayList` e `Collections.sort` |
| `Exercicio2.java` | IDs únicos com `HashSet` |
| `TemperaturasSemanais.java` | Array de `double` + matriz `String[][]` |
| `desafio_input_array.java` | Array com tamanho definido em tempo de execução + `Arrays.sort` |
| `GerenciadorDeNotas.java` | `ArrayList<Double>`, média, remoção por índice |
| `GerenciadorDeTarefas.java` | `ArrayList<String>` + entrada do usuário via `Scanner` |
| `EstoqueProdutos.java` | `HashMap` completo: inserir, atualizar, consultar, remover |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
