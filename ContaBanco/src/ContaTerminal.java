import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) 
 {
        // Uso do Scanner para leitura dos dados
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Leitura do nome do usuário
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        //Leitura do número da agência
        System.out.println("Por favor, digite o número de sua agência:");

        int agencia = scanner.nextInt();
        // Consumir a linha em branco
        scanner.nextLine();

        //Leitura do número da conta
        System.out.println("Por favor, digite o código de sua conta:");
        String numero = scanner.nextLine();

        //Leitura do saldo
        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " +
        "conta número " + numero + " e seu saldo  " + saldo + " já está disponível para saque.");

        //Fechando o scanner
        scanner.close();
    }
}
