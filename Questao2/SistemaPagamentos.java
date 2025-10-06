package Questao2;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamentos {
    private List<PagamentoObserver> observers = new ArrayList<>();
    
    public void addObserver(PagamentoObserver observer) {
        observers.add(observer);
    }
    
    public void processarPagamento(MeioPagamento meio, double valor) {
        System.out.println("\n--- Iniciando Pagamento ---");
        boolean sucesso = meio.processar(valor);
        
        // Notificar todos os observers
        for (PagamentoObserver observer : observers) {
            observer.notificar(meio.getTipo(), valor, sucesso);
        }
        
        System.out.println("--- Pagamento Finalizado ---\n");
    }
}