package Questao2;

// Classe que implementa pagamento via Boleto Bancário
public class BoletoBancario implements MeioPagamento {

    @Override
    public boolean processar(double valor) {
        // Simula a geração do boleto
        System.out.println("Gerando boleto - R$" + valor);
        // Aqui poderia notificar outros módulos (Observer) sobre o pagamento
        return true;
    }
    
    @Override
    public String getTipo() {
        // Retorna o tipo de pagamento
        return "Boleto Bancário";
    }
}
