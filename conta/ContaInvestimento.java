/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

public class ContaInvestimento extends Conta{
    
    Double dRendimento;
    
    public ContaInvestimento(String sNomeCliente, String sSenha, String sNomeGerente, int iNumeroConta, int iAgencia, Double dSaldo, Double dRendimento) {
        super(sNomeCliente, sSenha, sNomeGerente, iNumeroConta, iAgencia, dSaldo);
        this.dRendimento = dRendimento;
    }
    
}
