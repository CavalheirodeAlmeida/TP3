package conta;

public class Conta {

    String sNomeCliente;
    String sSenha;
    String sNomeGerente;
    int iNumeroConta;
    int iAgencia;
    Double dSaldo;

    public String getsNomeCliente() {
        return sNomeCliente;
    }

    public void setsNomeCliente(String sNomeCliente) {
        this.sNomeCliente = sNomeCliente;
    }

    public String getsSenha() {
        return sSenha;
    }

    public void setsSenha(String sSenha) {
        this.sSenha = sSenha;
    }

    public String getsNomeGerente() {
        return sNomeGerente;
    }

    public void setsNomeGerente(String sNomeGerente) {
        this.sNomeGerente = sNomeGerente;
    }

    public int getiNumeroConta() {
        return iNumeroConta;
    }

    public void setiNumeroConta(int iNumeroConta) {
        this.iNumeroConta = iNumeroConta;
    }

    public int getiAgencia() {
        return iAgencia;
    }

    public void setiAgencia(int iAgencia) {
        this.iAgencia = iAgencia;
    }

    public Double getdSaldo() {
        return dSaldo;
    }

    public void setdSaldo(Double dSaldo) {
        this.dSaldo = dSaldo;
    }

    public Conta(String sNomeCliente, String sSenha, String sNomeGerente, int iNumeroConta, int iAgencia, Double dSaldo) {
        this.sNomeCliente = sNomeCliente;
        this.sSenha = sSenha;
        this.sNomeGerente = sNomeGerente;
        this.iNumeroConta = iNumeroConta;
        this.iAgencia = iAgencia;
        this.dSaldo = dSaldo;
    }

}
