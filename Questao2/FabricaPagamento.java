package Questao2;

public class FabricaPagamento {
    public static MeioPagamento criar(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cartao":
                return new CartaoCredito();
            case "boleto":
                return new BoletoBancario();
            case "pix":
                return new Pix();
            default:
                throw new IllegalArgumentException("Tipo não suportado: " + tipo);
        }
    }
}