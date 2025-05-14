// Estratégia: Mais Ecológica
public class EcoFriendlyStrategy implements RouteStrategy {
    public Route calculateRoute(String origem, String destino) {
        //return new Route(18.0f, 9.0f, 6.0f, 1.2f);
        float distancia = DistanciaUtils.calcularDistancia(origem, destino) *1.3f;
        float tempo = distancia / 60.0f * 85; // suponha 60 km/h
        float custo = distancia * 0.65f;
        float co2 = distancia * 0.15f;
        return new Route(tempo, distancia, custo, co2);
    }
}