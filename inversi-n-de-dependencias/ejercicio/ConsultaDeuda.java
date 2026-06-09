package ejercicio;

public class ConsultaDeuda {

    private Persona persona;

    public ConsultaDeuda(Persona persona) {
        this.persona = persona;
    }

    public void mostrarDeuda() {
        System.out.println("La deuda es: $" + persona.obtenerDeuda());
    }

}
