/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Fabiano-Filho
 */
public class Conta {
    int numConta;
    String titular;
    String agenciaConta;
    Double saldo;
    Data dataCriacaoConta;
    
    public void sacar(int valor){
        saldo = saldo - valor;
        System.out.println("Você sacou R$" + valor + ",00 reais");    
    }
    public void depositar(int valor){
        saldo = saldo + valor;
        System.out.println("Você depositou R$" + valor + ",00 reais");
    }
    
    public void calcularRendimento(){
        Double rendimento = saldo * 0.1;
        System.out.printf("\nSua conta teve o rendimento de R$%.2f reais\n", rendimento);
       
    }
//    Pegar data atual em Java
//    public void dataCriacao(){
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar calendar = Calendar.getInstance(); 
//        dataCriacaoConta = formato.format(calendar.getTime());
//    }
    public void recuperaDadosParaImpressao(){
        System.out.printf("\nNome do titular .................. %s", titular);
        System.out.printf("\nNúmero da conta .................. %s", numConta);
        System.out.printf("\nAgência bancária ................. %s", agenciaConta);
        System.out.print("\nData de criação  ................. " + dataCriacaoConta.formatada());
        System.out.printf("\nSaldo ................. .......... %.2f", saldo);
        System.out.println();

    }
    
}
class Data {
    int dia;
    int mes;
    int ano;
    
    public String formatada(){
        String dataFormatada;
        String diaf = Integer.toString(dia); 
        String mesf = Integer.toString(mes); 
        String anof = Integer.toString(ano);
        if(dia < 10){
            diaf = "0" + dia;   
        }
        if(mes < 10){
            mesf = "0" + mes;    
        }
        if(ano < 10){
           anof = "0" + ano;
        }
        dataFormatada = diaf + "/" + mesf + "/" + anof;
        
        return dataFormatada;
    }
}