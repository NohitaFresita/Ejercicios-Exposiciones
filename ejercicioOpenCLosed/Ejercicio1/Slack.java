package Ejercicio1;

public class Slack implements CanalNotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("💬 Posteando en Slack: " + mensaje);
    }
}