package edu.caue.estrutura_de_repeticao;

    public class ExeploForArray {
        public static void main(String[] args) {
            
            // em arrays o indice inicia em ZERO
            String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
            
        for (int x=0; x< alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //HA TAMBEM A POSSIBILIDADE DE USAR O FOR DESSA FORMA EM ARRAYS: (FOR EACH)
        for (String aluno : alunos){
            System.out.println("O nome do Aluno e: " + aluno);
        }
    }
    
}
