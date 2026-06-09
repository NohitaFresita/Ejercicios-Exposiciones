package exportacion_reportes_ventas.bien;

public class main {
    public static void main(String[] args) {

        // El área contable pide PDF
        GeneradorReporte r1 = new GeneradorReporte(new ExportadorPDF());
        r1.generarReporteVentas("2026-05");

        System.out.println();

        // El área de datos pide Excel — misma lógica, distinto exportador
        GeneradorReporte r2 = new GeneradorReporte(new ExportadorExcel());
        r2.generarReporteVentas("2026-05");

        System.out.println();

        // Pipeline automatizado pide CSV
        GeneradorReporte r3 = new GeneradorReporte(new ExportadorCSV());
        r3.generarReporteVentas("2026-05");
    }
}