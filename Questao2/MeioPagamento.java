package Questao2;

// Interface que define um meio de pagamento
public interface MeioPagamento {
    // Processa o pagamento de um determinado valor.
    boolean processar(double valor);
    //Retorna o tipo de pagamento (ex: "Boleto Bancário", "Cartão de Crédito", "Pix")
    String getTipo();
}