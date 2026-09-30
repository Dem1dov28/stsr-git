public class HealthCheck {
    public static boolean isAlive(ServiceNode node) {
        return node.getName() != null && node.getPort() > 0;
    }

    public static String message(ServiceNode node) {
        if (isAlive(node)) {
            return node.getName() + ":" + node.getPort() + " доступен";
        }
        return "узел недоступен";
    }
}
