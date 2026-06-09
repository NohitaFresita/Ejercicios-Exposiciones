public class Main {

    public static void main(String[] args) {

        Programador programador = new Programador();
        programador.trabajarEnOficina();
        programador.trabajarRemoto();
        programador.escribirCodigo();

        System.out.println();

        JefeDeSoporte jefe = new JefeDeSoporte();
        jefe.trabajarEnOficina();
        jefe.gestionarEquipo();
        jefe.atenderClientes();
    }
}