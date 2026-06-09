package exportacion_reportes_ventas.bien;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String contenido, String nombreBase) {
        System.out.println("[Excel] Generando: " + nombreBase + ".xlsx");
        System.out.println("[Excel] Mapeando columnas para: " + contenido);
    }
}