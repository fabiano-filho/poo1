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
public class Exercicio03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float desconto10percent, parcelado3x, valor = 0;
        
        System.out.printf("Digite o valor total: ");
        valor = input.nextFloat();
        
        desconto10percent = valor - (valor * 10 / 100);
        parcelado3x = valor / 3;
        
        System.out.printf("\nO valor %.2f parcelado fica: %.2f de 3x sem juros", valor, parcelado3x);
        System.out.printf("\nO valor %.2f com 10 porcento de desconto fica por: %.2f reais\n", valor, desconto10percent);

    }
}
