# Módulo 05 — POO Parte 2

Aprofundando nos conceitos que dão poder e flexibilidade à Programação
Orientada a Objetos, e uma primeira introdução a programação concorrente
com Threads.

> Nota: o plano original deste módulo (ver `introducao.txt` da pasta antiga)
> previa focar em Herança, Polimorfismo e Interfaces/Classes Abstratas.
> O conteúdo prático implementado até agora (`Threads.java`) foi para
> concorrência; os tópicos de Herança/Polimorfismo/Interfaces seguem
> descritos abaixo como referência teórica e ficam como próximo passo de
> prática deste módulo.

## Conceitos abordados

### 1. Herança (`extends`)
Uma subclasse herda atributos e métodos de uma superclasse, reaproveitando
código e modelando relações "é um tipo de" (ex.: `Cachorro extends Animal`).
Em Java, uma classe só pode `extends` de **uma única** superclasse
(herança simples).

### 2. Polimorfismo e Sobrescrita (`@Override`)
Uma subclasse pode fornecer sua própria implementação de um método herdado
da superclasse — isso é **sobrescrita** (*overriding*). A anotação
`@Override` não é obrigatória, mas é uma boa prática: o compilador avisa se
o método não corresponde de fato a um método da superclasse (evita erros de
digitação silenciosos). A decisão de qual versão do método rodar é feita em
**tempo de execução**, com base no tipo real do objeto.

### 3. Classes Abstratas e Interfaces: "contratos"
- **Classe abstrata** (`abstract class`): não pode ser instanciada
  diretamente; serve de base para subclasses, podendo misturar métodos já
  implementados com métodos abstratos (sem corpo) que as subclasses são
  obrigadas a implementar.
- **Interface**: um contrato ainda mais estrito — define **o que** uma
  classe deve fazer, sem dizer **como**. Uma classe pode implementar
  várias interfaces (ao contrário da herança simples de classes).

### 4. Threads (`Threads.java`)
Uma **Thread** é uma linha de execução independente dentro de um programa,
permitindo que partes do código rodem "ao mesmo tempo" (concorrentemente).
No exemplo do módulo:

- Duas `Runnable` (`t1` e `t2`) são criadas, cada uma incrementando um
  contador compartilhado (`static int i`) 5 vezes.
- `new Thread(runnable).start()` inicia a execução da thread em paralelo
  com a `main`.
- Como `i` é uma variável **compartilhada** entre as duas threads, e o
  incremento (`i++`) não é uma operação atômica, esse código está sujeito a
  **condições de corrida** (*race conditions*): o valor final impresso pode
  variar entre execuções. Esse é um exemplo didático clássico do problema
  que motiva mecanismos de sincronização (`synchronized`, `Lock`, classes
  atômicas como `AtomicInteger`), que ficam como próximo tópico de estudo.

## Arquivos deste módulo

### `src/concepts`
| Arquivo | Conceito principal |
|---|---|
| `Threads.java` | Criação de Threads e condição de corrida em um contador compartilhado |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
