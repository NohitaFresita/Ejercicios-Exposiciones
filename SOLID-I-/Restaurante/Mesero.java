/*
 * Capacidad: atender mesas.
 *
 * Solo la implementan quienes toman pedidos
 * y llevan platos a la mesa.
 */
public interface Mesero {

    void tomarPedido(String mesa);

    void llevarPlato(String mesa, String plato);
}