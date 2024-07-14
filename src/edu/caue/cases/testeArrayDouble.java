package edu.caue.cases;
import java.util.concurrent.ThreadLocalRandom;
public class testeArrayDouble {
    
    public static void main(String[] args) {
        double [] salarios = new double[10];
        
        System.out.println(salarios.length);
            for (int i=0; i <=9 ; i++){
                salarios[i] = valorPretendido();
                System.out.println(salarios[i]); 
            }
    }
    //teste 
   
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
}
