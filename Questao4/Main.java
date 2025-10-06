package Questao4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RELATÓRIOS ===\n");
        
        // Relatório básico
        System.out.println("1. RELATÓRIO BÁSICO:");
        Relatorio relatorioBase = new RelatorioBase();
        relatorioBase.gerar();
        
        System.out.println("\n2. RELATÓRIO COM ESTATÍSTICAS:");
        Relatorio relatorioComEstatisticas = new EstatisticasDecorator(new RelatorioBase());
        relatorioComEstatisticas.gerar();
        
        System.out.println("\n3. RELATÓRIO COMPLETO:");
        Relatorio relatorioCompleto = new PDFDecorator(
            new GraficosDecorator(
                new EstatisticasDecorator(
                    new RelatorioBase()
                )
            )
        );
        relatorioCompleto.gerar();
        
        System.out.println("\n4. RELATÓRIO PERSONALIZADO (Estatísticas + PDF):");
        Relatorio relatorioPersonalizado = new PDFDecorator(
            new EstatisticasDecorator(
                new RelatorioBase()
            )
        );
        relatorioPersonalizado.gerar();
        
        System.out.println("\n5. RELATÓRIO APENAS COM GRÁFICOS:");
        Relatorio relatorioGraficos = new GraficosDecorator(new RelatorioBase());
        relatorioGraficos.gerar();
    }
}