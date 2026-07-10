# 🖼️ JavaFX: Construindo Interfaces Gráficas (GUI) em Java

Este documento resume os conceitos de JavaFX abordados neste módulo, servindo
como material de consulta rápida. Diferente dos módulos anteriores — que
rodam inteiramente no console —, aqui o foco é a construção de uma
**interface gráfica (front-end desktop)** para aplicações Java.

---

## 🕰️ O que é JavaFX e um pouco de contexto histórico

**JavaFX** é o framework oficial da plataforma Java para construir
interfaces gráficas (GUI — *Graphical User Interface*): janelas, botões,
campos de texto, formulários, etc. Antes dele, o Java teve duas outras
tecnologias de GUI:

* **AWT** (*Abstract Window Toolkit*) — a primeira, dos anos 90, hoje
  considerada ultrapassada (visual "pesado", poucos componentes).
* **Swing** — sucessor do AWT, dominante por muitos anos, ainda presente em
  muitos sistemas legados. Tem mais componentes e é mais flexível, mas seu
  visual e API são considerados datados hoje.
* **JavaFX** — o sucessor moderno, com suporte a CSS para estilização,
  animações, gráficos vetoriais, data binding e um modelo de layout mais
  flexível. É o que se ensina atualmente em disciplinas de POO/GUI.

Um detalhe importante: a partir do **Java 11**, o JavaFX **deixou de vir
embutido no JDK** e passou a ser um módulo separado (o projeto **OpenJFX**),
distribuído à parte. Isso afeta diretamente como você compila e roda os
exemplos deste módulo (veja a seção "Como rodar" abaixo).

---

## 🎓 Por que a faculdade ensina isso via NetBeans?

É comum que a disciplina de POO ensine JavaFX usando o **NetBeans** porque
essa IDE historicamente vem com um plugin visual chamado **Scene Builder**
integrado (ou facilmente integrável), permitindo montar a tela **arrastando
e soltando** componentes (botões, labels, campos) em uma tela de design, sem
escrever código Java na mão para posicionar cada elemento. O NetBeans gera,
por trás dos panos, um arquivo **FXML** (um XML que descreve a árvore de
componentes da tela) e uma classe "Controller" que você completa com a
lógica dos eventos.

Isso é ótimo para produtividade e para quem está começando a visualizar
layouts, mas cria uma dependência forte de uma IDE específica — o que não
combina com o restante deste repositório, que é agnóstico de IDE (só
depende de `javac`/`java`).

**Alternativa sem NetBeans (o que este módulo usa):** construir a interface
**inteiramente em código Java**, sem FXML nem Scene Builder. É mais verboso
para telas grandes, mas tem uma vantagem didática: força o entendimento de
como os componentes realmente se relacionam (Stage → Scene → Node), sem a
"mágica" de um gerador visual. Os exemplos aqui podem ser escritos e
compilados em **qualquer editor** (VS Code, terminal, etc.), desde que o
JavaFX SDK esteja disponível — veja a seção seguinte.

> Se você usa o NetBeans na faculdade e quer aproveitar o Scene Builder, os
> conceitos (Stage, Scene, Node, layouts, eventos) são exatamente os mesmos
> — só muda a ferramenta usada para *montar* a árvore de componentes.

---

## 🧩 Conceitos centrais

### 1. `Application`, `Stage` e `Scene`: o esqueleto de toda tela

* **`Application`**: classe abstrata que toda aplicação JavaFX deve
  estender. Define o ciclo de vida da UI: `init()` (opcional) →
  `start(Stage)` (obrigatório) → `stop()` (opcional, ao fechar). O `main`
  apenas chama `Application.launch(args)`.
* **`Stage`**: representa a **janela** do sistema operacional. É criada
  automaticamente pelo JavaFX e passada como parâmetro para `start()`.
  Só fica visível depois de `stage.show()`.
* **`Scene`**: representa o **conteúdo** exibido dentro de uma `Stage` em
  um dado momento (é possível trocar a `Scene` de uma `Stage` em tempo de
  execução, por exemplo para trocar de "tela"). Recebe um `Node` raiz e um
  tamanho (largura x altura).

### 2. Hierarquia de `Node`

Tudo o que aparece na tela — botões, textos, layouts, imagens — é um
**`Node`**. Os `Node`s formam uma árvore: um layout (que também é um
`Node`) contém outros `Node`s como filhos, que por sua vez podem conter
outros, e assim por diante, até a raiz passada para a `Scene`.

### 3. Layouts (Panes)

