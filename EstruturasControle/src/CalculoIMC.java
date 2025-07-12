import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nInforme sua altura: ");
        float altura = scanner.nextFloat();

        System.out.println("Informe seu peso: ");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * altura);

        

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Levemente acima do peso");
        } else if (imc < 35) {
            System.out.println("Obesidade Grau 1");
        } else if (imc < 40) {
            System.out.println("Obesidade Grau 2 (Severa)");
        } else {
            System.out.println("Obesidade Grau 3 (Mórbida)");
        }

        
    }
}