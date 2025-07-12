import java.util.Scanner;


public class DiferençaIdade {
   public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       System.out.println("Informe o seu nome: ");
       String name1 = scanner.nextLine();
       System.out.println("Informe a sua idade: ");
       int age1 = scanner.nextInt();

       scanner.nextLine();

       System.out.println("Informe o nome do seu irmão: ");
       String name2 = scanner.nextLine();
       System.out.println("Informe a idade do seu irmão: ");
       int age2 = scanner.nextInt();


       System.out.printf("Ola %s, a diferença de idade entre e %s é de %d\n", name1, name2, (age1 - age2));


   }
}
