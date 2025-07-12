import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("\n\nEntre com um numero: ");
        var num = scanner.nextInt();

        int i;


        System.out.println("\nTabuada do número " + num + ":");
        for (i=1; i <= 10; i++){

            System.out.printf("\n%d * %d = %d \n", num, i, num * i);

        }



    }
}
