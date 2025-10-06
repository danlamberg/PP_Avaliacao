package Questao2;

public class LogService implements PagamentoObserver {
    @Override
    public void notificar(String tipoPagamento, double valor, boolean sucesso) {
        System.out.println("[LOG] Registrando: " + tipoPagamento + " - R$" + valor + " - Sucesso: " + sucesso);
    }
}