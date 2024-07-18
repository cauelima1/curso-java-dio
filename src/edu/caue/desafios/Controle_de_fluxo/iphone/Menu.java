package edu.caue.desafios.Controle_de_fluxo.iphone;

import java.util.Scanner;

import edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades.Ipod;
import edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades.Navegador;
import edu.caue.desafios.Controle_de_fluxo.iphone.funcionalidades.Telefone;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Iniciando Iphone...");
        
        Menu.menuIphone();

       
    }

    public static void menuIphone () { 
        Scanner scanner = new Scanner(System.in); 
        System.out.printf("%nEscolha uma opcao: %n1- IPOD %n2- Telefone %n3- Navegador %n4- Desligar %n ----------------- %n");
        
        Ipod ipod = new Ipod();
        Telefone telefone = new Telefone();
        Navegador navegador = new Navegador();

        String escolha = scanner.nextLine();
        switch (escolha) {
                case "1":
                    ipod.menuIpod();
                case "2":
                    telefone.menuTelefone();
                case "3":
                    navegador.menuNavegador();
                case "4":
                    desligar();
                    
                    
                default:
                    break;
            }
        scanner.close();
        }

        public static void desligar (){
            System.out.println("Desligando aparelho..");
            System.exit(0);
        }


    }

       
            
