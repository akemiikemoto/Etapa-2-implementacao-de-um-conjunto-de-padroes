public class DistanciaUtils {
    public static float calcularDistancia(String origem, String destino) {
        // Simulação simples de distância entre pontos
        if (origem.equalsIgnoreCase(destino)) {
            return 1.0f;
        }
        return 12.0f; // valor fictício
    }
}
