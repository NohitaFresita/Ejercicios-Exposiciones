/*
 * Una motocicleta es también un vehículo terrestre.
 * * Al igual que el carro, declara con total honestidad lo que sabe hacer,
 * evitando tener que implementar el método navegar() que le exigiría una "interfaz gorda".
 */
public class Moto implements Terrestre {

    @Override
    public void conducir() {
        System.out.println("[Moto] Filtrando entre el tráfico urbano con agilidad...");
    }
}