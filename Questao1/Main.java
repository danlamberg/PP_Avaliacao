// Classe principal para executar o sistema
public class Main {
    public static void main(String[] args) {
        CalculoTarifa processador = new CalculoTarifa();

        System.out.println("### Teste transporte Aéreo ###");
        TransporteAereo aereo = new TransporteAereo();
        aereo.distanciaKm = 500.0;
        aereo.pesoCarga = 150.0;
        processador.processar(aereo);

        System.out.println("\n### Teste transporte Terrestre ###");
        TransporteTerrestre terrestre = new TransporteTerrestre();
        terrestre.distanciaKm = 300.0;
        terrestre.cargaPerigosa = true;
        processador.processar(terrestre);

        System.out.println("\n### Teste transporte Marítimo ###");
        TransporteMaritimo maritimo = new TransporteMaritimo();
        maritimo.distanciaKm = 800.0;
        maritimo.volumeCarga = 12.5;
        processador.processar(maritimo);

        System.out.println("\n### Teste com falha (distância zero) ###");
        TransporteAereo aereoInvalido = new TransporteAereo();
        aereoInvalido.distanciaKm = 0;
        aereoInvalido.pesoCarga = 150.0;
        processador.processar(aereoInvalido);

        System.out.println("\n### Demonstração de polimorfismo ###");
        Transporte[] transportes = new Transporte[4];

        // Transporte Aéreo
        TransporteAereo aereo1 = new TransporteAereo();
        aereo1.distanciaKm = 400.0;
        aereo1.pesoCarga = 100.0;
        transportes[0] = aereo1;

        // Transporte Terrestre
        TransporteTerrestre terrestre1 = new TransporteTerrestre();
        terrestre1.distanciaKm = 250.0;
        terrestre1.cargaPerigosa = false;
        transportes[1] = terrestre1;

        // Transporte Marítimo
        TransporteMaritimo maritimo1 = new TransporteMaritimo();
        maritimo1.distanciaKm = 600.0;
        maritimo1.volumeCarga = 8.0;
        transportes[2] = maritimo1;

        // Transporte Terrestre que falhará na validação
        TransporteTerrestre terrestre2 = new TransporteTerrestre();
        terrestre2.distanciaKm = 600.0;
        terrestre2.cargaPerigosa = true;
        transportes[3] = terrestre2;

        for (Transporte transporte : transportes) {
            processador.processar(transporte);
            System.out.println("---");
        }
    }
}