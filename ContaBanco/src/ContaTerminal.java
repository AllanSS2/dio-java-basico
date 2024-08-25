import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência!");
        int numero = entrada.nextInt();

        entrada.nextLine();
        System.out.println("Por favor, digite a Agência!");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = entrada.nextLine();
        

        System.out.println("Por favor, digite o saldo!");
        double saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
