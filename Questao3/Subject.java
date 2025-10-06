package Questao3;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notificarObservers(String noticia, String topico) {
        for (Observer observer : observers) {
            observer.atualizar(noticia, topico);
        }
    }
}