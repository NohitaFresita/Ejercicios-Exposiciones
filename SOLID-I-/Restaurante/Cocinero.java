/*
 * Capacidad: preparar alimentos.
 *
 * Solo la implementan quienes trabajan en cocina.
 * Nunca se les exige tomar pedidos ni cobrar.
 */
public interface Cocinero {

    void prepararPlato(String plato);

    void notificarListoParaServir(String plato);
}