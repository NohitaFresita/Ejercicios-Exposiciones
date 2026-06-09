package Ejercicio1;

public class WhatsApp implements CanalNotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("📱 Enviando WhatsApp: " + mensaje);
    }
}