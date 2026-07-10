package src.concepts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * CONCEITO: layouts (Panes) são os "containers" que organizam Nodes na tela.
 *
 * JavaFX oferece vários layouts prontos; os mais usados no dia a dia são:
 *
 * - VBox: empilha os filhos verticalmente (um embaixo do outro).
 * - HBox: alinha os filhos horizontalmente (um do lado do outro).
 * - GridPane: organiza os filhos em uma grade de linhas e colunas, ótimo
 *   para formulários (rótulo numa coluna, campo de entrada em outra).
 * - BorderPane: divide a área em 5 regiões (top, bottom, left, right,
 *   center), útil para telas com cabeçalho/rodapé/menu lateral.
 *
 * Esses layouts podem ser aninhados livremente (um VBox dentro de um
 * BorderPane, que contém um HBox, etc.) para montar telas complexas.
 */
public class LayoutsBasicos extends Application {

    @Override
    public void start(Stage stage) {
        // --- HBox: uma barra horizontal com botões ---
        Button botaoSalvar = new Button("Salvar");
        Button botaoCancelar = new Button("Cancelar");
        HBox barraDeBotoes = new HBox(10, botaoSalvar, botaoCancelar); // 10 = espaçamento entre filhos
        barraDeBotoes.setAlignment(Pos.CENTER_RIGHT);

        // --- GridPane: um pequeno formulário em grade (linha, coluna) ---
        GridPane formulario = new GridPane();
        formulario.setHgap(8); // espaçamento horizontal entre colunas
        formulario.setVgap(8); // espaçamento vertical entre linhas
        formulario.setPadding(new Insets(10));

        Label rotuloNome = new Label("Nome:");
        TextField campoNome = new TextField();
        Label rotuloEmail = new Label("Email:");
        TextField campoEmail = new TextField();

        // add(node, colunaIndex, linhaIndex) — índices começam em 0
        formulario.add(rotuloNome, 0, 0);
        formulario.add(campoNome, 1, 0);
        formulario.add(rotuloEmail, 0, 1);
        formulario.add(campoEmail, 1, 1);

        // --- VBox: empilha o título, o formulário e a barra de botões ---
        Label titulo = new Label("Cadastro rápido");
        VBox corpo = new VBox(15, titulo, formulario, barraDeBotoes);
        corpo.setPadding(new Insets(15));

        // --- BorderPane: o layout "raiz" da janela, com o corpo no centro ---
        BorderPane raiz = new BorderPane();
        raiz.setCenter(corpo);

        Scene cena = new Scene(raiz, 380, 260);
        stage.setTitle("Módulo 07 - Layouts Básicos");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
