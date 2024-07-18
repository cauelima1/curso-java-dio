package edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades;

import java.util.Scanner;

import edu.caue.desafios.Controle_de_fluxo.iphone.Menu;

public class Ipod {

    public void menuIpod () {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("1- Tocar musica %n2- Pausar Musica %n3- Selecionar Musica %n4- Voltar ao menu inicial %n ---- %n");
        String escolha = scanner.nextLine();   
                        
                switch (escolha) {
                    case "1":
                        tocar();
                        menuIpod();
                       
                    case "2":
                        pausar();  
                        menuIpod();
                    case "3":
                        selecionarMusica(); 
                        menuIpod();         
                    case "4":
                        System.out.printf("Retornando ao menu principal... %n ------------------%n");
                        Menu.menuIphone();
                        break;
                    default:
                        break;
                }    
                scanner.close();
    }
        
    private void tocar (){
        System.out.printf("TOCANDO MUSICA!! %n ---------- %n");
    }

    private void pausar (){
        System.out.printf("MUSICA PAUSADA. %n ---------- %n");
    }
    
    private void selecionarMusica(){
        System.out.printf("SELECINANDO MUSICA... %n MUSICA SELECIONADA %n ---------- %n");
    }



}