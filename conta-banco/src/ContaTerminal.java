import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializa o Scanner para entrada de dados.

        System.out.println("Bem-vindo ao banco! Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine(); // Captura o nome do cliente.

        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.nextLine(); // Captura o número da agência bancária.

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt(); // Captura o número da conta bancária.

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble(); // Captura o saldo inicial da conta.

        scanner.close(); // Fecha o Scanner para liberar recursos.

        // Exibe a mensagem de confirmação com os dados fornecidos.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo é R$" + saldo + ".");
    }
}