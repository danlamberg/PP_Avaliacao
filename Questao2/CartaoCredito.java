package Questao2;

// Classe que implementa pagamento via Cartão de Crédito
public class CartaoCredito implements MeioPagamento {

    @Override
    public boolean processar(double valor) {
        // Simula o processamento do pagamento com cartão de crédito
        System.out.println("Processando cartão de crédito - R$" + valor);
        // Aqui poderia notificar outros módulos (Observer) sobre o pagamento
        return true;
    }
    
    @Override
    public String getTipo() {
        // Retorna o tipo de pagamento
        return "Cartão de Crédito";
    }
}
