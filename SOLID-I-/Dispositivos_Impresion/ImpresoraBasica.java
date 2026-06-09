/*
 * Una impresora básica (como la de $30 mil COP de la imagen) SOLO imprime.
 * * Al aplicar ISP, implementa ÚNICAMENTE la interfaz Imprimible.
 * Ya no hereda métodos como escanear() o enviarFax(), por lo tanto,
 * NUNCA hay métodos vacíos ni excepciones falsas como 'UnsupportedOperationException'.
 */
public class ImpresoraBasica implements Imprimible {

    @Override
    public void imprimir() {
        System.out.println("[Impresora Básica] Imprimiendo documento en blanco y negro...");
    }
}