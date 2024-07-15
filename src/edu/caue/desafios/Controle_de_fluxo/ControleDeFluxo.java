package edu.caue.desafios.Controle_de_fluxo;

import java.util.Scanner;

public class ControleDeFluxo{
    public static void main(String[] args) {
         
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = terminal.nextInt();

        try{
            contar(n1, n2);
        } catch (ParametrosInvalidosException e){
            
            System.err.println("O segundo número deve ser maior que o primeiro!");
            System.out.println("Deseja iniciar novamente ? (s / n)");
            String continua = terminal.next();
            if (continua.equals("s"))
                main(args);
        
        }   
        terminal.close();  
    }

    static void contar (int n1, int n2) throws ParametrosInvalidosException{
        if (n1>n2)
        throw new ParametrosInvalidosException();
        int contagem = n2 -n1;

        for (int x=1; x <= contagem; x++){
            System.out.println("Imprimindo o número " + x);
        }
    }
}

