public class Plano {
    private String nome;
    private Cliente cliente;
    private Treino treino;

    public Plano(String nome, Cliente cliente) {
        this.nome = nome;
        this.cliente = cliente;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cliente: " + cliente);
        System.out.println("Treino: " + treino);
        System.out.println();
    }
}