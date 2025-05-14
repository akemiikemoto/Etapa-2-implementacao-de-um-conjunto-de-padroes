// Estratégia: Mais Curta
public class ShortestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origem, String destino) {
        float distancia = DistanciaUtils.calcularDistancia(origem, destino)*1.1f;
        float tempo = distancia / 60.0f * 100; // suponha 60 km/h
        float custo = distancia * 0.7f;
        float co2 = distancia * 0.25f;
        return new Route(tempo, distancia, custo, co2);
    }
}