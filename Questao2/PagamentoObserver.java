package Questao2;

public interface PagamentoObserver {
    void notificar(String tipoPagamento, double valor, boolean sucesso);
}