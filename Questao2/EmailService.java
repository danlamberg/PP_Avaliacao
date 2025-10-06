package Questao2;

public class EmailService implements PagamentoObserver {
    @Override
    public void notificar(String tipoPagamento, double valor, boolean sucesso) {
        String status = sucesso ? "aprovado" : "recusado";
        System.out.println("[EMAIL] Pagamento " + status + ": " + tipoPagamento + " - R$" + valor);
    }
}