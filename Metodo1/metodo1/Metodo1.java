/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo1;

/**
 *
 * @author UEPA-LAB6-PC09
 */
public class Metodo1 {
    
    void metodoUm(){
        System.out.println("Metodo sem argumentos");
    }
    int metodoDois(){
        int valor1 = 10, valor2 = 13;
        int total = valor1 * valor2;
        return total;
    }
    double metodo3(int arg1, int arg2){
        double total;
        total = (double)arg1 / (double)arg2;
        return total;
    }
    
    public static void main(String[] args) {
        Metodo1 mt1 = new Metodo1();
        
        mt1.metodoUm();
        System.out.println(mt1.metodoDois());
        double total = mt1.metodo3(10, 5);
        System.out.println("" + total);
    }
    
}
