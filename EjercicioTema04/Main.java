public class Main {
    public static void main(String[] args) {
        /*Usando un if*/
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo.");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo.");
        } else {
            System.out.println(numeroIf + " es cero.");
        }
        /*Crea un bucle While*/
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        /*Para el bucle Do While*/
        int numeroDoWhile = 3;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while(numeroDoWhile > 4);
        /*Para el bucle For*/
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        /*para el Switch*/
        String estacion = "estacion";

        switch (estacion) {
            case "primavera":
                System.out.println("Es " + estacion);
                break;
            case "verano":
                System.out.println("Es " + estacion);
                break;
            case "otoño":
                System.out.println("Es " + estacion);
                break;
            case "invierno":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println("estación NO válida!!");
        }
    }
}