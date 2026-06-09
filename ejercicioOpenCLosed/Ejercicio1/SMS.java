package Ejercicio1;

public class SMS implements CanalNotificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("📨 Enviando SMS: " + mensaje);
    }
}