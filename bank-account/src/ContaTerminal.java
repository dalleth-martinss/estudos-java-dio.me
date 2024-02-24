import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            int usuario = 1021;
            String agencia = "067-8";
            String nomeCliente = "Dálleth Martins";
            double saldo = 237.48;
                 
            System.out.println("\n******* Sejam Bem vindos ao Murph Bank  ******* \n");

            System.out.println("Por favor, digite o número da sua agência: ");
            String agencia1 = scanner.nextLine();

            System.out.println(" Por favor, agora digite o número da sua conta: ");
            int usuario1 = scanner.nextInt();

            scanner.nextLine(); // aprendi que precisa colocar esse linha de codigo a mais, pq após o int ele não consome a proxima linha!

            System.out.println(" Por favor, digite o nome do titular completo: ");
            String nomeCliente1 = scanner.nextLine();

            System.out.println("Olá, " + nomeCliente1 + " ! Obrigado por criar um conta em nosso banco. Sua agência é : " + agencia1 + ", na conta: " + usuario1 + "  e seu saldo é de R$ " + saldo + " reais e já está disponivel para saque.");
      
    }
}
