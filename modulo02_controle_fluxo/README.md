# Módulo 02 — Controle de Fluxo

Como fazer o programa tomar decisões e repetir ações. Com os fundamentos do
Módulo 01, aqui entramos na lógica que dá vida aos programas: condicionais
e laços de repetição.

## Conceitos abordados

### 1. Operadores relacionais e lógicos
- Relacionais: `==` (igual), `!=` (diferente), `>`, `<`, `>=`, `<=` — sempre
  retornam um `boolean`.
- Lógicos: `&&` (E — só é `true` se ambos os lados forem `true`), `||` (OU —
  basta um lado ser `true`), `!` (negação).
- Java usa **short-circuit evaluation**: em `a && b`, se `a` já for `false`,
  `b` nem é avaliado (útil para evitar, por exemplo, `NullPointerException`
  ao encadear `objeto != null && objeto.metodo()`).

### 2. Estruturas condicionais: `if`, `else`, `else if`
Permitem executar um bloco de código apenas quando uma condição booleana é
verdadeira. `else if` encadeia múltiplas condições mutuamente exclusivas.

### 3. Estrutura de múltipla escolha: `switch`
Alternativa mais legível a uma cadeia longa de `else if` quando se compara
uma única variável a vários valores possíveis (ex: dia da semana). Veja
`SwitchDiaDaSemana.java`. Sem `break`, a execução "cai" para o próximo
`case` (fall-through) — por isso cada `case` tradicional termina com
`break`.

### 4. Laços de repetição: `while`, `do-while` e `for`
- `while (condição) { ... }`: repete enquanto a condição for verdadeira,
  testada **antes** de cada execução.
- `do { ... } while (condição);`: igual ao `while`, mas testa a condição
  **depois**, garantindo que o bloco rode ao menos uma vez.
- `for (inicialização; condição; incremento) { ... }`: ideal quando se sabe
  de antemão quantas vezes (ou sobre qual intervalo) repetir — veja
  `ExemploFor.java`.

## Arquivos deste módulo

### `src/concepts`
| Arquivo | Conceito principal |
|---|---|
| `ExemploFor.java` | Laço `for` |

### `src/desafios`
| Arquivo | Conceito principal |
|---|---|
| `Fundamentos.java` | Prática combinando variáveis e condicionais |
| `ExemploIFELSE.java` | `if` / `else if` / `else` |
| `SwitchDiaDaSemana.java` | Estrutura `switch` |
| `VerificaVotacao.java` | Condicionais aplicadas a um caso prático (idade de votação) |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
