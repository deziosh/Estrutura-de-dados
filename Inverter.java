import java.util.Scanner;

public class Inverter {

    public static void main(String[] args) {
        int numero = 0;
        int controlador = 0;
        Scanner imprime = new Scanner(System.in);

        System.out.print("DIGITE UM NUMERO INTEIRO E POSITIVO: ");
        numero = imprime.nextInt();

        System.out.print("RESULTADO: ");
        System.out.print(inverte(numero, controlador));

    }

    public static int inverte(int numero, int controlador) {
        if (numero == 0) {
            return controlador;
        }
        controlador = controlador * 10 + numero % 10;

        return inverte(numero / 10, controlador);
    }
}