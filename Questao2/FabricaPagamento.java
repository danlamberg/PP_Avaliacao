package Questao2;

// Fábrica de meios de pagamento (Factory)
// Retorna uma implementação de MeioPagamento de acordo com o tipo informado
public class FabricaPagamento {

    public static MeioPagamento criar(String tipo) {
        // Converte o tipo para minúsculo para facilitar a comparação
        switch (tipo.toLowerCase()) {
            case "cartao":
                // Retorna pagamento com cartão de crédito
                return new CartaoCredito();
            case "boleto":
                // Retorna pagamento via boleto bancário
                return new BoletoBancario();
            case "pix":
                // Retorna pagamento via Pix
                return new Pix();
            default:
                // Lança exceção se o tipo não for suportado
                throw new IllegalArgumentException("Tipo não suportado: " + tipo);
        }
    }
}
