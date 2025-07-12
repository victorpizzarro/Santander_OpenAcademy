import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("\n\nPrimeiro numero: ");
        var num1 = scanner.nextInt();

        System.out.print("Segundo numero: ");
        var num2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Escolha (par ou impar):");
        String escolha = scanner.nextLine();

        int i;

        
        if (escolha.equalsIgnoreCase("par")) {
            
            System.out.printf("\n\nNúmeros pares de %d a %d\n", num2, num1);
            for(i = num2; i >= num1; i--){

                if(i % 2 == 0){

                    System.out.printf("%d\n", i);
                }

            }

        } else if (escolha.equalsIgnoreCase("impar")) {

            System.out.printf("\n\nNúmeros impares de %d a %d\n", num2, num1);
            for(i = num2; i >= num1; i--){

                if(i % 2 != 0){

                    System.out.printf("%d\n", i);
                }

            }
        } else {
            System.out.println("Opção inválida!");
        }



    }
}