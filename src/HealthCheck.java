public class HealthCheck {
    public static boolean isAlive(ServiceNode node) {
        return node.getName() != null && node.getPort() > 0;
    }
}
