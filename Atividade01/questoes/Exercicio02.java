package questoes;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float tulipaChope = 2.8f, pizzaMG = 10.0f, cobertura = 1.5f;
        float qtdChope, qtdPizza, qtdCobertura, valorGarcom, valorConta, 
              valorASerPago;
        int qtdPessoas;
        
        System.out.printf("Informe a quantidade de pessoas: ");
        qtdPessoas = input.nextInt();
        
        System.out.printf("Informe a quantidade de chopes: ");
        qtdChope = input.nextFloat();
        
        System.out.printf("Informe a quantidade de pizzas: ");
        qtdPizza = input.nextFloat();
        
        System.out.printf("Informe a quantidade de coberturas: ");
        qtdCobertura = input.nextFloat();

        valorConta = (qtdChope * tulipaChope) + (qtdPizza * pizzaMG) + 
                (qtdCobertura * cobertura);
        valorGarcom = valorConta * 10 / 100;
        
        valorASerPago = (valorConta + valorGarcom) / qtdPessoas;
        
        System.out.printf("A conta deu %.2f + %.2f como 10 porcento do garçom, dando um total de %.2f. Cada pessoa das %f deve pagar %.2f\n", valorConta, valorGarcom, (valorConta + valorGarcom), qtdPessoas, valorASerPago);
        
        
        
    }
}
