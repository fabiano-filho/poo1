package banco;
/*
    Observações do trabalho AV2 de POO;
    4 - Ao criar dois objetos de uma mesma classe, os dois objetos sempre
    serão diferentes mesmo possuindo os mesmos atributos
    
    c2 = c1 => apontam para o mesmo objeto
    

*/
// import java.util.Scanner;
/**
 *
 * @author Fabiano-Filho
 */
public class TesteConta {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Data data = new Data();
        c1.dataCriacaoConta = data;
       
        c1.dataCriacaoConta.dia = 16;
        c1.dataCriacaoConta.mes = 01;
        c1.dataCriacaoConta.ano = 2003;

        c1.titular = "Fabiano Filho";
        c1.numConta = 1223;
        c1.agenciaConta = "0009";
        c1.saldo = 1000d;
                
        c1.recuperaDadosParaImpressao();
        
        c1.sacar(500);
        c1.recuperaDadosParaImpressao();
        
        c1.depositar(900);
        c1.recuperaDadosParaImpressao();
        c1.calcularRendimento();
    }
      
}

//        Scanner input = new Scanner(System.in);
//        Conta c1 = new Conta();
//        
//        System.out.printf("Informe seu nome: ");
//        c1.titular = input.nextLine();
//        System.out.printf("Informe sua agência: ");
//        c1.agenciaConta = input.nextLine();
//        System.out.printf("Informe o número de sua conta: ");
//        c1.numConta = input.nextInt();
//        
//        c1.dataCriacao();
// 