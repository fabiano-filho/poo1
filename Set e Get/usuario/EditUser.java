/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.Scanner;

/**
 *
 * @author UEPA-LAB6-PC09
 */
public class EditUser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        User usuario = new User();
        
        System.out.println("O usuario atual é " + usuario.getUser());
        
        System.out.printf("Digite o nome do usuario: ");
        String nome = input.nextLine();
        usuario.setUser(nome);

        usuario.display();
        
    }
}
