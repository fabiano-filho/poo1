/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

public class ComissaoFuncionario extends Object {
    private String primeironome;
    private String ultimonome;
    private String numerosocial;
    private double vendasbrutas;
    private double porcentagemcomissao;
    
    public ComissaoFuncionario(
            String primeironome, 
            String ultimonome, 
            String numerosocial,
            double vendasbrutas,
            double porcentagemcomissao
    ){
        this.primeironome = primeironome;
        this.ultimonome = ultimonome;
        this.numerosocial = numerosocial;
        
        setVendasbrutas(vendasbrutas);
        setPorcentagemcomissao(porcentagemcomissao);     
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public String getUltimonome() {
        return ultimonome;
    }

    public String getNumerosocial() {
        return numerosocial;
    }

    public double getVendasbrutas() {
        return vendasbrutas;
    }

    public void setVendasbrutas(double vendasbrutas) {
        this.vendasbrutas = vendasbrutas < 0.0 ? 0.0 : vendasbrutas;
    }

    public double getPorcentagemcomissao() {
        return porcentagemcomissao;
    }

    public void setPorcentagemcomissao(double porcentagemcomissao) {
        this.porcentagemcomissao = (porcentagemcomissao > 0.0 && porcentagemcomissao < 1.0) ? porcentagemcomissao: 0.0;
    }
    
    @Override
    public String toString(){
        return String.format(
                "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Funcionário", primeironome, ultimonome,
                "Número social", numerosocial,
                "Vendas brutas", vendasbrutas,
                "Porcentagem comissão", porcentagemcomissao
            );
    }
}
