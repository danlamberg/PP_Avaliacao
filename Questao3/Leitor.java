package Questao3;

public class Leitor implements Observer {
    private String nome;
    
    public Leitor(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(String noticia, String topico) {
        System.out.println("📨 " + nome + " recebeu notícia de " + topico + ": " + noticia);
    }
    
    @Override
    public String toString() {
        return nome;
    }
}