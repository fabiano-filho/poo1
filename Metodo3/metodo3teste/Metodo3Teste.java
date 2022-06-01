package metodo3teste;

import java.util.Scanner;
import metodo3.Metodo3;


public class Metodo3Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodo3 mt3 = new Metodo3();
        
        System.out.printf("Informe seu nome: ");
        String nome = input.nextLine();

        mt3.display(nome);
    }
    
}

/*
   Classe pode ser visivel de duas formas: public e default.
   Metodos e atributos podem ser: public, default, private e protect.
   
   Uma classe possui dois membros chamdos de atributos e metodos.
*/