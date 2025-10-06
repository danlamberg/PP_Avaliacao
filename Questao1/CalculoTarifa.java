// Classe principal para cálculo de tarifas
public class CalculoTarifa {

    public void processar(Transporte transporte) {
        System.out.println("Processando transporte com " + transporte.distanciaKm + " km");
        if (transporte.Salvar()) {
            double tarifa = transporte.calcularTarifa();
            System.out.printf("Tarifa calculada: R$ %.2f%n", tarifa);
        } else {
            System.out.println("Falha ao salvar transporte");
        }
    }

    // Sobrecarga para processamento específico
    public void processarAereo(TransporteAereo aereo) {
        System.out.println("Processamento específico para transporte aéreo");
        processar(aereo); // Reutiliza o método base
    }

    // Sobrecarga para transporte terrestre
    public void processarTerrestre(TransporteTerrestre terrestre) {
        System.out.println("Processamento específico para transporte terrestre");
        processar(terrestre);
    }
}