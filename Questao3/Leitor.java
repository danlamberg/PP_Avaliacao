package Questao3;

// Classe que representa um leitor (Observer) que recebe notícias
public class Leitor implements Observer {
    private String nome;
    
    // Construtor que define o nome do leitor
    public Leitor(String nome) {
        this.nome = nome;
    }
    
    // Método chamado pelo sujeito (Subject) quando há uma atualização
    @Override
    public void atualizar(String noticia, String topico) {
        System.out.println(nome + " recebeu notícia de " + topico + ": " + noticia);
    }
    
    // Representação em string do leitor
    @Override
    public String toString() {
        return nome;
    }
}
