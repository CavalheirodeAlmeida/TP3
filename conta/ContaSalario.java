/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;


public class ContaSalario extends Conta {

    public Double getdLimite() {
        return dLimite;
    }

    public void setdLimite(Double dLimite) {
        this.dLimite = dLimite;
    }
    
    Double dLimite;
    
    public ContaSalario(String sNomeCliente, String sSenha, String sNomeGerente, int iNumeroConta, int iAgencia, Double dSaldo, Double dLimite) {
        super(sNomeCliente, sSenha, sNomeGerente, iNumeroConta, iAgencia, dSaldo);
        this.dLimite = dLimite;
    }
    
}
