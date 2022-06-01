/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author Fabiano Filho
 */
public class Vetor2 {
    public static void main(String [] args){
        int [] vetor = {32, 27, 64, 18, 95, 14};
        
        System.out.println("Index, value");
        
        for(int contador = 0; contador < vetor.length; contador++){
            System.out.printf("%d %8d \n", contador, vetor[contador]);
        }
    }
}
