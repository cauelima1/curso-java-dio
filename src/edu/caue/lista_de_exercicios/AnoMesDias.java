package edu.caue.lista_de_exercicios;

import java.util.Scanner;

public class AnoMesDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe sua idade em anos:");
        int anos = scan.nextInt();

        System.out.println("Informe os meses:");
        int meses = scan.nextInt();

        System.out.println("Informe os dias:");
        int dias = scan.nextInt();

        int idadeEmDias = (anos*365) + (meses*30) + dias;

        System.out.println("Sua idade em dias é de : " + idadeEmDias);
        scan.close();
        
    }
}
