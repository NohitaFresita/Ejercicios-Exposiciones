/*
 * Un automóvil es estrictamente un vehículo terrestre.
 * * Gracias a ISP, solo implementa 'Terestre'. Ya no arrastra métodos 
 * innecesarios como volar() ni se ve forzado a lanzar excepciones absurdas.
 */
public class Carro implements Terrestre {

    @Override
    public void conducir() {
        System.out.println("[Carro] Avanzando por la autopista a 80 km/h...");
    }
}