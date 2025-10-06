package Questao2;

public interface MeioPagamento {
    boolean processar(double valor);
    String getTipo();
}