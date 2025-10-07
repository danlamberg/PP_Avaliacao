package Questao2;

// Observer que envia notificação por e-mail quando um pagamento é processado
public class EmailService implements PagamentoObserver {

    @Override
    public void notificar(String tipoPagamento, double valor, boolean sucesso) {
        // Define o status do pagamento
        String status = sucesso ? "aprovado" : "recusado";
        // Simula o envio de um e-mail com a informação do pagamento
        System.out.println("[EMAIL] Pagamento " + status + ": " + tipoPagamento + " - R$" + valor);
    }
}
