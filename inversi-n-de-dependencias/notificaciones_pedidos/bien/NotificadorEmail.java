package notificaciones_pedidos.bien;

public class NotificadorEmail implements Notificador {
    private String servidorSmtp;

    public NotificadorEmail(String servidorSmtp) {
        this.servidorSmtp = servidorSmtp;
        System.out.println("[Email] Conectando a SMTP: " + servidorSmtp);
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Email] Enviando a " + destinatario + ": " + mensaje);
    }
}