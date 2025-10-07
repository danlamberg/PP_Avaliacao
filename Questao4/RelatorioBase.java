package Questao4;

// Implementação básica de um relatório
public class RelatorioBase implements Relatorio {

    @Override
    public void gerar() {
        // Exibe informações básicas do relatório
        System.out.println("Relatório Base:");
        System.out.println("- Lista de pedidos");
        System.out.println("- Data dos pedidos");
        System.out.println("- Valor dos pedidos");
    }
}
