/*
 * Un hidroavión es un vehículo híbrido: es capaz de Volar y de Navegar.
 * * ISP permite la composición flexible. Esta clase implementa de forma legítima
 * las interfaces 'Aereo' y 'Acuatico', cumpliendo al 100% con ambos contratos.
 */
public class Hidroavion implements Aereo, Acuatico {

    @Override
    public void volar() {
        System.out.println("[Hidroavión] Despegando desde el agua hacia el cielo...");
    }

    @Override
    public void navegar() {
        System.out.println("[Hidroavión] Acuatizando suavemente y navegando hacia el muelle...");
    }
}