// Classe RoutePlanner
public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public Route planRoute(String origem, String destino) {
        if (strategy == null) throw new IllegalStateException("Estrategia nao definida.");
        return strategy.calculateRoute(origem, destino);
    }
}