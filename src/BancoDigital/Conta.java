package src.BancoDigital;

public abstract class  Conta implements IConta{

    private static final int AGENCIA_PADRAO = 00013;
    private static int SEQUENCIAL_CONTA = 1300;

    public Conta() {
        this.agencia = String.valueOf(Conta.AGENCIA_PADRAO);
        this.conta = String.valueOf(SEQUENCIAL_CONTA++);
    }

    protected String agencia;
    protected String conta;
    protected double saldo;

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
