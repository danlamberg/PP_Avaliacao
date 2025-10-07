package Questao2;

public class Main {
    public static void main(String[] args) {
        // Criar o sistema de pagamentos
        SistemaPagamentos sistema = new SistemaPagamentos();
        
        // Registrar observers para receber notificações de pagamento
        sistema.addObserver(new EmailService());
        sistema.addObserver(new LogService());
        
        // Criar diferentes meios de pagamento usando a fábrica
        MeioPagamento cartao = FabricaPagamento.criar("cartao");
        MeioPagamento boleto = FabricaPagamento.criar("boleto");
        MeioPagamento pix = FabricaPagamento.criar("pix");
        
        // Processar pagamentos e notificar observers
        sistema.processarPagamento(cartao, 100.0);
        sistema.processarPagamento(boleto, 200.0);
        sistema.processarPagamento(pix, 50.0);
    }
}
