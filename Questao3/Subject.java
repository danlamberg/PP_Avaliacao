package Questao3;

import java.util.ArrayList;
import java.util.List;

// Classe que representa o Subject no padrão Observer
// Mantém uma lista de observers e notifica-os sobre atualizações
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    // Adiciona um observer à lista
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }
    
    // Remove um observer da lista
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }
    
    // Notifica todos os observers sobre uma nova notícia
    public void notificarObservers(String noticia, String topico) {
        for (Observer observer : observers) {
            observer.atualizar(noticia, topico);
        }
    }
}
