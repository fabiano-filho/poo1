/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasdecontrole;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC10
 */
public class ControladorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInforme um valor de 1 a 4: ");
        int opcao = input.nextInt();
        
        switch(opcao){
               case 1:
                   System.out.println("Opção 1");
                   break;
               case 2:
                   System.out.println("Opção 2");
                   break;
               case 3:
                   System.out.println("Opção 3");
                   break;
               case 4:
                   System.out.println("Opção 4");
                   break;
               default:
                   System.out.println("Opção incorreta");
           }
    }
}
