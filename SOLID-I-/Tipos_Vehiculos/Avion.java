/*
 * Un avión convencional opera en el espacio aéreo.
 * * Implementa únicamente la interfaz 'Aereo'. No necesita preocuparse
 * por lógicas de navegación acuática.
 */
public class Avion implements Aereo {

    @Override
    public void volar() {
        System.out.println("[Avión] Manteniendo velocidad de crucero a 30,000 pies de altura...");
    }
}