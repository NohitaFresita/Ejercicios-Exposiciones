package notificaciones_pedidos.mal;

// ❌ Alto nivel acoplado a un detalle concreto (email)
public class Pedido {
    private String id;
    private String clienteEmail;
    private NotificadorEmail notificador; // ❌ tipo concreto

    public Pedido(String id, String clienteEmail) {
        this.id = id;
        this.clienteEmail = clienteEmail;
        this.notificador = new NotificadorEmail("smtp.empresa.com"); // ❌ creación interna
    }

    public void confirmar() {
        System.out.println("Pedido " + id + " confirmado.");
        notificador.enviar(clienteEmail, "Tu pedido " + id + " fue confirmado.");
    }

    public void cancelar() {
        System.out.println("Pedido " + id + " cancelado.");
        notificador.enviar(clienteEmail, "Tu pedido " + id + " fue cancelado.");
    }
}