// Estratégia: Mais Rápida
public class FastestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origem, String destino) {
        float distancia = DistanciaUtils.calcularDistancia(origem, destino) * 1.2f;
        float tempo = distancia / 60.0f * 70; // suponha 60 km/h
        float custo = distancia * 0.5f;
        float co2 = distancia * 0.2f;
        return new Route(tempo, distancia, custo, co2);
    }
}


