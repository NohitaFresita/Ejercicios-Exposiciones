package notificaciones_pedidos.bien;

public class NotificadorSMS implements Notificador {
    private String proveedorApi;

    public NotificadorSMS(String proveedorApi) {
        this.proveedorApi = proveedorApi;
        System.out.println("[SMS] Conectando a: " + proveedorApi);
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[SMS] Enviando a " + destinatario + ": " + mensaje);
    }
}