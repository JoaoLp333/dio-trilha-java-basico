import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("informe o número do cliente: ");
         int cont = scanner.nextInt();
        System.out.println("informe a agencia de cliente: ");
        var agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Informe o seu nome: ");
        var nome = scanner.next();
        System.out.println("Informe seu saldo disponivel: ");
        double saldo = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque",nome,agencia,cont,saldo);


    }
}