/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasdecontrole;

/**
 *
 * @author UEPA-LAB6-PC10
 */
public class ControladorDoWhile {
    public static void main(String[] args){
        int cont = 0;
        do{
            System.out.println("O valor da variável é: " + cont);
            cont += 1;
        }while(cont < 5);
//  O DoWhile pergunta antes de executar
//  O While e o For executa e depois pergunta
    }
}
