
package herança;

public class ComissaoFuncionarioTeste {
    public static void main(String[] args){
        ComissaoFuncionario funcionario = new ComissaoFuncionario
        ("Fabiano", "Filho", "000.000.000.00", 1000, 0.06);
        
        
        System.out.println("O nome é: " + funcionario.getPrimeironome());
        System.out.println("Sobrenome é: "   + funcionario.getUltimonome());
        System.out.println("Número de segurança social é: " + funcionario.getNumerosocial());
        System.out.println("Valor bruto da semana é: " + funcionario.getVendasbrutas());
        System.out.println("Porcentagem de comissão é: " + funcionario.getPorcentagemcomissao());
        
        System.out.println();
        
        funcionario.setVendasbrutas(500);
        funcionario.setPorcentagemcomissao(0.1);
        
        System.out.println(funcionario.toString());
        
    }
}
