import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e receber o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Solicitar e receber o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        // Consumir a quebra de linha
        scanner.nextLine();

        // Solicitar e receber o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e receber o saldo da conta
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final com os dados inseridos pelo usuário
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo);
        
        System.out.println(mensagem);

        scanner.close();
    }
}
