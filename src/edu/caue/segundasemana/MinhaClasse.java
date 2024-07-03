package edu.caue.segundasemana;
public class MinhaClasse {
    public static void main (String [] args){
     
        String primeiroNome = "Caue";
        String segundoNome = "Sequeira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }
//criacao do metodo com retorno de uma String definida + concatenacao de 2 variaveis com valores definos no main
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método =" + primeiroNome.concat(" ").concat(segundoNome);
    }

}
