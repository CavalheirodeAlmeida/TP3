package conta;

public class ContaCorrente extends Conta {

    public Double getdLimite() {
        return dLimite;
    }

    public void setdLimite(Double dLimite) {
        this.dLimite = dLimite;
    }
    
    Double dLimite;
    public ContaCorrente(String sNomeCliente, String sSenha, String sNomeGerente, int iNumeroConta, int iAgencia, Double dSaldo, Double dLimite) {
        super(sNomeCliente, sSenha, sNomeGerente, iNumeroConta, iAgencia, dSaldo);
        this.dLimite = dLimite;
    }

}
