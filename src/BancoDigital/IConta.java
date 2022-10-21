package src.BancoDigital;

public interface IConta {

    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
