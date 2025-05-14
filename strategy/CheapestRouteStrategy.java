// Estratégia: Mais Econômica
public class CheapestRouteStrategy implements RouteStrategy {
    public Route calculateRoute(String origem, String destino) {
        float distancia = DistanciaUtils.calcularDistancia(origem, destino) * 1.4f;
        float tempo = distancia / 60.0f * 105; // suponha 60 km/h
        float custo = distancia * 0.4f;
        float co2 = distancia * 0.28f;
        return new Route(tempo, distancia, custo, co2);
    }
}