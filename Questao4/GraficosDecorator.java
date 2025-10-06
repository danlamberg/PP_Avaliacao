package Questao4;

public class GraficosDecorator extends RelatorioDecorator {
    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        super.gerar();
        adicionarGraficos();
    }
    
    private void adicionarGraficos() {
        System.out.println("📊 Gráficos:");
        System.out.println("- Gráfico de vendas por mês");
        System.out.println("- Gráfico de produtos mais vendidos");
        System.out.println("- Gráfico de faturamento por categoria");
    }
}