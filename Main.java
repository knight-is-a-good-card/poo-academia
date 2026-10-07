// Academia

public class Main {
    public static void main(String[] args) {
        Cliente Maria = new Cliente("Maria", "(55)65783");
        Cliente Eduarda = new Cliente("Eduarda", "(55)37682");
        Cliente Merlin = new Cliente("Merlin", "(55)32285");
        Cliente Rafael = new Cliente("Rafael", "(55)84673");

        Plano plano_1 = new Plano("Mensal", Maria);
        Plano plano_2 = new Plano("Anual", Rafael);
        Plano plano_3 = new Plano("Semanal", Merlin);
        Plano plano_4 = new Plano("Mensal", Eduarda);


        Treino treino_1 = new Treino("biceps", "biceps");
        Treino treino_2 = new Treino("peito", "peito");
        Treino treino_3 = new Treino("perna", "perna");
        Treino treino_4 = new Treino("triceps", "triceps");
    

        Maria.exibirDados();
        Eduarda.exibirDados();
        Merlin.exibirDados();
        Rafael.exibirDados();

        plano_1.exibirDados();
        plano_2.exibirDados();
        plano_3.exibirDados();
        plano_4.exibirDados();

        treino_1.exibirTitulo();
        treino_2.exibirTitulo();
        treino_3.exibirTitulo();
        treino_4.exibirTitulo();

        System.out.println("Foco: " + treino_1.getFoco());
    }
}

