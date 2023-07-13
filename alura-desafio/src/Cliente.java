public class Cliente {
    public String nomeCliente;
    public String tipoConta;
    public double saldo;

    public Cliente(){}

    public Cliente(String nomeCliente, String tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return """
                Nome do cliente:  """ + nomeCliente +
                """
                
                Tipo da conta:  """ + tipoConta +
                """
                
                Saldo atual:  """ + saldo;
    }
}
