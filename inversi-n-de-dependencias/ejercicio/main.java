package ejercicio;

public class main {

    public static void main(String[] args) {

        Persona persona = new carlos();

        ConsultaDeuda consulta = new ConsultaDeuda(persona);

        consulta.mostrarDeuda();

    }

}