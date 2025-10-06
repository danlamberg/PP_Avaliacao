// Subclasse para transporte terrestre 
public class TransporteTerrestre extends Transporte {
    boolean cargaPerigosa;

    public TransporteTerrestre() {
    }

    @Override
    public boolean Salvar() {
        System.out.println("Salvando na tabela de transportes terrestres");
        // Validação específica para transporte terrestre
        if (cargaPerigosa && distanciaKm > 500) {
            System.out.println("Carga perigosa não pode ser transportada mais de 500km por terra");
            return false;
        }
        return super.Salvar();
    }

    @Override
    public double calcularTarifa() {
        double tarifaBase = distanciaKm * 1.8;
        double adicionalPerigosa = cargaPerigosa ? 200.0 : 0.0;
        return tarifaBase + adicionalPerigosa;
    }
}