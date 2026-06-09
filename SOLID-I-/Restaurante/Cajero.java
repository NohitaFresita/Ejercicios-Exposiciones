/*
 * Capacidad: manejar el cobro.
 *
 * Solo la implementan quienes tienen acceso
 * a la caja registradora.
 */
public interface Cajero {

    double cobrarMesa(String mesa);

    void emitirFactura(String mesa);
}