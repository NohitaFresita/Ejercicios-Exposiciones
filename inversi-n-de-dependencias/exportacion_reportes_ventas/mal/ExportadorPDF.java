package exportacion_reportes_ventas.mal;

public class ExportadorPDF {
    public void exportar(String contenido, String rutaArchivo) {
        System.out.println("[PDF] Generando archivo en: " + rutaArchivo);
        System.out.println("[PDF] Contenido: " + contenido);
    }
}