# Glossário de Java e POO

Referência rápida de termos usados ao longo do curso, em ordem alfabética.
Cada módulo também tem seu próprio `README.md` com explicações mais
detalhadas e exemplos de código.

---

**Abstração** — Princípio de expor apenas o que é essencial sobre um
objeto (o "o quê"), escondendo os detalhes de implementação (o "como").
Classes abstratas e interfaces são as principais ferramentas de Java para
aplicar abstração.

**ArrayList** — Implementação da interface `List` baseada em um array
interno que cresce dinamicamente. É a lista mais usada no dia a dia por
oferecer acesso rápido por índice.

**Array (vetor)** — Estrutura de dados de **tamanho fixo** que armazena
múltiplos valores do mesmo tipo, acessados por índice (começando em `0`).

**Autoboxing / Unboxing** — Conversão automática que o Java faz entre um
tipo primitivo (`int`) e sua classe wrapper correspondente (`Integer`),
necessária porque coleções só armazenam objetos.

**Checked Exception** — Exceção que o compilador obriga a tratar
(`try/catch`) ou declarar (`throws`). Representa uma condição que o código
chamador deveria prever (ex.: `IOException`).

**Classe** — O molde/projeto que define atributos (estado) e métodos
(comportamento) de um tipo de objeto. Não ocupa memória "de dados" por si
só — só quando instanciada.

**Coleção (Collection)** — Termo genérico para estruturas de dados
dinâmicas do Java Collections Framework (`List`, `Set`, `Map`, etc.), em
contraste com arrays de tamanho fixo.

**Construtor** — Método especial, com o mesmo nome da classe e sem tipo de
retorno, executado ao criar (`new`) um objeto, usado para inicializar seus
atributos.

**Encapsulamento** — Prática de esconder o estado interno de um objeto
(atributos `private`) e expor apenas uma interface pública controlada
(getters/setters e métodos), protegendo a integridade dos dados.

**EventHandler** — Interface funcional do JavaFX que representa um
"manipulador" de evento (ex.: clique de botão). Pode ser implementada com
uma classe anônima ou, mais comumente, com uma lambda, e é registrada via
métodos como `setOnAction()`.

**Enum** — Tipo especial de classe que representa um conjunto fixo e
finito de constantes nomeadas (ex.: dias da semana, status de um pedido).
Mais seguro e legível que usar `int` ou `String` soltos para o mesmo fim.

**equals()** — Método de `Object` usado para comparar o **conteúdo** de
dois objetos. Por padrão compara referência (igual a `==`); deve ser
sobrescrito quando "igualdade" significa outra coisa para a classe.

**Exception** — Objeto que representa um evento que interrompe o fluxo
normal de execução do programa (ex.: erro ao acessar um índice inválido).

**final** — Palavra-chave que impede reatribuição (em variáveis),
sobrescrita (em métodos) ou herança (em classes).

**FXML** — Formato de arquivo XML usado pelo JavaFX para descrever a
árvore de componentes de uma tela de forma declarativa, separando o
"design" da lógica Java. É o formato gerado por ferramentas visuais como o
Scene Builder (ex.: ao arrastar componentes no NetBeans).

**Getter/Setter** — Métodos públicos convencionais para ler (`getX()`) e
modificar (`setX()`) um atributo privado de forma controlada.

**HashMap** — Implementação de `Map` baseada em tabela hash: acesso muito
rápido por chave, sem garantia de ordem de iteração.

**HashSet** — Implementação de `Set` baseada em tabela hash: garante que
não existam elementos duplicados, sem garantia de ordem.

**hashCode()** — Método de `Object` que gera um número (hash) usado por
coleções baseadas em tabela hash (`HashMap`, `HashSet`) para organizar e
localizar objetos. Deve ser sobrescrito de forma consistente com
`equals()`.

**Herança (Inheritance)** — Mecanismo pelo qual uma subclasse (`extends`)
herda atributos e métodos de uma superclasse, promovendo reuso de código e
modelando relações "é um tipo de".

**Interface** — Contrato de comportamento: define métodos que uma classe
**deve** implementar (`implements`), sem dizer como. Uma classe pode
implementar múltiplas interfaces.

