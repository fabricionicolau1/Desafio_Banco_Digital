package BancoDigital;

public class main {
    public static void main(String[] args) {

        Cliente Fabricio = new Cliente();
        Fabricio.setNome("Fabricio");

        Conta cc = new ContaCorrente(Fabricio);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
