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
public class EstruturaTryCatch {
    public static void main(String[] args){
        int valor = 120;
        
// Tente isso, se não funcionar execute isso
        
        try{ 
        /*
          Caso ocorra uma exceção, o java automaticamente desvia para o catch 
        */
            while(valor > Integer.parseInt(args[0])){
                System.out.println(valor);
                valor--;
            }
        }
        catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("Você não forneceu um argumento");
        }
        catch(NumberFormatException erro){
            System.out.println("Você não forneceu um número inteiro");
        }
        //  Codigo que converte string em inteiro
        String string = "2";
        int convert = Integer.parseInt(string);
        System.out.println(convert + 2);
        
    }
}
