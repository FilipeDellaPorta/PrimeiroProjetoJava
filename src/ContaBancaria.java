import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        double saldoDoCliente = 1250000;
        double valorASerRecebido = 0;
        double valorASerTransferido = 0;
        Scanner leitura = new Scanner(System.in);
        int opcaoEscolhida;

        String dadosIniciaisDoCliente = """
                ***********************
                Nome: Filipe Della Porta
                Tipo Conta: Corrente
                Saldo: R$ %.2f
                ***********************
                """.formatted(saldoDoCliente);
        System.out.println(dadosIniciaisDoCliente);


        String opcoesIniciaisDoCliente = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println(opcoesIniciaisDoCliente);
        opcaoEscolhida = leitura.nextInt();
        

        if (opcaoEscolhida == 1) {
            System.out.println("R$ " + String.format("%.2f", saldoDoCliente));
        } else if (opcaoEscolhida == 2) {
            System.out.println("Digite o valor a ser recebido: ");
            while (!leitura.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico: ");
                leitura.next();
            }
            valorASerRecebido = leitura.nextDouble();
            if (valorASerRecebido > 0) {
                saldoDoCliente += valorASerRecebido;
                System.out.println("Valor recebido com sucesso, seu saldo atual é: R$ " + String.format("%.2f", saldoDoCliente));
            } else {
                System.out.println("Valor inválido! O valor a ser recebido precisa ser um número positivo!");
            }
        } else if (opcaoEscolhida == 3) {
            System.out.println("Digite o valor a ser transferido: ");
            while (!leitura.hasNextDouble()) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico: ");
                leitura.next();
            }
            valorASerTransferido = leitura.nextDouble();
            if (valorASerTransferido > saldoDoCliente) {
                System.out.println("Sem saldo atual para fazer esta transferência. Seu saldo é de: R$ " + String.format("%.2f", saldoDoCliente));
            } else {
                saldoDoCliente -= valorASerTransferido;
                System.out.println("Valor transferido com sucesso, seu saldo atual é: R$ " + String.format("%.2f", saldoDoCliente));
            }
        } else if (opcaoEscolhida == 4) {
            System.out.println("Obrigado por utilizar nossos serviços. Até logo!");
        } else {
            System.out.println("Opção inválida! Por favor, selecione uma opção válida.");
        }
    }
}