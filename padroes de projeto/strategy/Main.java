// Classe Main para simulação
public class Main {
    public static void main(String[] args) {
        RoutePlanner planner = new RoutePlanner();

        planner.setStrategy(new FastestRouteStrategy());
        System.out.println("Mais Rapida: " + planner.planRoute("Av. Paulista", "USP"));

        planner.setStrategy(new ShortestRouteStrategy());
        System.out.println("Mais Curta: " + planner.planRoute("Av. Paulista", "USP"));

        planner.setStrategy(new CheapestRouteStrategy());
        System.out.println("Mais Economica: " + planner.planRoute("Av. Paulista", "USP"));

        planner.setStrategy(new EcoFriendlyStrategy());
        System.out.println("Mais Ecologica: " + planner.planRoute("Av. Paulista", "USP"));
    }
}