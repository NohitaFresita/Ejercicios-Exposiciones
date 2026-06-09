package notificaciones_pedidos.bien;

import java.util.ArrayList;
import java.util.List;

// Útil para tests: sin SMTP, sin API de SMS
public class NotificadorEnMemoria implements Notificador {
    private List<String> mensajesEnviados = new ArrayList<>();

    @Override
    public void enviar(String destinatario, String mensaje) {
        mensajesEnviados.add(destinatario + " → " + mensaje);
        System.out.println("[Memoria] Notificación guardada para: " + destinatario);
    }

    public List<String> getMensajesEnviados() {
        return mensajesEnviados;
    }
}