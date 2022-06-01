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
public class ControleBreakeContinue {
    public static void main(String[] args){
        int contador;
        for(contador = 1; contador < 10; contador++){ 
            if(contador == 5){
                //break;
                continue;
            /*
                O break para o loop e sai dele, o continue pula o loop naquela
                instrução e continua novamente
            */
            }
            System.out.println(contador);
        }
        System.out.println("Saída do loop " + contador);
    }
}
