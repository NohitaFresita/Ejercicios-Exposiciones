/*
 * USO CORRECTO — ISP en acción
 *
 * Cada método del programa pide EXACTAMENTE
 * la capacidad que necesita. Nunca pide más.
 *
 * El compilador impide usos incorrectos:
 *   registrarPedido(maria, "3")  → NO COMPILA ✓
 *   procesarCobro(juan, "3")     → NO COMPILA ✓
 */
public class Main {

    public static void main(String[] args) {

        Juan  juan  = new Juan();
        Maria maria = new Maria();
        Pedro pedro = new Pedro();

        // --- 1. Tomar pedido: cualquier Mesero sirve ---
        registrarPedido(juan, "3");

        System.out.println();

        // --- 2. Cocinar: cualquier Cocinero sirve ---
        cocinarPlato(maria, "Bandeja paisa");
        cocinarPlato(pedro, "Sancocho");

        System.out.println();
             // --- 3. Cobrar: cualquier Cajero sirve ---
        procesarCobro(pedro, "3");

        // Esto NO COMPILA (y eso es bueno):
        // registrarPedido(maria, "3");  → María no es Mesero
        // procesarCobro(juan,   "3");   → Juan no es Cajero
        // procesarCobro(maria,  "3");   → María no es Cajero
    }

    // Solo necesita saber tomar pedidos.
    static void registrarPedido(Mesero mesero, String mesa) {
        mesero.tomarPedido(mesa);
    }

    // Solo necesita saber cocinar.
    static void cocinarPlato(Cocinero cocinero, String plato) {
        cocinero.prepararPlato(plato);
        cocinero.notificarListoParaServir(plato);
    }

    // Solo necesita saber cobrar.
    static void procesarCobro(Cajero cajero, String mesa) {
        double total = cajero.cobrarMesa(mesa);
        cajero.emitirFactura(mesa);
        System.out.println("Total cobrado: $" + total);
    }
}