**Iterator** — Objeto que permite percorrer uma coleção elemento a
elemento, com suporte a remoção segura de itens durante a iteração
(diferente do for-each, que não permite remoção direta).

**Layout (Pane)** — No JavaFX, um `Node` especial responsável por organizar
e posicionar seus `Node`s filhos na tela. Exemplos: `VBox` (empilha
verticalmente), `HBox` (lado a lado), `GridPane` (grade de linhas/colunas)
e `BorderPane` (5 regiões: topo, base, esquerda, direita, centro).

**List** — Interface de coleção **ordenada** que permite elementos
duplicados e acesso por índice. Principal implementação: `ArrayList`.

**Map** — Interface de coleção que associa **chaves** únicas a
**valores** (par chave-valor). Principal implementação: `HashMap`.

**Método** — Bloco de código dentro de uma classe que define um
comportamento/ação que os objetos daquela classe podem executar.

**Node** — Classe-base de tudo que pode ser exibido em uma `Scene` do
JavaFX (botões, textos, layouts, imagens). Os `Node`s formam uma árvore:
layouts contêm outros `Node`s como filhos.

**Objeto** — Instância concreta de uma classe, criada com `new`, com
valores próprios para seus atributos.

**Overloading (Sobrecarga)** — Múltiplos métodos com o mesmo nome, mas
assinaturas (parâmetros) diferentes na mesma classe. Resolvido em tempo de
**compilação**.

**Overriding (Sobrescrita)** — Uma subclasse fornece sua própria
implementação de um método já definido na superclasse (`@Override`).
Resolvido em tempo de **execução**.

**Polimorfismo** — Capacidade de uma referência de um tipo (pai/interface)
apontar para objetos de tipos diferentes (filhos/implementações), com o
comportamento correto determinado em tempo de execução.

**Record** — Tipo compacto (Java 14+) para representar dados imutáveis. O
compilador gera automaticamente construtor, getters, `equals()`,
`hashCode()` e `toString()`.

**Runnable** — Interface funcional que representa uma tarefa a ser
executada, tipicamente por uma `Thread` (método `run()`).

**Scanner** — Classe utilitária (`java.util.Scanner`) para ler dados de
uma fonte de entrada, como o teclado (`System.in`).

**Scene** — No JavaFX, representa o conteúdo exibido dentro de uma `Stage`
em um dado momento: um grafo de `Node`s mais um tamanho (largura x altura).
Uma `Stage` pode trocar de `Scene` em tempo de execução.

**Scene Builder** — Ferramenta visual (integrável ao NetBeans e outras
IDEs) para montar telas JavaFX arrastando e soltando componentes, gerando
um arquivo `FXML` por trás dos panos. Alternativa a escrever a árvore de
componentes inteiramente em código Java.

**Set** — Interface de coleção que garante **unicidade** dos elementos
(não permite duplicatas). Principal implementação: `HashSet`.

**static** — Modificador que faz um atributo ou método pertencer à
**classe**, e não a instâncias individuais. Acessado via
`NomeDaClasse.membro`, sem precisar criar um objeto.

**Stage** — No JavaFX, representa a janela do sistema operacional. É criada
pelo próprio JavaFX e recebida como parâmetro em `Application.start(Stage)`;
só fica visível depois de `show()`.

**String Pool** — Área especial de memória onde a JVM armazena literais de
`String`, reaproveitando o mesmo objeto para literais idênticos (por isso
`==` entre dois literais iguais costuma ser `true`).

**Thread** — Linha de execução independente dentro de um programa,
permitindo que partes do código rodem concorrentemente.

**try / catch / finally** — Estrutura de tratamento de exceções: `try`
envolve o código arriscado, `catch` trata um tipo específico de exceção, e
`finally` sempre executa (usado para liberar recursos).

**try-with-resources** — Variante do `try` (Java 7+) que fecha
automaticamente recursos que implementam `AutoCloseable` ao final do
bloco, sem precisar de um `finally` manual.

**Unchecked Exception** — Subclasse de `RuntimeException`. O compilador
não obriga o tratamento; geralmente indica um erro de programação (ex.:
`NullPointerException`).

---

Veja o [README raiz](README.md) para a lista completa de módulos do curso.
