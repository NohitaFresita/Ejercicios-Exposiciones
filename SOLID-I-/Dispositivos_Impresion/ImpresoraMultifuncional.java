/*
 * La impresora multifuncional ofrece TODAS las capacidades.
 * * Por lo tanto, implementa LAS TRES interfaces específicas.
 * Declara con exactitud lo que sabe hacer y cumple con su contrato sin inventar nada.
 */
public class ImpresoraMultifuncional implements Imprimible, Escaneable, Faxeable {

    @Override
    public void imprimir() {
        System.out.println("[Multifuncional] Imprimiendo en alta calidad a color...");
    }

    @Override
    public void escanear() {
        System.out.println("[Multifuncional] Escaneando documento y convirtiendo a PDF...");
    }

    @Override
    public void enviarFax() {
        System.out.println("[Multifuncional] Enviando fax a través de la línea telefónica...");
    }
}