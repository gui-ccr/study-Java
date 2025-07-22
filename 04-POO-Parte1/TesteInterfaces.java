interface Notificavel {
    void enviarNotificacao(String destinatario, String mensagem);

    String TIPO_NOTIFICACAO_PADRAO = "Geral";

    default void logarEnvio(String destinatario, String mensagem) {
        System.out.println("Notificação para " + destinatario + " com a mensagem '" + mensagem + "' ");
    }
}

class EmailNotifier implements Notificavel {

    @Override
    public void enviarNotificacao(String destinatario, String mensagem) {

        System.out.println("EmailNotifier: Enviando e-mail para '" + destinatario + "': '" + mensagem + "'");

    }

    @Override
    public void logarEnvio(String destinatario, String mensagem) {

        System.out.println("EmailNotifier Log: Email enviado para " + destinatario + " com sucesso.");

    }

}

class SmsNotifier implements Notificavel {

    @Override
    public void enviarNotificacao(String destinatario, String mensagem) {

        System.out.println("SmsNotifier: Enviando SMS para '" + destinatario + "': '" + mensagem + "'");

    }

    // SmsNotifier não sobrescreve logarEnvio(), então usará o método default da
    // interface.

}

public class TesteInterfaces {

    public static void main(String[] args) {

        // aqui eu criei instancias das classes que implementao a interface
        EmailNotifier emailSender = new EmailNotifier();
        SmsNotifier smsSender = new SmsNotifier();

        System.out.println("---- Testando notificações individuais ----");

        // vou agora usar o metodo enviar notificacao
        emailSender.enviarNotificacao("guilhermerodrigues6484@gmail.com",
                "Esse é um teste para verificar o envio de mensagens");

        smsSender.enviarNotificacao("+5533998217341", "Teste de envio de sms!");

        // 3. Chame logarEnvio() para cada uma
        // EmailNotifier usará sua versão sobrescrita

        emailSender.logarEnvio("guilhermerodrigues6484@gmail.com", "Sua fatura chegou man!!!");

        smsSender.logarEnvio("+5511987654321", "Seu pedido foi despachado!");

        System.out.println("\n--- Usando Polimorfismo com ArrayList de Notificavel ---");

        // ArrayList<Notificavel> e adicione as instâncias

        java.util.ArrayList<Notificavel> listaNotificadores = new java.util.ArrayList<>();

        listaNotificadores.add(emailSender);
        listaNotificadores.add(smsSender);
        listaNotificadores.add(new EmailNotifier()); // adicionando outra instancia de EmailNotifier

        // Itere sobre o ArrayList e chame os métodos polimorficamente

        for (Notificavel notificador : listaNotificadores) {
            System.out.println("-------------------------");
            notificador.enviarNotificacao("aluno@exemplo.com", "Lembrete de aula!");
            notificador.logarEnvio("aluno@exemplo.com", "Lembrete de aula!");

            // 6. Acesse e imprima a constante TIPO_NOTIFICACAO_PADRAO da interface
            System.out.println("\n--- Constante da Interface ---");
            System.out.println("Tipo de Notificação Padrão: " + Notificavel.TIPO_NOTIFICACAO_PADRAO);
        }
    }
}
