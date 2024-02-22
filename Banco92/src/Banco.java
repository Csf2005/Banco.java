import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Caique Ferreira";
        String tipoConta = "Conta corrente";
        double saldo = 1559.99;
        int opcao = 0;

        System.out.println("--------------------------");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo atual " + saldo);
        System.out.println("\n--------------------------");

        String menu = """
                -- Selecione uma opção --
                1- Ver saldo
                2- Realizar transferencia via pix
                3- Receber transferencia
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atualizado: " +saldo);
            }else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir:");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não foi possivel realizar a transferencia por falta de saldo.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " +saldo);
                }
            }else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " +saldo);
            } else if (opcao != 4){
                System.out.println("Opção invalida");
            }
        }
    }
}
