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
public class Exercicio05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float kgrefeicao = 12, pesoPrato, valorRefeicao;
        
        System.out.printf("Informe o peso(Kg) da refeição: ");
        pesoPrato = input.nextFloat();
        
        valorRefeicao = pesoPrato * kgrefeicao;
        
        System.out.printf("O valor a pagar é %.2f reais\n", valorRefeicao);
 
    }
}
