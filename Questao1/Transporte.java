// Classe base
public class Transporte {
    double distanciaKm;

    public boolean Salvar() {
        // Lógica base de validação
        if (this.distanciaKm <= 0) {
            return false;
        }
        return true;
    }

    public double calcularTarifa() {
        // Método base que será sobrescrito pelas subclasses
        return 0.0;
    }
}