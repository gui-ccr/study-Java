package src.concepts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * CONCEITO: estrutura mínima de uma aplicação JavaFX.
 *
 * Toda aplicação gráfica JavaFX segue o mesmo esqueleto:
 *
 * 1. Uma classe estende `Application` (a classe-base do ciclo de vida da UI).
 * 2. O método `main` apenas chama `Application.launch(args)`, que prepara o
 *    "toolkit" gráfico do JavaFX e, internamente, chama o método `start`.
 * 3. `start(Stage stage)` é o ponto de entrada real da interface. Recebe uma
 *    `Stage` (a JANELA do sistema operacional) já criada pelo JavaFX.
 * 4. Dentro de uma `Stage` colocamos uma `Scene` (o "conteúdo" da janela em
 *    um dado momento — pode-se até trocar a Scene de uma Stage em runtime).
 * 5. Uma `Scene` é construída a partir de um grafo de `Node`s (nós): tudo que
 *    é exibido na tela (botões, textos, layouts) é um `Node`.
 *
 * Ciclo de vida resumido: `main` -> `launch()` -> construtor da Application
 * -> `init()` (opcional, raramente usado) -> `start(Stage)` -> aplicação
 * roda até a janela ser fechada -> `stop()` (opcional, para limpeza).
 */
public class AplicacaoBasica extends Application {

    @Override
    public void start(Stage stageJanelaPrincipal) {
        // Label é o Node mais simples: um texto não editável.
        Label mensagem = new Label("Olá, JavaFX!");

        // StackPane é um layout simples que empilha/centraliza seus filhos.
        // Usamos aqui só para ter uma raiz de cena com um único componente.
        StackPane raiz = new StackPane(mensagem);

        // A Scene define o "conteúdo" exibido e seu tamanho inicial (largura x altura).
        Scene cena = new Scene(raiz, 300, 200);

        stageJanelaPrincipal.setTitle("Módulo 07 - Aplicação Básica");
        stageJanelaPrincipal.setScene(cena);

        // Nada é exibido até chamarmos show() — a Stage existe, mas fica invisível.
        stageJanelaPrincipal.show();
    }

    public static void main(String[] args) {
        // launch() é um método estático herdado de Application. Ele cuida de
        // inicializar a thread de UI do JavaFX (a "JavaFX Application Thread")
        // e, então, invoca start(Stage) automaticamente.
        launch(args);
    }
}
