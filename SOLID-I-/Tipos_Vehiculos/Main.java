/*
 * USO DE LA VERSIÓN CORRECTA CON ISP (Vehículos)
 * * Cada proceso o cliente del sistema solicita formalmente el rol exacto 
 * que requiere para operar. El compilador actúa como filtro de seguridad,
 * impidiendo que enviemos un vehículo a un entorno para el que no está capacitado.
 */
public class Main {

    public static void main(String[] args) {

        Carro miCarro = new Carro();
        Moto miMoto = new Moto();
        Avion avionComercial = new Avion();
        Hidroavion hidro = new Hidroavion();

        // --- 1. Viajes por carretera (Cualquier Terestre sirve) ---
        iniciarRutaEscenica(miCarro);
        iniciarRutaEscenica(miMoto);

        System.out.println();

        // --- 2. Rutas aéreas (Cualquier Aereo sirve) ---
        cruzarOceanoPorAire(avionComercial);
        cruzarOceanoPorAire(hidro);

        System.out.println();

        // --- 3. Operaciones marítimas (Cualquier Acuatico sirve) ---
        patrullarBahia(hidro);

        // =======================================================================
        // COMPROBACIÓN DE SEGURIDAD EN TIEMPO DE COMPILACIÓN:
        // 
        // Lo siguiente daría ERROR DE COMPILACIÓN inmediato (lo cual es correcto):
        //
        // cruzarOceanoPorAire(miCarro);  // ¡Un carro no vuela!
        // patrullarBahia(miMoto);       // ¡Una moto no entra al agua!
        // iniciarRutaEscenica(avionComercial); // No está tipado como Terestre aquí
        //
        // Gracias al desacoplamiento de interfaces, el sistema es robusto,
        // extensible y enteramente honesto sobre el comportamiento de sus objetos.
        // =======================================================================
    }

    // Cliente que solo consume la capacidad TERRESTRE
    static void iniciarRutaEscenica(Terrestre vehiculo) {
        vehiculo.conducir();
    }

    // Cliente que solo consume la capacidad AÉREA
    static void cruzarOceanoPorAire(Aereo vehiculo) {
        vehiculo.volar();
    }

    // Cliente que solo consume la capacidad ACUÁTICA
    static void patrullarBahia(Acuatico vehiculo) {
        vehiculo.navegar();
    }
}