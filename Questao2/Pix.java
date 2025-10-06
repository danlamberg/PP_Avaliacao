package Questao2;

public class Pix implements MeioPagamento {
    @Override
    public boolean processar(double valor) {
        System.out.println("Processando PIX - R$" + valor);
        return true;
    }
    
    @Override
    public String getTipo() {
        return "PIX";
    }
}