package src.BancoDigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(TitularDaConta titularDaConta) {
        super(titularDaConta);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Saldo Conta Corrente ===");
        System.out.println("Cliente: " + super.titularDaConta.getNome());
        System.out.println("    CPF: " + super.titularDaConta.getCpf());
        System.out.println("------------------------------");
        System.out.println("Agência: " + super.agencia);
        System.out.println("  Conta: " + super.conta);
        System.out.println(String.format("  Saldo: %.2f", super.saldo));
    }
}
