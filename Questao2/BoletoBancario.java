package Questao2;

public class BoletoBancario implements MeioPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Gerando boleto - R$" + valor);
        return true;
    }
    
    @Override
    public String getTipo() {
        return "Boleto Bancário";
    }
}