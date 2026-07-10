# Módulo 06 — Exceções

Uma habilidade profissional crucial: como lidar com erros de forma
elegante, sem deixar o programa "quebrar" de forma abrupta e sem
informação útil para quem está depurando.

## Conceitos abordados

### 1. O que são Exceptions
Uma exceção representa um evento que interrompe o fluxo normal de execução
de um programa (ex.: tentar acessar um índice inválido de um array, dividir
por zero, ler um arquivo que não existe). Em Java, exceções são objetos —
instâncias de classes que estendem `Throwable` (direta ou indiretamente).

Hierarquia simplificada:
```
Throwable
├── Error              -> problemas graves da JVM, geralmente não se trata (ex: OutOfMemoryError)
└── Exception
    ├── RuntimeException (e subclasses) -> UNCHECKED
    └── demais Exceptions               -> CHECKED
```

### 2. Checked vs Unchecked
- **Checked** (exceções verificadas): o compilador **obriga** o
  tratamento — ou você envolve a chamada em `try/catch`, ou declara
  `throws NomeDaExcecao` no método, repassando a responsabilidade para
  quem chamar. Ex.: `IOException`. Representam condições que o código
  chamador *deveria* prever e tratar (ex.: arquivo pode não existir).
- **Unchecked** (`RuntimeException` e subclasses): o compilador **não**
  obriga tratamento. Normalmente indicam erros de programação (ex.:
  `NullPointerException`, `ArrayIndexOutOfBoundsException`,
  `ArithmeticException`). Podem ser tratadas, mas o mais comum é corrigir a
  causa raiz no código.

### 3. Os blocos `try`, `catch` e `finally`
```java
try {
    // código que pode lançar uma exceção
} catch (TipoDaExcecao e) {
    // tratamento específico para esse tipo de exceção
} finally {
    // SEMPRE executa, com ou sem exceção — ideal para liberar recursos
}
```
É possível ter múltiplos blocos `catch` para tratar diferentes tipos de
exceção de formas diferentes. O primeiro `catch` compatível com o tipo
lançado é o que executa.

### 4. `try-with-resources`
Forma moderna (Java 7+) de garantir o fechamento automático de recursos
(arquivos, conexões, `Scanner`, etc.) que implementam a interface
`AutoCloseable`. O método `close()` é chamado automaticamente ao final do
bloco `try`, eliminando a necessidade de um `finally` manual só para isso.
Veja `TryWithResources.java`.

### 5. Criando e lançando suas próprias exceções (`throw`)
Além das exceções prontas da API do Java, é possível criar exceções
customizadas para representar regras de negócio específicas, estendendo
`Exception` (checked) ou `RuntimeException` (unchecked):

```java
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

E lançá-las manualmente com `throw new IdadeInvalidaException("...")`
quando uma regra de validação é violada. Veja `TratamentoDeExcecoes.java`.

## Arquivos deste módulo

### `src/concepts`
| Arquivo | Conceito principal |
|---|---|
| `TratamentoDeExcecoes.java` | `try/catch/finally`, checked vs unchecked, exceção customizada com `throw` |
| `TryWithResources.java` | `try-with-resources` e `AutoCloseable` |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
