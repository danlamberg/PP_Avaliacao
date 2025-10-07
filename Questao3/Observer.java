package Questao3;

// Interface que define um Observer no padrão Observer
public interface Observer {
    //Método chamado pelo Subject quando há uma atualização.
    void atualizar(String noticia, String topico);
}