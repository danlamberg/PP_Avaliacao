package Questao2;

import java.util.ArrayList;
import java.util.List;

// Sistema que gerencia pagamentos e notifica observers
public class SistemaPagamentos {
    // Lista de observers que serão notificados sobre pagamentos
    private List<PagamentoObserver> observers = new ArrayList<>();
    
    // Adiciona um observer à lista
    public void addObserver(PagamentoObserver observer) {
        observers.add(observer);
    }
    
    // Processa um pagamento e notifica todos os observers
    public void processarPagamento(MeioPagamento meio, double valor) {
        System.out.println("\n### Iniciando Pagamento ###");
        boolean sucesso = meio.processar(valor);
        
        // Notifica todos os observers cadastrados
        for (PagamentoObserver observer : observers) {
            observer.notificar(meio.getTipo(), valor, sucesso);
        }
        
        System.out.println("### Pagamento Finalizado ###\n");
    }
}
