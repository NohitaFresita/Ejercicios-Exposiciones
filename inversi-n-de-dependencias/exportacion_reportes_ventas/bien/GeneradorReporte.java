package exportacion_reportes_ventas.bien;

// ✅ No sabe ni le importa el formato de exportación
public class GeneradorReporte {
    private Exportador exportador; // ✅ tipo interfaz

    public GeneradorReporte(Exportador exportador) { // ✅ inyección
        this.exportador = exportador;
    }

    public void generarReporteVentas(String periodo) {
        String contenido = "Ventas del periodo: " + periodo + " | Total: $15.000";
        System.out.println("Reporte generado.");
        exportador.exportar(contenido, "reporte_" + periodo);
    }
}