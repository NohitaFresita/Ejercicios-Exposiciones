public class AveVoladora extends Ave {

    public AveVoladora(String nombre) {
        super(nombre);
    }

    public void volar() {
        System.out.println(nombre + " está volando alto.");
    }
}