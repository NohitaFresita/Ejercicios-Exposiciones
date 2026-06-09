/*
 * Pedro es chef Y cajero.
 *
 * En un restaurante pequeño una sola persona
 * puede tener varios roles. ISP lo permite:
 * basta con implementar TODAS las interfaces
 * que correspondan a sus capacidades reales.
 *
 * Nada le sobra: declara exactamente lo que sabe hacer.
 */
public class Pedro implements Cocinero, Cajero {

    // --- Cocina ---
    @Override
    public void prepararPlato(String plato) {
        System.out.println("[Pedro] Preparando '" + plato + "'");
    }

    @Override
    public void notificarListoParaServir(String plato) {
        System.out.println("[Pedro] Plato listo: '" + plato + "'");
    }

    // --- Caja ---
     @Override
    public double cobrarMesa(String mesa) {
        System.out.println("[Pedro] Cobrando mesa " + mesa);
        return 45000.0;
    }

    @Override
    public void emitirFactura(String mesa) {
        System.out.println("[Pedro] Factura emitida para mesa " + mesa);
    }
}