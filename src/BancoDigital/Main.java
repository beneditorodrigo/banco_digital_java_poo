package src.BancoDigital;

public class Main {

    public static void main(String[] args) {

        TitularDaConta titularDaConta01 = new TitularDaConta("HyperTech", "11.333.555\\0001-88");
        TitularDaConta titularDaConta02 = new TitularDaConta("DIO Innovation", "22.555.888\\0001-00");

        Conta cc = new ContaCorrente(titularDaConta01);
        Conta poupanca = new ContaPoupanca(titularDaConta02);

        cc.depositar(100);
        cc.transferir(30, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
