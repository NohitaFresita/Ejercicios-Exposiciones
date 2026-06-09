package exportacion_reportes_ventas.bien;

public class ExportadorCSV implements Exportador {
    @Override
    public void exportar(String contenido, String nombreBase) {
        System.out.println("[CSV] Generando: " + nombreBase + ".csv");
        System.out.println("[CSV] Serializando: " + contenido);
    }
}