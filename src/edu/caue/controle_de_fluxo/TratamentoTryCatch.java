package edu.caue.controle_de_fluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoTryCatch {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu Nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua Idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        catch(InputMismatchException e){ //usado para verificar erros referentes ao parametro inserido pelo usuario.
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
