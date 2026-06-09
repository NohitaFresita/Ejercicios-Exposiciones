package Ejercicio1;

public class Email implements CanalNotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("📧 Enviando Email: " + mensaje);
    }
}