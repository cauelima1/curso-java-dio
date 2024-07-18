package edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades;

import java.util.Scanner;

import edu.caue.desafios.Controle_de_fluxo.iphone.Menu;

public class Navegador {
    Scanner scanner = new Scanner(System.in);
    
    public void menuNavegador(){
        System.out.printf("1- Exibir Pagina %n2- Adicionar nova aba %n3- Atualizar Pagina %n4- Voltar ao menu inicial %n ---- %n");
        String escolha = scanner.nextLine();  
        switch (escolha) {
            case "1":
                System.out.println("Informe a URL da pagina:");
                String url = scanner.nextLine();
                exibir(url);
                menuNavegador();
            case "2":
                adicionarAba();
                menuNavegador();
            case "3":
                atualizarNavegador();
                menuNavegador();
            case "4":
                System.out.printf("Retornando ao menu principal... %n ------------------%n");
                Menu.menuIphone();
            default:
                break;
        }   
        
    }

    private void exibir (String url){
        System.out.println("Conectando a..." + url);
    }

    private void adicionarAba(){
        System.out.println("Adicionando nova aba no navegador.");
    }

    private void atualizarNavegador(){
        System.out.println("Atualizando navegador.... Ok!");
    }
    
}
