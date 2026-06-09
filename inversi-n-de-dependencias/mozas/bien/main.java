package mozas.bien;

public class main {
 
    public static void main(String[] args) {
        
        regalo regalo = new regalo();
        
        moza laidy = new laidy();
        regalo.regaloContenido(laidy);
        System.out.println("El regalo para esta moza es: " + laidy.regalo());

        moza valentina = new valentina();     
        regalo.regaloContenido(valentina);
        System.out.println("El regalo para esta moza es: " + valentina.regalo());
    }
     
}

