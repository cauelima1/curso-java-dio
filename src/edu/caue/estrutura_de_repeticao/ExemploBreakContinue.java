package edu.caue.estrutura_de_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int n = 1; n<=5; n++){
            if (n == 3)
            break;
            
            System.out.println(n);
        }

        System.out.println("Testando agora com o continue.");

        for (int n=1; n<=5; n++){
            if (n==3)
            continue;
        
            System.out.println(n);
        }

    }
}
