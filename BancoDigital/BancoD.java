package BancoDigital;

public class BancoD {

    public String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContas(List<Conta> contas) {
    this.contas = contas;
    }
}
