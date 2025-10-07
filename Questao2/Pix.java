package Questao2;

// Classe que implementa pagamento via PIX
public class Pix implements MeioPagamento {

    @Override
    public boolean processar(double valor) {
        // Simula o processamento do pagamento via PIX
        System.out.println("Processando PIX - R$" + valor);
        // Aqui poderia notificar outros módulos (Observer) sobre o pagamento
        return true;
    }
    
    @Override
    public String getTipo() {
        // Retorna o tipo de pagamento
        return "PIX";
    }
}
