package edu.caue.cases;




import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  saldo = scanner.nextDouble();
                  System.out.printf("Saldo atual: %.1f %n", saldo);
                   break;
                case 2:
                  double saque = scanner.nextDouble();
                  if (saldo >= saque){
                    saldo = saldo - saque;
                    System.out.printf("Saldo atual: %.1f %n", saldo);
                  }else{
                    System.out.printf("Saldo Insuficiente. %n");
                  }
                    
                    break;
                case 3:
                  System.out.printf("Saldo atual: %.1f %n", saldo);
                    
                    break;
                case 0:
                    System.out.printf("Programa encerrado. %n");
                    continuar = false;  //Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.printf("Opção inválida. Tente novamente. %n");
            }
        }
        scanner.close();
    }
}