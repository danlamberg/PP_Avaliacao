package Questao4;

// Decorator abstrato que implementa a interface Relatorio
// Serve como base para decorators concretos que adicionam funcionalidades
public abstract class RelatorioDecorator implements Relatorio {

    // Relatório que será "decorado"
    protected Relatorio relatorio;
    
    // Construtor recebe o relatório base ou outro decorator
    public RelatorioDecorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }
    
    @Override
    public void gerar() {
        // Delegação: chama o método gerar do relatório base ou do decorator anterior
        relatorio.gerar();
    }
}
