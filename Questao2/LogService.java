package Questao2;

// Observer que registra informações de pagamento em log
public class LogService implements PagamentoObserver {

    @Override
    public void notificar(String tipoPagamento, double valor, boolean sucesso) {
        // Registra no console o tipo de pagamento, valor e status
        System.out.println("[LOG] Registrando: " + tipoPagamento + " - R$" + valor + " - Sucesso: " + sucesso);
    }
}
