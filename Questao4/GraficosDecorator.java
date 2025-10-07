package Questao4;

// Decorator que adiciona gráficos a um relatório
public class GraficosDecorator extends RelatorioDecorator {

    // Recebe um relatório base para "decorar"
    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        // Gera o relatório base
        super.gerar();
        // Adiciona gráficos ao relatório
        adicionarGraficos();
    }
    
    // Método que adiciona os gráficos ao relatório
    private void adicionarGraficos() {
        System.out.println("Gráficos:");
        System.out.println("- Gráfico de vendas por mês");
        System.out.println("- Gráfico de produtos mais vendidos");
        System.out.println("- Gráfico de faturamento por categoria");
    }
}
