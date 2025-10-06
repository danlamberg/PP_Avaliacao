package Questao4;

public class PDFDecorator extends RelatorioDecorator {
    public PDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }
    
    @Override
    public void gerar() {
        super.gerar();
        exportarPDF();
    }
    
    private void exportarPDF() {
        System.out.println("📄 Exportação:");
        System.out.println("- Gerando arquivo PDF...");
        System.out.println("- PDF salvo em: relatorio_vendas.pdf");
    }
}