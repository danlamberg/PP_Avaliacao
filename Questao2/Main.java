package Questao2;

public class Main {
    public static void main(String[] args) {
        // Criar sistema
        SistemaPagamentos sistema = new SistemaPagamentos();
        
        // Registrar observers
        sistema.addObserver(new EmailService());
        sistema.addObserver(new LogService());
        
        // Processar pagamentos
        MeioPagamento cartao = FabricaPagamento.criar("cartao");
        MeioPagamento boleto = FabricaPagamento.criar("boleto");
        MeioPagamento pix = FabricaPagamento.criar("pix");
        
        sistema.processarPagamento(cartao, 100.0);
        sistema.processarPagamento(boleto, 200.0);
        sistema.processarPagamento(pix, 50.0);
    }
}