public class JefeDeSoporte implements TrabajadorPresencial, GestorEquipo, SoporteCliente {

    @Override
    public void trabajarEnOficina() {
        System.out.println("Trabajando en oficina");
    }

    @Override
    public void gestionarEquipo() {
        System.out.println("Gestionando equipo");
    }

    @Override
    public void atenderClientes() {
        System.out.println("Atendiendo clientes");
    }
}