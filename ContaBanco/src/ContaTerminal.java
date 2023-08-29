import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("-- Por favor, digite o nome do cliente: --");
        String nomeCliente = sc.nextLine();

        System.out.println("-- Por favor, digite o número da agência: --");
        String numeroAgencia = sc.nextLine();

        System.out.println("-- Por favor, digite o número da conta: --");
        int numeroConta = sc.nextInt();

        System.out.println("-- Por favor, digite o seu saldo: --");
        double saldo = sc.nextDouble();

        String mensagem = "Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
        ", conta " + numeroConta + 
        " e seu saldo " + saldo + 
        " já está disponível para saque";

        System.out.println(mensagem);

        sc.close();
    }
}
