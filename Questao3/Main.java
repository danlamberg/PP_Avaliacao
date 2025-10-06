package Questao3;

public class Main {
    public static void main(String[] args) {
        // Obter a instância única do Singleton
        SistemaNoticias sistema = SistemaNoticias.getInstancia();
        
        System.out.println("=== SISTEMA DE NOTÍCIAS ===\n");
        
        // Criar leitores
        Leitor leitor1 = new Leitor("João");
        Leitor leitor2 = new Leitor("Maria");
        Leitor leitor3 = new Leitor("Pedro");
        Leitor leitor4 = new Leitor("Ana");
        
        // Inscrever leitores nos tópicos
        sistema.inscrever("política", leitor1);
        sistema.inscrever("política", leitor2);
        sistema.inscrever("esportes", leitor2);
        sistema.inscrever("esportes", leitor3);
        sistema.inscrever("tecnologia", leitor1);
        sistema.inscrever("tecnologia", leitor4);
        
        System.out.println("\n=== PUBLICANDO NOTÍCIAS ===\n");
        
        // Publicar notícias
        sistema.publicarNoticia("política", "Novo ministro é anunciado!");
        sistema.publicarNoticia("esportes", "Time local vence o campeonato!");
        sistema.publicarNoticia("tecnologia", "Nova versão do Java lançada!");
        sistema.publicarNoticia("esportes", "Jogador quebra recorde histórico!");
        
        // Demonstrar que é o mesmo Singleton
        System.out.println("\n=== VERIFICANDO SINGLETON ===");
        SistemaNoticias sistema2 = SistemaNoticias.getInstancia();
        System.out.println("Mesma instância? " + (sistema == sistema2));
        
        // Listar tópicos
        sistema.listarTopicos();
    }
}