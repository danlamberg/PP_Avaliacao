package Questao2;

public class CartaoCredito implements MeioPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Processando cartão de crédito - R$" + valor);
        return true;
    }
    
    @Override
    public String getTipo() {
        return "Cartão de Crédito";
    }
}