Layouts são `Node`s especiais responsáveis por posicionar seus filhos:

| Layout | Organiza os filhos... |
|---|---|
| `VBox` | Empilhados verticalmente |
| `HBox` | Lado a lado, horizontalmente |
| `GridPane` | Em uma grade de linhas e colunas (ótimo para formulários) |
| `BorderPane` | Em 5 regiões: topo, base, esquerda, direita e centro |

### 4. Componentes (Controls) comuns

`Label` (texto fixo), `Button` (botão clicável), `TextField` (entrada de
uma linha), `TextArea` (entrada de múltiplas linhas), `ComboBox` (lista
suspensa de opções) e `CheckBox` (caixa de marcação booleana) cobrem a
maioria dos formulários simples.

### 5. Tratamento de eventos

Componentes interativos disparam eventos (clique, tecla, seleção). O
padrão mais comum é `setOnAction(EventHandler<ActionEvent>)` em botões. Um
`EventHandler` pode ser implementado como classe anônima (estilo antigo) ou,
mais comumente hoje, como **lambda** (já que `EventHandler` é uma interface
funcional). Veja `EventosBotao.java` para a comparação lado a lado.

### 6. Data binding básico (Property/Bindings) — nível introdutório

JavaFX tem um sistema de **propriedades observáveis** (`StringProperty`,
`IntegerProperty`, etc.) que permite "amarrar" o valor de um componente ao
de outro automaticamente, sem precisar escrever um `EventHandler` manual
para sincronizar os dois. Por exemplo, `label.textProperty().bind(campo.textProperty())`
faz o texto do `Label` acompanhar automaticamente o que é digitado no
`TextField`. Este módulo não aprofunda o assunto (é mais avançado), mas vale
saber que ele existe: é o mecanismo por trás de UIs mais reativas em JavaFX.

---

## 🚀 Como rodar os exemplos

Isto é o maior ponto de fricção para quem só usou o NetBeans: fora da IDE,
o JavaFX **não vem embutido** no JDK a partir da versão 11. Duas formas de
resolver isso:

### Opção A — OpenJFX SDK + `--module-path` (linha de comando)

1. Baixe o **OpenJFX SDK** compatível com seu JDK em
   [openjfx.io](https://openjfx.io/) (ex.: `javafx-sdk-21`).
2. Compile e rode apontando para os módulos do SDK:

```sh
javac --module-path "C:\caminho\para\javafx-sdk-21\lib" --add-modules javafx.controls src/concepts/AplicacaoBasica.java

java --module-path "C:\caminho\para\javafx-sdk-21\lib" --add-modules javafx.controls src.concepts.AplicacaoBasica
```

> Ajuste o caminho do `--module-path` para onde você extraiu o SDK. No
> Windows, use `;` como separador se precisar apontar mais de um caminho; em
> Linux/Mac, use `:`.

### Opção B — Maven com `javafx-maven-plugin` (recomendado para projetos maiores)

Adicione o plugin `org.openjfx:javafx-maven-plugin` ao `pom.xml` do projeto
e as dependências `javafx-controls`/`javafx-fxml`. Com isso, basta rodar:

```sh
mvn javafx:run
```

O plugin cuida de baixar o JavaFX certo para seu sistema operacional e
montar o `--module-path`/`--add-modules` automaticamente. É a forma mais
tranquila de trabalhar com JavaFX fora do NetBeans em projetos reais.

### E se eu estiver no NetBeans?

O NetBeans (versões com suporte a JavaFX) já resolve o `--module-path`
automaticamente ao criar um projeto do tipo "JavaFX Application" — basta
rodar com o botão de "play" da IDE. Os arquivos `.java` deste módulo também
podem ser importados/copiados para um projeto NetBeans desse tipo sem
alterações.

---

## Arquivos deste módulo

### `src/concepts`

| Arquivo | Conceito principal |
|---|---|
| `AplicacaoBasica.java` | `Application`, `Stage`, `Scene`, ciclo de vida (`start`/`main`) |
| `LayoutsBasicos.java` | `VBox`, `HBox`, `GridPane`, `BorderPane` combinados |
| `EventosBotao.java` | `EventHandler` (classe anônima vs. lambda), `setOnAction` |

### `src/desafios`

| Arquivo | Conceito principal |
|---|---|
| `FormularioCadastro.java` | Formulário com `GridPane`, validação de entrada e `Alert` |

Veja também o [glossário de termos](../GLOSSARIO.md) para consulta rápida.
