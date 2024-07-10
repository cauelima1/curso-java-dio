package edu.caue.controle_de_fluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("O saldo e de R$"+saldo);
        }else 
        System.out.println("Saldo Insuficiente " + saldo);
    }

}
