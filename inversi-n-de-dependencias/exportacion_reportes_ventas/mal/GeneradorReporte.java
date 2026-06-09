package exportacion_reportes_ventas.mal;

// ❌ El nivel alto depende directamente del formato PDF
public class GeneradorReporte {
    private ExportadorPDF exportador; // ❌ tipo concreto

    public GeneradorReporte() {
        this.exportador = new ExportadorPDF(); // ❌ creación interna
    }

    public void generarReporteVentas(String periodo) {
        String contenido = "Ventas del periodo: " + periodo + " | Total: $15.000";
        System.out.println("Reporte generado.");
        exportador.exportar(contenido, "reporte_" + periodo + ".pdf");
    }
}