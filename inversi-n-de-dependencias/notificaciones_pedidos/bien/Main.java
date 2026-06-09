package notificaciones_pedidos.bien;

public class main {
    public static void main(String[] args) {

        // Producción con email
        Notificador email = new NotificadorEmail("smtp.empresa.com");
        Pedido p1 = new Pedido("P-001", "cliente@correo.com", email);
        p1.confirmar();

        System.out.println();

        // Producción con SMS — sin tocar Pedido
        Notificador sms = new NotificadorSMS("api.sms-provider.com");
        Pedido p2 = new Pedido("P-002", "+57300000000", sms);
        p2.cancelar();

        System.out.println();

        // Test sin infraestructura real
        NotificadorEnMemoria memoria = new NotificadorEnMemoria();
        Pedido p3 = new Pedido("P-003", "test-user", memoria);
        p3.confirmar();
        System.out.println("Mensajes capturados: " + memoria.getMensajesEnviados());
    }
}