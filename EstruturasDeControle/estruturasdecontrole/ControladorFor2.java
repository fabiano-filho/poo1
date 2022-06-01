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
public class ControladorFor2 {
    public static void main(String[] args){
        int total = 0;
        for(int i = 2; i < 10; i += 2){
            total += i;
            System.out.println("A soma da variável por 2 é: " + total);
        }
    }
}
    