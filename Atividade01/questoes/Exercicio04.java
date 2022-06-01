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
public class Exercicio04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float precoBroa = 1.5f, precoPao = 0.25f, guardaValor, qtdBroasVendidas,
        qtdPaesVendidos, valorArrecadado;
        
        System.out.printf("Digite a quantidade de paes vendidos: ");
        qtdPaesVendidos = input.nextFloat();
        
        System.out.printf("Digite a quantidade de broas vendidas: ");
        qtdBroasVendidas = input.nextFloat();
        
        valorArrecadado = (qtdBroasVendidas * precoBroa) + (qtdPaesVendidos * precoPao);
        guardaValor = valorArrecadado * 10 / 100;
        
        System.out.printf("O valor arrecadado com a venda de pães e broas foi de %.2f", valorArrecadado);
        System.out.printf("\nVocê deve guardar %.2f na conta poupança.\n", guardaValor);

        
    }
}
