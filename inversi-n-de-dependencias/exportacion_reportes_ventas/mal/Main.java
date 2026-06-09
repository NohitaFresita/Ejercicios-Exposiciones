package exportacion_reportes_ventas.mal;

public class main {
    public static void main(String[] args) {
        
        GeneradorReporte reporte = new GeneradorReporte();
        reporte.generarReporteVentas("2026-05");
        // ¿El cliente quiere Excel? Hay que modificar GeneradorReporte.
    }
}