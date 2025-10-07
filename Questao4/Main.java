package Questao4;

// Classe principal que demonstra o uso do padrão Decorator em relatórios
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RELATÓRIOS ===\n");
        
        // 1. Relatório básico (sem complementos)
        System.out.println("1. RELATÓRIO BÁSICO:");
        Relatorio relatorioBase = new RelatorioBase();
        relatorioBase.gerar();
        
        // 2. Relatório básico com estatísticas adicionadas via decorator
        System.out.println("\n2. RELATÓRIO COM ESTATÍSTICAS:");
        Relatorio relatorioComEstatisticas = new EstatisticasDecorator(new RelatorioBase());
        relatorioComEstatisticas.gerar();
        
        // 3. Relatório completo com estatísticas, gráficos e PDF
        System.out.println("\n3. RELATÓRIO COMPLETO:");
        Relatorio relatorioCompleto = new PDFDecorator(
            new GraficosDecorator(
                new EstatisticasDecorator(
                    new RelatorioBase()
                )
            )
        );
        relatorioCompleto.gerar();
        
        // 4. Relatório personalizado com estatísticas + PDF
        System.out.println("\n4. RELATÓRIO PERSONALIZADO (Estatísticas + PDF):");
        Relatorio relatorioPersonalizado = new PDFDecorator(
            new EstatisticasDecorator(
                new RelatorioBase()
            )
        );
        relatorioPersonalizado.gerar();
        
        // 5. Relatório apenas com gráficos
        System.out.println("\n5. RELATÓRIO APENAS COM GRÁFICOS:");
        Relatorio relatorioGraficos = new GraficosDecorator(new RelatorioBase());
        relatorioGraficos.gerar();
    }
}
