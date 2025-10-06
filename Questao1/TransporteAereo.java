// Subclasse para transporte aéreo 
public class TransporteAereo extends Transporte {
    double pesoCarga;

    public TransporteAereo() {
    }

    @Override
    public boolean Salvar() {
        if (super.Salvar()) { // Chama o método Salvar da classe pai
            System.out.println("Salvando na tabela de transportes aéreos");
            // Validações específicas do transporte aéreo
            if (pesoCarga > 1000) {
                System.out.println("Carga muito pesada para transporte aéreo");
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public double calcularTarifa() {
        double tarifaBase = distanciaKm * 2.5;
        double adicionalPeso = pesoCarga * 15.0;
        return tarifaBase + adicionalPeso;
    }
}