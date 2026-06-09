/*
 * María es chef. SOLO cocina.
 *
 * No toma pedidos ni maneja caja.
 * Su contrato con el sistema es claro
 * y honesto: solo promete lo que sabe hacer.
 */
public class Maria implements Cocinero {

    @Override
    public void prepararPlato(String plato) {
        System.out.println("[María] Preparando '" + plato + "'");
    }

    @Override
    public void notificarListoParaServir(String plato) {
        System.out.println("[María] Plato listo: '" + plato + "'");
    }
}