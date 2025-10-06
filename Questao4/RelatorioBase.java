package Questao4;

public class RelatorioBase implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("📊 Relatório Base:");
        System.out.println("- Lista de pedidos");
        System.out.println("- Data dos pedidos");
        System.out.println("- Valor dos pedidos");
    }
}