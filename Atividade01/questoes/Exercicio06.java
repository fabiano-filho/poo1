/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC10
 */
public class Exercicio06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lata = 350, garrafa600ml = 600, garrafa2l = 2000;
        float qtdLatas, qtdGarrafas600ml, qtdGarrafa2l, converteLitro;
        
        System.out.printf("Quantas latas foram compradas? ");
        qtdLatas = input.nextFloat();
        
        System.out.printf("Quantas garrafas de 600ml foram compradas? ");
        qtdGarrafas600ml = input.nextFloat();
        
        System.out.printf("Quantas garrafas de 2 Litros foram compradas? ");
        qtdGarrafa2l = input.nextFloat();
        
        converteLitro =  
            ((qtdLatas * lata) + (qtdGarrafas600ml * garrafa600ml) 
            + (qtdGarrafa2l * garrafa2l)) / 1000;
        
        System.out.printf("Ao todo foram ingeridos %.2f Litros de refrigerantes.\n", converteLitro);
    }
}
