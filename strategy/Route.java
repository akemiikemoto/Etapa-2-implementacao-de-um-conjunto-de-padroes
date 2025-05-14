public class Route {
    private float tempo;
    private float distancia;
    private float custo;
    private float co2;

    public Route(float tempo, float distancia, float custo, float co2) {
        this.tempo = tempo;
        this.distancia = distancia;
        this.custo = custo;
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return String.format("Tempo: %.2f min, Distancia: %.2f km, Custo: R$ %.2f, Emissao CO2: %.2f kg",
                tempo, distancia, custo, co2);
    }
}