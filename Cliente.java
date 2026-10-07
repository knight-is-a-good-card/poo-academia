public class Cliente {
    private String nome;
    private String telefone;

    //construtor
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
}