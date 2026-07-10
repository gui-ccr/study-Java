# Módulo 01 — Fundamentos de Java

Primeiro contato com a linguagem: sintaxe básica, tipos de dados, variáveis,
operadores e entrada/saída de dados. É a base sobre a qual todo o resto do
curso (controle de fluxo, estruturas de dados e POO) é construído.

## Conceitos abordados

### 1. Estrutura mínima de um programa Java (`HelloWorld.java`)
Todo programa Java precisa de uma classe pública cujo nome bata com o nome
do arquivo (`HelloWorld.java` → `class HelloWorld`), e de um método
`public static void main(String[] args)`, que é o ponto de entrada da
aplicação — é o primeiro método executado quando o programa roda.

### 2. Tipos primitivos e variáveis (`TiposPrimitivos.java`)
Java é uma linguagem **fortemente tipada**: toda variável tem um tipo
declarado e fixo. Os tipos primitivos mais comuns:

| Tipo | Armazena | Exemplo |
|---|---|---|
| `int` | números inteiros | `int idade = 18;` |
| `double` | números com casas decimais | `double altura = 1.83;` |
| `boolean` | verdadeiro/falso | `boolean ehEstudante = true;` |
| `String` | texto (não é primitivo, é uma classe) | `String nome = "Guilherme";` |

Repare que `String` começa com letra maiúscula porque, tecnicamente, não é
um tipo primitivo — é uma classe do pacote `java.lang`.

### 3. Constantes (`Constantes.java`)
Uma variável declarada com `final` só pode ser atribuída **uma vez**. É
assim que se cria uma constante em Java (ex: `final double PI = 3.14159;`).
Por convenção, nomes de constantes usam `MAIUSCULO_COM_UNDERSCORE`.

### 4. Operadores básicos e de atalho (`OperadoresBasicos.java`, `OperadoresAtalho.java`)
- Aritméticos: `+ - * / %` (o `%` é o **resto da divisão**, muito usado para
  verificar paridade ou fazer ciclos).
- Atribuição composta (atalhos): `+=`, `-=`, `*=`, `/=`, `++`, `--` — são
  formas curtas de reescrever uma variável a partir dela mesma
  (`x += 5` é o mesmo que `x = x + 5`).

### 5. Manipulação e comparação de Strings (`ManipulacaoStrings.java`, `DetalhesString.java`)
Métodos úteis de `String`: `.length()`, `.trim()`, `.toUpperCase()`,
`.toLowerCase()`, `.charAt(index)`.

Ponto de atenção clássico em Java: **`==` compara referências (endereços de
memória)**, enquanto **`.equals()` compara o conteúdo**. Duas Strings
literais iguais costumam apontar para o mesmo objeto no *String Pool*
(por isso `==` retorna `true`), mas uma String criada com `new String(...)`
força a criação de um novo objeto na memória — nesse caso, `==` retorna
`false` mesmo com o mesmo conteúdo. Por isso, **sempre use `.equals()`**
para comparar o conteúdo de Strings.

### 6. Saída formatada (`ExemploPrintF.java`)
`System.out.printf(...)` permite formatar a saída (casas decimais,
alinhamento, etc.), similar ao `printf` de C. Ex.: `%.2f` imprime um
`double` com 2 casas decimais.

### 7. Entrada de dados (`LeitorDeDados.java`)
A classe `Scanner` (pacote `java.util`) é usada para ler dados digitados
pelo usuário no console: `scanner.nextInt()`, `scanner.nextLine()`, etc.
Boa prática: sempre fechar o `Scanner` com `.close()` quando não for mais
usado, para liberar o recurso.

## Arquivos deste módulo

| Arquivo | Conceito principal |
|---|---|
| `HelloWorld.java` | Estrutura mínima de um programa |
| `TiposPrimitivos.java` | Tipos primitivos e variáveis |
| `Constantes.java` | `final` e constantes |
| `OperadoresBasicos.java` | Operadores aritméticos e relacionais |
| `OperadoresAtalho.java` | Operadores de atribuição composta |
| `ManipulacaoStrings.java` | Métodos de `String` e comparação `==` vs `.equals()` |
| `DetalhesString.java` | Mais detalhes sobre Strings |
| `ExemploPrintF.java` | Formatação de saída com `printf` |
| `LeitorDeDados.java` | Entrada de dados com `Scanner` |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
