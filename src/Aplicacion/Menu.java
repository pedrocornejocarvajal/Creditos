package Aplicacion;

import java.util.Scanner;

public class Menu {

    public static final String MENSAJE_BIENVENIDO = "Bienvenido! \n \n ";

    public static final String ERROR_404 = "No se encontró el comando entre las opciones posibles.\n" +
            "Inténtelo de nuevo";
    public static final String MENU_PRINCIPAL = """
            Elige entre una de las opciones \s
            1 -> Ver lista de clientes con saldos a cero \s
            2 -> Ver lista de clientes con saldos con crédito \s
            3 -> Ver lista de clientes con saldos con débito\s
            4 -> Enviar cartas de agradecimiento a los clientes Súper vips\s
            5 -> Enviar cartas de aviso a los clientes Robinson.\s
            0 -> Salir""";
    public static final String MENSAJE_ERROR_NUM = "El dato introducido no es un número";
    public static final String ESTAS_SEGURO = """
            ¿Estás seguro de tu elección?\s
            1 -> Sí\s
            2 -> No""";
    private static final String NOMBRE_RUTA = "C:\\Users\\pcornejo\\IdeaProjects\\Creditos\\src\\Ficheros\\";
    public static final String  RUTA_CLIENTES_SALDO_CERO = "FicheroSaldoCero.txt";
    public static final String  RUTA_CLIENTES_CON_CREDITO = "FicheroConCredito.txt";
    public static final String  RUTA_CLIENTES_CON_DEBITO = "FicheroConDebito.txt";
    public static final String  FICHERO_ENTRADA = "Fichero_Entrada.txt";

    public void menuPrincipal(Scanner sc) {

        boolean salir = false;
        String eleccion;
        System.out.println(MENSAJE_BIENVENIDO);
        do {
            eleccion = pedirString(sc, MENU_PRINCIPAL);
            switch (eleccion) {
                case "1" -> saldoACero();
                case "2" -> saldosConCredito();
                case "3" -> saldosConDebito();
                case "4" -> generarCartVips();
                case "5" -> generarCartaRobinson();
                case "0" -> salir = true;
                default -> System.out.println(ERROR_404);
            }
        } while (!salir);
    }


    public void saldoACero () {

    }

    public void saldosConCredito() {

    }

    public void saldosConDebito() {

    }

    public void generarCartVips() {

    }

    public void generarCartaRobinson() {

    }

    public static String pedirString(Scanner sc, String petision) {
        System.out.println(petision);
        return sc.nextLine();
    }

    public static String pedirEntero(Scanner sc, int petision) {
        System.out.println(petision);
        return sc.nextLine();
    }

    public static String pedirDouble(Scanner sc, double petision) {
        System.out.println(petision);
        return sc.nextLine();
    }
}
