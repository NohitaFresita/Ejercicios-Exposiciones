public class Programador implements TrabajadorPresencial, TrabajadorRemoto, Desarrollador {

    @Override
    public void trabajarEnOficina() {
        System.out.println("Trabajando en oficina");
    }

    @Override
    public void trabajarRemoto() {
        System.out.println("Trabajando remotamente");
    }

    @Override
    public void escribirCodigo() {
        System.out.println("Escribiendo código");
    }
}