package test_program;

public class SupportHandlerMain {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        // Set up the chain
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        // Example requests
        level1.handleRequest("Password reset", "Low");
        level1.handleRequest("System outage", "High");
        level1.handleRequest("Database performance issue", "Medium");
        level1.handleRequest("Unknown request", "Critical");
    }
}
