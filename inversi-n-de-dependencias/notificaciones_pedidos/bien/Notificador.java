package notificaciones_pedidos.bien;

// Abstracción en el nivel ALTO — sin mencionar email, SMS ni nada técnico
public interface Notificador {
    void enviar(String destinatario, String mensaje);
}