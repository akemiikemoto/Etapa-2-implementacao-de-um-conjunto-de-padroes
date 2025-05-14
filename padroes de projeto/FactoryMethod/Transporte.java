public class Transporte {
    private String nome;
    private String modoTrasnporte;

    public Receita(String nome, String modoTrasnporte) {
        this.nome = nome;
        this.modoTrasnporte = modoTrasnporte;
    }

    public void preparar() {
        System.out.println("Preparando " + nome + ": " + modoTrasnporte);
    }
}


