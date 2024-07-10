package edu.caue.controle_de_fluxo;

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota>=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperacao" : "Reprovado" ; //um outro metodo de condicao simples (condicao ternaria)

        System.out.println(resultado);

    }
    
}