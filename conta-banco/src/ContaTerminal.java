import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao banco! Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.nextLine();

        String numeroConta;
        boolean formatoCorreto = false;

        // Loop para garantir que o número da conta esteja no formato correto
        do {
            System.out.println("Digite o número da sua conta (XXX-X):");
            numeroConta = scanner.nextLine();

            if (numeroConta.matches("\\d{3}-\\d")) { // Valida se segue o padrão de três números, hífen e um número
                formatoCorreto = true;
            } else {
                System.out.println("Formato inválido! Certifique-se de que a conta tem 3 dígitos seguidos de um '-' e um último dígito.");
            }
        } while (!formatoCorreto);

        double saldo = 1000.00; // Define o saldo inicial automaticamente como R$ 1000

        scanner.close();

        // Exibe a mensagem de confirmação com os dados fornecidos.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
