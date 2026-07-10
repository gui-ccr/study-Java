package src.concepts;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * CONCEITO: tratamento de eventos com EventHandler e lambdas.
 *
 * Componentes interativos (Button, TextField, ComboBox, ...) disparam
 * EVENTOS quando o usuário interage com eles (clique, tecla digitada, etc.).
 * Para reagir a um evento, registramos um "manipulador" (EventHandler).
 *
 * `Button` tem o método `setOnAction(EventHandler<ActionEvent>)`, chamado
 * quando o botão é clicado (ou ativado via teclado/acessibilidade).
 *
 * Existem duas formas equivalentes de fornecer esse handler:
 *
 * 1. Classe anônima (estilo mais antigo, mais verboso, mas explícito sobre
 *    o tipo `EventHandler<ActionEvent>` que está sendo implementado).
 * 2. Lambda (Java 8+, é o estilo predominante hoje em dia porque
 *    `EventHandler` é uma interface funcional — tem um único método
 *    abstrato, `handle(ActionEvent)` — então o compilador consegue inferir
 *    tudo a partir do corpo da lambda).
 *
 * Este exemplo mostra um contador de cliques, implementado das duas formas
 * lado a lado (em botões diferentes) só para efeito didático de comparação.
 */
public class EventosBotao extends Application {

    private int contadorClasseAnonima = 0;
    private int contadorLambda = 0;

    @Override
    public void start(Stage stage) {
        Label labelClasseAnonima = new Label("Cliques (classe anônima): 0");
        Button botaoClasseAnonima = new Button("Clique aqui (estilo antigo)");

        // --- Estilo 1: classe anônima implementando EventHandler ---
        botaoClasseAnonima.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent evento) {
                contadorClasseAnonima++;
                labelClasseAnonima.setText("Cliques (classe anônima): " + contadorClasseAnonima);
            }
        });

        Label labelLambda = new Label("Cliques (lambda): 0");
        Button botaoLambda = new Button("Clique aqui (lambda)");

        // --- Estilo 2: lambda — o mesmo comportamento, bem mais enxuto ---
        // `evento` é inferido como ActionEvent porque setOnAction espera
        // um EventHandler<ActionEvent>.
        botaoLambda.setOnAction(evento -> {
            contadorLambda++;
            labelLambda.setText("Cliques (lambda): " + contadorLambda);
        });

        VBox raiz = new VBox(12,
                labelClasseAnonima, botaoClasseAnonima,
                labelLambda, botaoLambda);
        raiz.setAlignment(Pos.CENTER);
        raiz.setPadding(new Insets(20));

        Scene cena = new Scene(raiz, 320, 220);
        stage.setTitle("Módulo 07 - Eventos de Botão");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
