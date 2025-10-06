package Questao4;

public class EstatisticasDecorator extends RelatorioDecorator {
    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        super.gerar();
        adicionarEstatisticas();
    }
    
    private void adicionarEstatisticas() {
        System.out.println("📈 Estatísticas:");
        System.out.println("- Faturamento total: R$ 15.000,00");
        System.out.println("- Pedidos no mês: 150");
        System.out.println("- Ticket médio: R$ 100,00");
    }
}