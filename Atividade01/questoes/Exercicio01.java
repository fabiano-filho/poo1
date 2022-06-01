package questoes;
// Libs
import java.util.Scanner;

public class Exercicio01 {
// Function main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float velmedia, distancia, tempo;
        String nome;
        String volta = "S";
        
        while(volta == "S"){
            try{
                System.out.printf("Informe o nome do piloto: ");
                nome = input.nextLine(); // Lendo nome do piloto

                System.out.printf("Informe a distancia percorrida em Km: ");
                distancia = input.nextFloat(); // Lendo a distancia percorrida pelo piloto

                System.out.printf("Informe o tempo(em Horas) em que essa distancia foi percorrida: ");
                tempo = input.nextFloat(); // Lendo o tempo em que a distancia foi percorrida

                velmedia = distancia / tempo;

                System.out.printf("A velocidade média do %s foi %.2f km/h.\n", nome, velmedia);
            }
            catch(java.util.InputMismatchException erro){
                System.out.println("Utilize ',' e não '.' para informar a distancia e o tempo");
                
                System.out.println("Deseja tentar novamente?[S/N]");
                volta = input.nextLine();
            }
        }
    }
    
}
