import java.util.Scanner;


public class ChecandoIdade {
   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       System.out.println("Ola, informe seu nome: ");
       String name = scanner.nextLine();
       System.out.println("Informe o seu ano de nascimento: ");
       int age = scanner.nextInt();
       int idade = 2025 - age;


       System.out.printf("Olá %s, voce tem %d anos \n", name, idade);


   }
}
