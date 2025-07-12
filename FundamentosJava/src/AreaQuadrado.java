import java.util.Scanner;


public class AreaQuadrado {
   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o lado do quadrado:  ");
       float lado = scanner.nextFloat();
       float area = lado * lado;


       System.out.printf("Area do quadrado é: %.1fcm", area);


   }
}
