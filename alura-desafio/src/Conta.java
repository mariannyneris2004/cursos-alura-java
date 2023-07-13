public class Conta {

    public double consultarSaldo(double saldo){
        return saldo;
    }

    public double transferirValor(double saldo, double transferencia){
        saldo -= transferencia;
        return saldo;
    }

    public double receberValor(double saldo, double valor){
        saldo += valor;
        return saldo;
    }
}
