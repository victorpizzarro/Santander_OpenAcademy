import java.util.Scanner;

public class AreaRetangulo {
   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o lado do retângulo:  ");
       float lado = scanner.nextFloat();
       System.out.println("Informe o altura do retângulo:  ");
       float altura = scanner.nextFloat();
       float area = lado * altura;


       System.out.printf("Area do reatangulo é: %.1fcm", area);


   }
}
