package src.desafios;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * DESAFIO 01: Formulário de Cadastro com validação simples.
 *
 * Enunciado: monte uma tela com campos "Nome", "Idade" e "Email" e um botão
 * "Cadastrar". Ao clicar no botão:
 *   - valide que o nome não está vazio;
 *   - valide que a idade é um número inteiro válido (e não negativo);
 *   - valide que o email contém, pelo menos, um "@";
 *   - se alguma validação falhar, mostre um Alert de erro explicando o motivo;
 *   - se tudo estiver certo, mostre um Alert de informação com os dados
 *     digitados (ou atualize um Label na tela, como abaixo).
 *
 * Este arquivo já traz uma solução completa, no mesmo espírito dos outros
 * desafios do repositório (veja, por exemplo, Exercicio.java do módulo 03).
 */
public class FormularioCadastro extends Application {

    @Override
    public void start(Stage stage) {
        Label rotuloNome = new Label("Nome:");
        TextField campoNome = new TextField();

        Label rotuloIdade = new Label("Idade:");
        TextField campoIdade = new TextField();

        Label rotuloEmail = new Label("Email:");
        TextField campoEmail = new TextField();

        Button botaoCadastrar = new Button("Cadastrar");
        Label labelResultado = new Label();

        // Toda a lógica de validação fica na lambda do onAction, chamada
        // apenas quando o usuário clica em "Cadastrar".
        botaoCadastrar.setOnAction(evento -> {
            String nome = campoNome.getText().trim();
            String idadeTexto = campoIdade.getText().trim();
            String email = campoEmail.getText().trim();

            // 1. Validação do nome
            if (nome.isEmpty()) {
                exibirAlertaDeErro("O campo Nome não pode ficar vazio.");
                return;
            }

            // 2. Validação da idade (precisa ser um inteiro válido, >= 0)
            int idade;
            try {
                idade = Integer.parseInt(idadeTexto);
            } catch (NumberFormatException e) {
                exibirAlertaDeErro("A idade precisa ser um número inteiro válido.");
                return;
            }
            if (idade < 0) {
                exibirAlertaDeErro("A idade não pode ser negativa.");
                return;
            }

            // 3. Validação simples de email (apenas checa a presença de "@")
            if (!email.contains("@")) {
                exibirAlertaDeErro("Informe um email válido (precisa conter '@').");
                return;
            }

            // Se chegou até aqui, os dados são válidos.
            String resumo = String.format(
                    "Cadastro realizado!%nNome: %s%nIdade: %d%nEmail: %s",
                    nome, idade, email);
            labelResultado.setText(resumo);

            Alert sucesso = new Alert(Alert.AlertType.INFORMATION);
            sucesso.setTitle("Cadastro realizado");
            sucesso.setHeaderText(null);
            sucesso.setContentText(resumo);
            sucesso.showAndWait();
        });

        GridPane raiz = new GridPane();
        raiz.setHgap(8);
        raiz.setVgap(10);
        raiz.setPadding(new Insets(15));

        raiz.add(rotuloNome, 0, 0);
        raiz.add(campoNome, 1, 0);
        raiz.add(rotuloIdade, 0, 1);
        raiz.add(campoIdade, 1, 1);
        raiz.add(rotuloEmail, 0, 2);
        raiz.add(campoEmail, 1, 2);
        raiz.add(botaoCadastrar, 1, 3);
        raiz.add(labelResultado, 0, 4, 2, 1); // ocupa 2 colunas, 1 linha

        Scene cena = new Scene(raiz, 380, 280);
        stage.setTitle("Módulo 07 - Desafio: Formulário de Cadastro");
        stage.setScene(cena);
        stage.show();
    }

    private void exibirAlertaDeErro(String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro de validação");
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
