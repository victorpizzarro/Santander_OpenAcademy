import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        
        var scanner = new Scanner(System.in);

        System.out.println("\n\nPor favor, digite o numero da Agência: ");
        var agencia = scanner.next();

        System.out.println("\nInforme o número: ");
        var numero = scanner.nextInt();

        scanner.nextLine(); 

        System.out.println("\nInforme o seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("\nInforme o seu saldo: ");
        var saldo = scanner.nextFloat();


        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque.\n\n", nome, agencia, numero, saldo);
    }
}
