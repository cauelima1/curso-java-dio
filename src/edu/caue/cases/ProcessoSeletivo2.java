package edu.caue.cases;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    public static void main(String[] args) {
        
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        double [] salarioPretendido = new double[10];
      
        
        System.out.println("Temos " + candidatos.length + " candidatos:");
       
        
        for (int i=0; i <=9; i++) {
            System.out.println(i+1 + " - " + candidatos[i]);
            salarioPretendido[i] = valorPretendido();
            System.out.println(String.format("Salario pretendido: %.2f", salarioPretendido[i]));  
        }

        int contador=0;
        for (int i=0; i <=9; i++){ //verificacao para nao ultrapassar 5 pessoas.
            if (salarioPretendido[i] <= 2000 && contador <5){
                System.out.println("Vaga Garantida para - " + candidatos[i]);
                contador +=1;
            } 
        }
    }
    
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
}
}