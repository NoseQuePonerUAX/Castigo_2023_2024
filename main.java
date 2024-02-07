public class main {
    public static void main(String[] args) {
        calcularsegundosenano();
        mostrarEnteros();
    }
    public static void calcularsegundosenano() {

        int diasenano = 365;
        int horasendia = 24;
        int minutosenhora = 60;
        int segundosenminuto = 60;
        int segundosenano = calcularSegundosenperiodo(1, 0, 0, diasenano, horasendia, minutosenhora, segundosenminuto);

        System.out.println("Numero de dias en un ano: " + diasenano);
        System.out.println("Numero de horas en un dia: " + horasendia);
        System.out.println("Numero de minutos en una hora: " + minutosenhora);
        System.out.println("Numero de segundos en un minuto: " + segundosenminuto);
        System.out.println("El numero de segundos en un año es: " + segundosenano + " segundos.");
    }

    public static int calcularSegundosenperiodo(int anos, int meses, int dias, int diasenano, int horasendia, int minutosenhora, int segundosenminuto) {
        int totalDias = anos * diasenano + meses * 30 + dias;
        int totalHoras = totalDias * horasendia;
        int totalMinutos = totalHoras * minutosenhora;
        return totalMinutos * segundosenminuto;
    }

    public static void mostrarEnteros() {

        char mayorChar = Character.MAX_VALUE;
        System.out.println("El mayor numero entero representable por un char es: " + (int)mayorChar);
        short mayorShort = Short.MAX_VALUE;
        System.out.println("El mayor numero entero representable por un short es: " + mayorShort);
        int mayorInt = Integer.MAX_VALUE;
        System.out.println("El mayor numero entero representable por un int es: " + mayorInt);
    }
}
