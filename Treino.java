public class Treino {
    private String titulo;
    private String foco;

    public String getTitulo(){
        return titulo;
    }

    public String getFoco(){
        return foco;
    }


    public Treino(String titulo, String foco){
        this.titulo = titulo;
        this.foco = foco;
    }

    public void exibirTitulo() {
        System.out.println("treino: " + titulo);
        System.out.println();
    }
}
