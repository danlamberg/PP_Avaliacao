package Questao2;

// Interface para observers que recebem notificações de pagamento
public interface PagamentoObserver {
    //Método chamado quando um pagamento é processado.
    void notificar(String tipoPagamento, double valor, boolean sucesso);
}