package Questao4;

// Decorator que adiciona estatísticas a um relatório
public class EstatisticasDecorator extends RelatorioDecorator {

    // Recebe um relatório base para "decorar"
    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        // Gera o relatório base
        super.gerar();
        // Adiciona estatísticas ao relatório
        adicionarEstatisticas();
    }
    
    // Método que adiciona as estatísticas ao relatório
    private void adicionarEstatisticas() {
        System.out.println("Estatísticas:");
        System.out.println("- Faturamento total: R$ 15.000,00");
        System.out.println("- Pedidos no mês: 150");
        System.out.println("- Ticket médio: R$ 100,00");
    }
}
