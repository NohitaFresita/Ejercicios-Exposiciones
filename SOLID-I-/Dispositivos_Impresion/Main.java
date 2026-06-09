/*
 * USO DE LA VERSIÓN CORRECTA CON ISP
 * * Cada función o proceso del programa pide EXACTAMENTE la capacidad que necesita.
 * El compilador impide los usos incorrectos en tiempo de compilación, eliminando
 * sorpresas desagradables o errores en tiempo de ejecución.
 */
public class Main {

    public static void main(String[] args) {

        ImpresoraBasica impresoraComun = new ImpresoraBasica();
        ImpresoraMultifuncional multifuncional= new ImpresoraMultifuncional();

        // --- 1. Cualquier dispositivo que sepa imprimir sirve aquí ---
        imprimirReporteMensual(impresoraComun);
        imprimirReporteMensual(multifuncional);

        System.out.println();

        // --- 2. Solo dispositivos que tengan escáner ---
        digitalizarCedula(multifuncional);

        System.out.println();

        // --- 3. Solo dispositivos con capacidad de fax ---
        enviarDocumentoUrgente(multifuncional);

        // =======================================================================
        // Lo siguiente NO COMPILA (¡y eso es excelente para la seguridad del código!):
        // 
        // digitalizarCedula(impresoraComun);
        // enviarDocumentoUrgente(impresoraComun);
        //
        // Como 'ImpresoraBasica' no implementa ni Escaneable ni Faxeable,
        // el sistema de tipos de Java evita que cometamos el error de pedirle
        // algo que no sabe hacer. ISP respetado con éxito.
        // =======================================================================
    }

    // Función que solo requiere la acción de IMPRIMIR
    static void imprimirReporteMensual(Imprimible dispositivo) {
        dispositivo.imprimir();
    }

    // Función que solo requiere la acción de ESCANEAR
    static void digitalizarCedula(Escaneable dispositivo) {
        dispositivo.escanear();
    }

    // Función que solo requiere la acción de ENVIAR FAX
    static void enviarDocumentoUrgente(Faxeable dispositivo) {
        dispositivo.enviarFax();
    }
}