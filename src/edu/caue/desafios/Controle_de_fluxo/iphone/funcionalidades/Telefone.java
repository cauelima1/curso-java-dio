package edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades;

import java.util.Scanner;

import edu.caue.desafios.Controle_de_fluxo.iphone.Menu;

public class Telefone {
    Scanner scanner = new Scanner(System.in);
    
    public void menuTelefone(){
        System.out.printf("1- Efetuar Ligacao %n2- Atender %n3- Correio de Voz %n4- Voltar ao menu inicial %n ---- %n");
        String escolha = scanner.nextLine();  
        switch (escolha) {
            case "1":
                System.out.println("Informe o numero de contato para ligacao:");
                String numero = scanner.nextLine();
                ligar(numero);
                menuTelefone();
            case "2":
                atender();
                menuTelefone();
            case "3":
                correioDeVoz();
                menuTelefone();
            case "4":
                System.out.printf("Retornando ao menu principal... %n ------------------%n");
                Menu.menuIphone();
            default:
                break;
        }   
        
    }

    private void ligar (String numero){
        System.out.println("Ligando para numero... " + numero);
    }

    private void atender(){
        System.out.println("Atendendo a ligacao...");
    }

    private void correioDeVoz(){
        System.out.println("Deixando correio de voz...");
    }
   
}