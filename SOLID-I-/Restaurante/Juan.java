/*
 * Juan es mesero. SOLO mesero.
 *
 * No se le pide que cocine ni que cobre.
 * Si alguien intenta usarlo como Cocinero
 * o como Cajero, el COMPILADOR lo impide.
 */
public class Juan implements Mesero {

    @Override
    public void tomarPedido(String mesa) {
        System.out.println("[Juan] Tomando pedido en mesa " + mesa);
    }

    @Override
    public void llevarPlato(String mesa, String plato) {
        System.out.println("[Juan] Llevando '" + plato + "' a mesa " + mesa);
    }
}