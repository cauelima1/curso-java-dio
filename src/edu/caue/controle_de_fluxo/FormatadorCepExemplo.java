package edu.caue.controle_de_fluxo;

public class FormatadorCepExemplo {

 
    public static void main(String[] args) {
        try{        
            String cepFormatado =  formatarCep("11212312");
            System.out.println(cepFormatado);
           
        } catch(CepInvalidoException e){
            e.printStackTrace();
            System.out.println("O Cep não corresponde as regras de negócio.");
        }
        
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
         throw new CepInvalidoException();

        // simulando um cep formatado
        return "12.123-12";
    }
}
