package aula01;
import java.util.Scanner;

public class primeiro_cod {

    public static void main(String[] args) {
//      Declarando variáveis
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado, opcao;
        
        System.out.print("Entre com o primeiro número: ");
        num1 = input.nextInt();
        System.out.print("Entre com o segundo número: ");
        num2 = input.nextInt();
        
        resultado = num1 + num2;
        
        System.out.printf("A soma de %d + %d = %d", num1, num2, resultado);
        
        if(num1 > num2){
            System.out.printf("\nO número %d é maior que %d.\n", num1, num2);
        }
        else if(num1 < num2) {
            System.out.printf("\nO número %d é maior que %d.\n", num2, num1);
        }
        else{
            System.out.printf("\nOs números %d e %d são iguais.\n", num1, num2);
        }
        
        System.out.print("\nInforme um valor de 1 a 4: ");
        opcao = input.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            case 3:
                System.out.println("Opção 3");
                break;
            case 4:
                System.out.println("Opção 4");
                break;
            default:
                System.out.println("Opção incorreta");
        }
        
    }   
    
}
