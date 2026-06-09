package Ejercicio1;

public class Notificador {

    public void enviarAlerta(String mensaje, CanalNotificacion canal) {
        canal.enviar(mensaje);
    }
}