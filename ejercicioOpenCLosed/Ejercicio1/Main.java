package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Notificador notificador = new Notificador();

        notificador.enviarAlerta(
                "¡El servidor de base de datos se cayó!",
                new Email());

        notificador.enviarAlerta(
                "¡El servidor de base de datos se cayó!",
                new Slack());

        notificador.enviarAlerta(
                "¡El servidor de base de datos se cayó!",
                new WhatsApp());

        notificador.enviarAlerta(
                "¡El servidor de base de datos se cayó!",
                new SMS());
    }
}