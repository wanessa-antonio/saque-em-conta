import java.util.Scanner;
public class SaqueConta {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira o valor do saldo atual
            System.out.print("Digite o valor do saldo atual: ");
            int saldoTotal = scanner.nextInt();

            System.out.println();

            // Solicita ao usuário que insira o valor do saque
            System.out.print("Digite o valor do saque: ");
            int valorSaque = scanner.nextInt();

            System.out.println();

            // Verificar se o saldo é suficiente para o saque
            if (saldoTotal >= valorSaque) {
                saldoTotal -= valorSaque;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
            } else {
                System.out.println("Saldo insuficiente. Saque não realizado!");
            }
        }
    }
}
