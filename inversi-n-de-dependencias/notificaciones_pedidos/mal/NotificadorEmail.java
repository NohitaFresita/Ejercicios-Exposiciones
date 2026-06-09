package notificaciones_pedidos.mal;

public class NotificadorEmail {
    private String servidorSmtp;

    public NotificadorEmail(String servidorSmtp) {
        this.servidorSmtp = servidorSmtp;
        System.out.println("[Email] Conectando a SMTP: " + servidorSmtp);
    }

    public void enviar(String destinatario, String mensaje) {
        System.out.println("[Email] Enviando a " + destinatario + ": " + mensaje);
    }
}