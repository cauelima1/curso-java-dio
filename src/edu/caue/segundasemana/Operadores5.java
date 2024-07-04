package edu.caue.segundasemana;

public class Operadores5 {
    public static void main(String[] args) {
        int a, b;

    a = 6;
    b = 5;

    //exemplo de um operador de condicao como se fosse um IF mais simples
    String resultado = a == b ? "Verdadeiro" : "Falso";
    System.out.println(resultado);


    boolean simNao = a == b;
    System.out.println("NumeroUm é igual ao número 2? " + simNao);

    
    simNao = a != b;
    System.out.println("NumeroUm é diferente ao número 2? " + simNao);




    }
        
}
