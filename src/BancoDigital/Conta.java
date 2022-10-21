package src.BancoDigital;

public abstract class  Conta implements IConta{

    private static final String AGENCIA_PADRAO = "00013";
    private static int SEQUENCIAL_CONTA = 1300;

    protected TitularDaConta titularDaConta;

    public Conta(TitularDaConta titularDaConta) {
        this.titularDaConta = titularDaConta;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = String.valueOf(SEQUENCIAL_CONTA++);
    }

    protected String agencia;
    protected String conta;
    protected double saldo;

    @Override
    public boolean sacar(double valor) {
        boolean realizouSaque;
        if (this.saldo >= valor){
            this.saldo -= valor;
            realizouSaque = true;
        } else {
            System.out.println("Saldo insuficiente");
            realizouSaque = false;
        }
        return realizouSaque;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        boolean saqueFoiRealizado = false;
        saqueFoiRealizado = this.sacar(valor);
        if (saqueFoiRealizado){
            contaDestino.depositar(valor);
        }
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
