package edu.caue.cases;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {

   

    public static void main(String[] args) {

        ImprimirCandidadoseSelecionados();
   
    }
                      
    static void ImprimirCandidadoseSelecionados () {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        double [] salarioPretendido = new double[10];
           for (int i=0; i <=9; i++) {
                salarioPretendido[i] = valorPretendido();
                if (salarioPretendido[i] <= 2000.0){
                    System.out.println(i+1 + " - " + candidatos[i] + " - Solicitou este valor de salario:  R$" + salarioPretendido[i] + " e foi SELECIONADO PARA VAGA.");
                   
                } else
                System.out.println(i+1 + " - " + candidatos[i] + " - Solicitou este valor de salario:  R$" + salarioPretendido[i]);      
            }
            System.out.println("--------------------------------");
            int i=0;
            int x=0;
            while(x < 5 && i<=9){
                    if (salarioPretendido[i] <= 2000.0){
                        System.out.println(candidatos[i] + " foi selecionado para a vaga.");
                        x++;
                    }
                i++;
            }
           
    }    


    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}