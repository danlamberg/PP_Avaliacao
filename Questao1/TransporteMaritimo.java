// Subclasse para transporte marítimo
public class TransporteMaritimo extends Transporte {
    double volumeCarga;

    // Construtor vazio - sem parâmetros
    public TransporteMaritimo() {
        // Construtor vazio
    }

    @Override
    public boolean Salvar() {
        if (super.Salvar()) { // Chama o método Salvar da classe pai
            System.out.println("Salvando na tabela de transportes marítimos");
            // Validações específicas do transporte marítimo
            if (volumeCarga > 50) {
                System.out.println("Volume muito grande para transporte marítimo padrão");
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public double calcularTarifa() {
        double tarifaBase = distanciaKm * 1.2;
        double adicionalVolume = volumeCarga * 80.0;
        return tarifaBase + adicionalVolume;
    }
}