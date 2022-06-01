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
public class Vetor1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] vetor;
        vetor = new int[5];
        // vetor.length determina o comprimento do vetor
        System.out.println("Index, value");
        
        for(int contador = 0; contador < vetor.length; contador++){
            System.out.printf("%d %8d \n", contador, vetor[contador]);
        }
    }
    
}
