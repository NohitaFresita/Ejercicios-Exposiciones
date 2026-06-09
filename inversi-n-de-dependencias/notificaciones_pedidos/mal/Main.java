package notificaciones_pedidos.mal;

public class main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("P-001", "cliente@correo.com");
        pedido.confirmar();
        // ¿Quieres notificar por SMS? Hay que modificar Pedido.
        // ¿Quieres testear sin servidor SMTP? Imposible.
    }
}