package notificaciones_pedidos.bien;

// ✅ Alto nivel depende solo de la abstracción Notificador
public class Pedido {
    private String id;
    private String contactoCliente;
    private Notificador notificador; // ✅ tipo interfaz

    // ✅ Dependencia inyectada desde afuera
    public Pedido(String id, String contactoCliente, Notificador notificador) {
        this.id = id;
        this.contactoCliente = contactoCliente;
        this.notificador = notificador;
    }

    public void confirmar() {
        System.out.println("Pedido " + id + " confirmado.");
        notificador.enviar(contactoCliente, "Tu pedido " + id + " fue confirmado.");
    }

    public void cancelar() {
        System.out.println("Pedido " + id + " cancelado.");
        notificador.enviar(contactoCliente, "Tu pedido " + id + " fue cancelado.");
    }
}