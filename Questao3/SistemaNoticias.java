package Questao3;

import java.util.HashMap;
import java.util.Map;

public class SistemaNoticias {
    // Instância única do Singleton
    private static SistemaNoticias instancia;
    private Map<String, Subject> topicos = new HashMap<>();
    
    // Construtor privado
    private SistemaNoticias() {
        // Inicializar tópicos
        topicos.put("política", new Subject());
        topicos.put("esportes", new Subject());
        topicos.put("tecnologia", new Subject());
    }
    
    // Método para obter a instância única
    public static SistemaNoticias getInstancia() {
        if (instancia == null) {
            instancia = new SistemaNoticias();
        }
        return instancia;
    }
    
    // Inscrever leitor em um tópico
    public void inscrever(String topico, Observer leitor) {
        if (topicos.containsKey(topico)) {
            topicos.get(topico).adicionarObserver(leitor);
            System.out.println(leitor + " inscrito em " + topico);
        }
    }
    
    // Publicar notícia em um tópico
    public void publicarNoticia(String topico, String noticia) {
        if (topicos.containsKey(topico)) {
            System.out.println("\n📢 Publicando notícia em " + topico + ": " + noticia);
            topicos.get(topico).notificarObservers(noticia, topico);
        }
    }
    
    // Listar tópicos disponíveis
    public void listarTopicos() {
        System.out.println("Tópicos disponíveis: " + String.join(", ", topicos.keySet()));
    }
}