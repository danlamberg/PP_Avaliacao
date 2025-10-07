package Questao4;

// Decorator que adiciona funcionalidade de exportação para PDF a um relatório
public class PDFDecorator extends RelatorioDecorator {

    // Recebe um relatório base para "decorar"
    public PDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        // Gera o relatório base
        super.gerar();
        // Exporta o relatório para PDF
        exportarPDF();
    }
    
    // Método que simula a exportação do relatório para PDF
    private void exportarPDF() {
        System.out.println("Exportação:");
        System.out.println("- Gerando arquivo PDF...");
        System.out.println("- PDF salvo em: relatorio_vendas.pdf");
    }
}
