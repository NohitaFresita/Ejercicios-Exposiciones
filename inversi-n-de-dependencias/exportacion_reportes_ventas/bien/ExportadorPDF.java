package exportacion_reportes_ventas.bien;

public class ExportadorPDF implements Exportador {
    @Override
    public void exportar(String contenido, String nombreBase) {
        System.out.println("[PDF] Generando: " + nombreBase + ".pdf");
        System.out.println("[PDF] Contenido: " + contenido);
    }
}