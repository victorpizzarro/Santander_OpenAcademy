import java.util.Scanner;

public class ControleDeDivisores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\nNúmero inicial: ");
        int num = scanner.nextInt();

        int entrada;

        while (true) {
            System.out.print("\nDigite um número: ");
            entrada = scanner.nextInt();

            if (entrada < num) {
                System.out.println("Número menor que o inicial, ignorado.");
                continue;
            }

            if (entrada % num != 0) {
                System.out.println("Número não divisível informado. Encerrando programa.");
                break;
            }

            System.out.println(entrada + " é divisível por " + num);
        }

    }
}